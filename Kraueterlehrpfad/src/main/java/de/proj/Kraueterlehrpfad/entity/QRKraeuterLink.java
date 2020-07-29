package de.proj.Kraueterlehrpfad.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Table(name = "qr_kraut_link")

public class QRKraeuterLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qr_link_id")
    Integer qrLinkId;

    @JoinColumn(name = "qr_id_fk")
    @ManyToOne
    @JsonBackReference
    @Immutable
    private QRCode qrCode;


    @JoinColumn(name = "kraeuter_id_fk")
    @ManyToOne
    // @JsonManagedReference
    private Kraut kraut;

    public QRKraeuterLink() {

    }

    public QRKraeuterLink(Integer qrLinkId, QRCode qrCode, Kraut kraut) {
        this.qrLinkId = qrLinkId;
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

    public Integer getQrLinkId() {
        return qrLinkId;
    }

    public void setQrLinkId(Integer qrLinkId) {
        this.qrLinkId = qrLinkId;
    }
}
