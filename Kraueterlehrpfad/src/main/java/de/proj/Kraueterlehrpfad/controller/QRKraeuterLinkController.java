package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.Kraut;
import de.proj.Kraueterlehrpfad.Entity.QRKraeuterLink;
import de.proj.Kraueterlehrpfad.repository.QRKraeuterLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QRKraeuterLinkController {

    @Autowired
    QRKraeuterLinkRepository qrKraeuterLinkRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/links",
            produces = MediaType.APPLICATION_JSON_VALUE)

    public List<QRKraeuterLink> getQRKraeuterLink() {
        List<QRKraeuterLink> linkList = qrKraeuterLinkRepository.findAll();
        return linkList;
    }

//    @RequestMapping(
//            method = RequestMethod.GET,
//            path = "/kraeuterlinks",
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Kraut> getKrautLinks(){
//        List<QRKraeuterLink> qrKraeuterLinkList = qrKraeuterLinkRepository.findAll();
//        List<Kraut> krautList = new ArrayList<>();
//        qrKraeuterLinkList.forEach(qrKraeuterLink -> krautList.add(qrKraeuterLink.getKaut()));
//    }
}
