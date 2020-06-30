package de.proj.Kraueterlehrpfad.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "qr_kraut_link")

public class QRKraeuterLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer qr_link_id;

    @JoinColumn(name = "qr_id_fk")
    @ManyToOne
    @JsonBackReference
    private QRCode qrCode;


    @JoinColumn(name = "kraeuter_id_fk")
    @ManyToOne
    //@JsonManagedReference
    private Kraut kraut;

    public QRKraeuterLink() {

    }

    public QRKraeuterLink(Integer qr_link_id, QRCode qrCode, Kraut kraut) {
        this.qr_link_id = qr_link_id;
        this.qrCode = qrCode;
        this.kraut = kraut;
    }

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

    public Integer getQr_link_id() {
        return qr_link_id;
    }

    public void setQr_link_id(Integer qr_link_id) {
        this.qr_link_id = qr_link_id;
    }
}
