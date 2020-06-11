package de.proj.Kraueterlehrpfad.Entity;


import de.proj.Kraueterlehrpfad.ID.QRKraeuterLinkID;

import javax.persistence.*;

@Entity
@Table(name = "qr_kraut_link")

public class QRKraeuterLink {


    @EmbeddedId
    private QRKraeuterLinkID qrKraeuterLinkID;

    //JoinColumns?
//    @JoinColumn(name="qr_id")
//    @ManyToOne
//    private QRCode qrCode;
//
//
//    @JoinColumn(name = "kraeuter_id")
//    @ManyToOne
//    private Kraut kraut;

    public QRKraeuterLink() {

    }

    public QRKraeuterLink(QRKraeuterLinkID qrKraeuterLinkID/*, QRCode qrCode, Kraut kraut*/) {
        this.qrKraeuterLinkID = qrKraeuterLinkID;
//        this.qrCode = qrCode;
//        this.kraut = kraut;
    }

//    public QRCode getQrCode() {
//        return qrCode;
//    }
//
//    public void setQrCode(QRCode qrCode) {
//        this.qrCode = qrCode;
//    }
//
//    public Kraut getKraut() {
//        return kraut;
//    }
//
//    public void setKraut(Kraut kraut) {
//        this.kraut = kraut;
//    }

    public QRKraeuterLinkID getQrKraeuterLinkID() {
        return qrKraeuterLinkID;
    }

    public void setQrKraeuterLinkID(QRKraeuterLinkID qrKraeuterLinkID) {
        this.qrKraeuterLinkID = qrKraeuterLinkID;
    }
}
