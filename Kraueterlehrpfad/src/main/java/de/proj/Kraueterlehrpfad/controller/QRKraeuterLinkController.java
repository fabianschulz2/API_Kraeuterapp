package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.entity.Kraut;
import de.proj.Kraueterlehrpfad.entity.QRCode;
import de.proj.Kraueterlehrpfad.entity.QRKraeuterLink;
import de.proj.Kraueterlehrpfad.repository.KrautRepository;
import de.proj.Kraueterlehrpfad.repository.QRCodeRepository;
import de.proj.Kraueterlehrpfad.repository.QRKraeuterLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QRKraeuterLinkController {

    @Autowired
    QRKraeuterLinkRepository qrKraeuterLinkRepository;

    @Autowired
    QRCodeRepository qrCodeRepository;

    @Autowired
    KrautRepository krautRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/links",
            produces = MediaType.APPLICATION_JSON_VALUE)

    public List<QRKraeuterLink> getQRKraeuterLink() {
        List<QRKraeuterLink> linkList = qrKraeuterLinkRepository.findAll();
        return linkList;
    }
    @RequestMapping(
            method = RequestMethod.POST,
            path = "/links/{qrId}/{krautId}/",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public QRKraeuterLink postQRKraeuterLink(@PathVariable (value = "qrId") Integer qrId, @PathVariable (value = "krautId") Integer krautId ,@RequestBody QRKraeuterLink qrKraeuterLink){
        QRKraeuterLink x = new QRKraeuterLink();
        Kraut kraut = krautRepository.findById(krautId).get();
        QRCode qrCode = qrCodeRepository.findById(qrId).get();
        x.setKraut(kraut);
        x.setQrCode(qrCode);
        return qrKraeuterLinkRepository.save(x);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/links/{id}"
    )
    public void deleteKraut(@PathVariable("id") Integer id) {
        qrKraeuterLinkRepository.deleteById(id);
    }

}
