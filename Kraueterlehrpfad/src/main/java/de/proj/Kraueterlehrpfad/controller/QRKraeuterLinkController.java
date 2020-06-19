package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.QRKraeuterLink;
import de.proj.Kraueterlehrpfad.repository.QRKraeuterLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/links/{id}"
    )
    public void deleteKraut(@PathVariable("id") Integer id) {
        qrKraeuterLinkRepository.deleteById(id);
    }

}
