package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.QRCode;
import de.proj.Kraueterlehrpfad.Entity.Rebe;
import de.proj.Kraueterlehrpfad.repository.RebeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class RebeController {

    @Autowired
    RebeRepository rebeRepository;


    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/reben/{id}"
    )
    public void deleteRebe(@PathVariable("id") Integer id) {

        //holt sich alle foreign keys und setzt sie null
        Rebe rebe = rebeRepository.findById(id).get();
        Set<QRCode> qrCodeSet = rebe.getQrCodeSet();
        qrCodeSet.forEach(qrCode -> qrCode.setRebe(null));

        //loescht rebe, auf die es jetzt keine verweise mehr gibe
        rebeRepository.deleteById(id);
    }

}
