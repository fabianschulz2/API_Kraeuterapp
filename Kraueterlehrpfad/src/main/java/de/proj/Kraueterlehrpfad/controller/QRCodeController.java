package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.QRCode;
import de.proj.Kraueterlehrpfad.repository.QRCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QRCodeController {

    @Autowired
    QRCodeRepository qrCodeRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/qr-kraeuter-rebe-links",
            produces =  MediaType.APPLICATION_JSON_VALUE
    )
    public List<QRCode> getQRCodesLinks(){
        List<QRCode> qrCodeList = qrCodeRepository.findAll();
        return qrCodeList;
    }

    //ein qr code by id mit allen Verlinkungen
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/qr-kraeuter-rebe-links/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public QRCode getQRKraeuterLinks(@PathVariable("id") Integer id){
        QRCode qrCode = qrCodeRepository.findById(id).get();
        return qrCode;
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/qr-kraeuter-rebe-links",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public QRCode postQrCode(@RequestBody QRCode qrCode){
        QRCode returnQrCode = qrCodeRepository.save(qrCode);
        return returnQrCode;
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/qrcodes/{id}"
    )
    public void deleteKraut(@PathVariable("id") Integer id) {
        qrCodeRepository.deleteById(id);
    }

}
