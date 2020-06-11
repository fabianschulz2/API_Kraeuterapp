package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.Kraut;
import de.proj.Kraueterlehrpfad.Entity.QRCode;
import de.proj.Kraueterlehrpfad.Entity.QRKraeuterLink;
import de.proj.Kraueterlehrpfad.Entity.Rebe;
import de.proj.Kraueterlehrpfad.repository.QRCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class QRCodeController {

    @Autowired
    QRCodeRepository qrCodeRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/qrcodes",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<QRCode> getQRCodes() {
        List<QRCode> qrCodeList = qrCodeRepository.findAll();
        return qrCodeList;
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/qrcodes",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public  QRCode saveQRCode(@RequestBody QRCode qrCode){
        return qrCodeRepository.save(qrCode); // gibt er die id zurueck?
    }


    // Rebe zum QR-Code
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/qr-reben-links/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Rebe getQRCodeLinks(@PathVariable("id") Integer id){
        QRCode qrCode = qrCodeRepository.findById(id).get();
        Rebe rebe = qrCode.getRebe();
        return rebe;

    }

    //alle qr-codes mit reben
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/qr-reben-links",
            produces =  MediaType.APPLICATION_JSON_VALUE
    )
    public List<QRCode> getQRCodesLinks(){
        List<QRCode> qrCodeList = qrCodeRepository.findAll();
        return qrCodeList;
    }

    //alle verlinkten kraeuter ausgeben, von bestimmten qr-code
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/qr-kraeuter-links/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Set<QRKraeuterLink> getQRKraeuterLinks(@PathVariable("id") Integer id){
        QRCode qrCode = qrCodeRepository.findById(id).get();
        Set<QRKraeuterLink> qrKraeuterLinkSet = qrCode.getQrKraeuterLinkSet();
        Set<Kraut>  krautSet = new HashSet<Kraut>();
        qrKraeuterLinkSet.forEach(qrKraeuterLink -> krautSet.add(qrKraeuterLink.getKraut()));
        return qrKraeuterLinkSet;
//        List<Kraut> krautList = new ArrayList<>(krautSet);
//        return krautList;
//        return null;
    }

}
