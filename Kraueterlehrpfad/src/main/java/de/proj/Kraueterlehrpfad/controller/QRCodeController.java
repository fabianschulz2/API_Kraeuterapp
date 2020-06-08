package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.QRCode;
import de.proj.Kraueterlehrpfad.repository.QRCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


}
