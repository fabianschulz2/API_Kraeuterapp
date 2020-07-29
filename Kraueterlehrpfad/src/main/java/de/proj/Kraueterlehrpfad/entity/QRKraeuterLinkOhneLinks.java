package de.proj.Kraueterlehrpfad.entity;


import javax.persistence.*;

@Entity
@Table(name = "qr_kraut_link")
public class QRKraeuterLinkOhneLinks {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qr_link_id")
    private Integer qrLinkId;
    @Column(name = "qr_id_fk")
    private Integer qrIdFk;
    @Column(name = "kraeuter_id_fk")
    private Integer kraeuterIdFk;


    public QRKraeuterLinkOhneLinks() {

    }

    public QRKraeuterLinkOhneLinks(Integer qrLinkId, Integer qrIdFk, Integer kraeuterIdFk) {
        this.qrLinkId = qrLinkId;
        this.qrIdFk = qrIdFk;
        this.kraeuterIdFk = kraeuterIdFk;
    }

    public Integer getQrLinkId() {
        return qrLinkId;
    }

    public void setQrLinkId(Integer qrLinkId) {
        this.qrLinkId = qrLinkId;
    }

    public Integer getQrIdFk() {
        return qrIdFk;
    }

    public void setQrIdFk(Integer qrIdFk) {
        this.qrIdFk = qrIdFk;
    }

    public Integer getKraeuterIdFk() {
        return kraeuterIdFk;
    }

    public void setKraeuterIdFk(Integer kraeuterIdFk) {
        this.kraeuterIdFk = kraeuterIdFk;
    }
}
