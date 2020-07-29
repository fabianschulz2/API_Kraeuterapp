package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.entityx.QRCode;
import de.proj.Kraueterlehrpfad.entityx.Rebe;
import de.proj.Kraueterlehrpfad.repository.RebeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class RebeController {

    @Autowired
    RebeRepository rebeRepository;

    //Gebe alle Reben zurueck
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/reben",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Rebe> getReben(){
        List<Rebe> rebeList = rebeRepository.findAll();
        return rebeList;
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/reben",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )

    public Rebe postRebe(@RequestBody Rebe rebe){
        return rebeRepository.save(rebe);
    }

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
    @RequestMapping(
            method = RequestMethod.PUT,
            path = "/reben",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Rebe updateLink(@RequestBody Rebe rebe) {
        Rebe updateRebe = rebeRepository.getOne(rebe.getRebenId());
        updateRebe.setBodenpflege(rebe.getBodenpflege());
        updateRebe.setPflanzjahr(rebe.getPflanzjahr());
        updateRebe.setQrCodeSet(rebe.getQrCodeSet());
        updateRebe.setRebenId(rebe.getRebenId());
        updateRebe.setRebsorte(rebe.getRebsorte());
        updateRebe.setShopLink(rebe.getShopLink());
        updateRebe.setSorteneigenschaft(rebe.getSorteneigenschaft());
        updateRebe.setBodenpflege(rebe.getBodenpflege());
        updateRebe.setWeinlage(rebe.getWeinlage());
        updateRebe.setWissenswertes(rebe.getWissenswertes());
        return rebeRepository.saveAndFlush(updateRebe);
    }

}
