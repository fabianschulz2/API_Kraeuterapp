package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.entity.QRKraeuterLinkOhneLinks;
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
        QRKraeuterLinkOhneLinks updateLink = qrKraeuterLinkOhneLinksRebository.getOne(link.getQrLinkId());
        updateLink.setKraeuterIdFk(link.getKraeuterIdFk());
        updateLink.setQrIdFk(link.getQrIdFk());
        updateLink.setQrLinkId(link.getQrLinkId());
        return qrKraeuterLinkOhneLinksRebository.saveAndFlush(updateLink);
    }

}
