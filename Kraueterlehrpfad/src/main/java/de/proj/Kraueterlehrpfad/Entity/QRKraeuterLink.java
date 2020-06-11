package de.proj.Kraueterlehrpfad.Entity;


import de.proj.Kraueterlehrpfad.ID.QRKraeuterLinkID;

import javax.persistence.*;

@Entity
@Table(name = "qr_kraut_link")
@IdClass(QRKraeuterLinkID.class)

public class QRKraeuterLink {
<<<<<<< Updated upstream


//   @Id
//    private Integer qr_id;
//   @Id
//    private Integer kraeuter_id;

    @ManyToOne
    @JoinColumn(name = "qr_id")
    private QRCode qrCode;

    @ManyToOne
=======
    @EmbeddedId
    private QRKraeuterLinkID qrKraeuterLinkID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="qr_id")
    private QRCode qrCode;

    @ManyToOne(fetch = FetchType.LAZY)
>>>>>>> Stashed changes
    @JoinColumn(name = "kraeuter_id")
    private Kraut kraut;

    public QRKraeuterLink() {

    }

<<<<<<< Updated upstream
=======
    public QRKraeuterLink(QRKraeuterLinkID qrKraeuterLinkID, QRCode qrCode, Kraut kraut) {
        this.qrKraeuterLinkID = qrKraeuterLinkID;
        this.qrCode = qrCode;
        this.kraut = kraut;
    }

>>>>>>> Stashed changes
    public QRCode getQrCode() {
        return qrCode;
    }

    public void setQrCode(QRCode qrCode) {
        this.qrCode = qrCode;
    }

    public Kraut getKraut() {
        return kraut;
    }

    public void setKraut(Kraut kraut) {
        this.kraut = kraut;
    }
<<<<<<< Updated upstream
//      public QRKraeuterLink(Integer qr_id, Integer kraeuter_id) {
//        this.qr_id = qr_id;
//        this.kraeuter_id = kraeuter_id;
//    }
//
//    public Integer getQr_id() {
//        return qr_id;
//    }
//
//    public void setQr_id(Integer qr_id) {
//        this.qr_id = qr_id;
//    }
//
//    public Integer getKraeuter_id() {
//        return kraeuter_id;
//    }
//
//    public void setKraeuter_id(Integer kraeuter_id) {
//        this.kraeuter_id = kraeuter_id;
//    }
=======

    public QRKraeuterLinkID getQrKraeuterLinkID() {
        return qrKraeuterLinkID;
    }

    public void setQrKraeuterLinkID(QRKraeuterLinkID qrKraeuterLinkID) {
        this.qrKraeuterLinkID = qrKraeuterLinkID;
    }
>>>>>>> Stashed changes
}
