package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.QRCodeOhneLinks;
import de.proj.Kraueterlehrpfad.Entity.QRKraeuterLinkOhneLinks;
import de.proj.Kraueterlehrpfad.repository.QRKraeuterLinkOhneLinksRebository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class QRKrauterLinkOhneLinksController {
    @Autowired
    QRKraeuterLinkOhneLinksRebository qrKraeuterLinkOhneLinksRebository;

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/links",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public QRKraeuterLinkOhneLinks postQRKraeuterLink(@RequestBody QRKraeuterLinkOhneLinks qrKraeuterLinkOhneLinks) {
        return qrKraeuterLinkOhneLinksRebository.save(qrKraeuterLinkOhneLinks);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            path = "/links",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public QRKraeuterLinkOhneLinks updateLink(@RequestBody QRKraeuterLinkOhneLinks link) {
        QRKraeuterLinkOhneLinks updateLink = qrKraeuterLinkOhneLinksRebository.getOne(link.getQr_link_id());
        updateLink.setKraeuter_id_fk(link.getKraeuter_id_fk());
        updateLink.setQr_id_fk(link.getQr_id_fk());
        updateLink.setQr_link_id(link.getQr_link_id());
        return qrKraeuterLinkOhneLinksRebository.saveAndFlush(updateLink);
    }

}
