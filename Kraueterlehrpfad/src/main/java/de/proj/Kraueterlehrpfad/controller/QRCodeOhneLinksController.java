package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.entityx.QRCodeOhneLinks;
import de.proj.Kraueterlehrpfad.repository.QRCodeOhneLinksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QRCodeOhneLinksController {
    @Autowired
    QRCodeOhneLinksRepository qrCodeRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/qrcodes",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<QRCodeOhneLinks> getQRCodes() {
        List<QRCodeOhneLinks> qrCodeList = qrCodeRepository.findAll();
        return qrCodeList;
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/qrcodes",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public QRCodeOhneLinks saveQRCode(@RequestBody QRCodeOhneLinks qrCode) {
        return qrCodeRepository.save(qrCode);
    }


    @RequestMapping(
            method = RequestMethod.PUT,
            path = "/qrcodes",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public QRCodeOhneLinks updateQRCode(@RequestBody QRCodeOhneLinks qrCode) {
        QRCodeOhneLinks updateQrCode = qrCodeRepository.getOne(qrCode.getQrId());
        updateQrCode.setIdentifier(qrCode.getIdentifier());
        updateQrCode.setQrId(qrCode.getQrId());
        updateQrCode.setRebenId(qrCode.getRebenId());
        updateQrCode.setLatitude(qrCode.getLatitude());
        updateQrCode.setLongitude(qrCode.getLongitude());
        return qrCodeRepository.saveAndFlush(updateQrCode);
    }

}
