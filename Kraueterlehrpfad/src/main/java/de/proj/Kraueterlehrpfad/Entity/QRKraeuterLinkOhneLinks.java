package de.proj.Kraueterlehrpfad.Entity;


import javax.persistence.*;
@Entity
@Table(name = "qr_kraut_link")
public class QRKraeuterLinkOhneLinks {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer qr_link_id;

        private Integer qr_id_fk;
        private Integer kraeuter_id_fk;



        public QRKraeuterLinkOhneLinks() {

        }

    public QRKraeuterLinkOhneLinks(Integer qr_link_id, Integer qr_id_fk, Integer kraeuter_id_fk) {
        this.qr_link_id = qr_link_id;
        this.qr_id_fk = qr_id_fk;
        this.kraeuter_id_fk = kraeuter_id_fk;
    }

    public Integer getQr_link_id() {
        return qr_link_id;
    }

    public void setQr_link_id(Integer qr_link_id) {
        this.qr_link_id = qr_link_id;
    }

    public Integer getQr_id_fk() {
        return qr_id_fk;
    }

    public void setQr_id_fk(Integer qr_id_fk) {
        this.qr_id_fk = qr_id_fk;
    }

    public Integer getKraeuter_id_fk() {
        return kraeuter_id_fk;
    }

    public void setKraeuter_id_fk(Integer kraeuter_id_fk) {
        this.kraeuter_id_fk = kraeuter_id_fk;
    }
}
