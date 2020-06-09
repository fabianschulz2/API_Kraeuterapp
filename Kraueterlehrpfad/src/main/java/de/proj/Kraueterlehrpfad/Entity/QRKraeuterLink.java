package de.proj.Kraueterlehrpfad.Entity;


import de.proj.Kraueterlehrpfad.ID.QRKraeuterLinkID;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "qr_kraut_link")
@IdClass(QRKraeuterLinkID.class)

public class QRKraeuterLink {


    @Id
    private Integer qr_id;
    @Id
    private Integer kraeuter_id;

    public QRKraeuterLink() {

    }

    public QRKraeuterLink(Integer qr_id, Integer kraeuter_id) {
        this.qr_id = qr_id;
        this.kraeuter_id = kraeuter_id;
    }

    public Integer getQr_id() {
        return qr_id;
    }

    public void setQr_id(Integer qr_id) {
        this.qr_id = qr_id;
    }

    public Integer getKraeuter_id() {
        return kraeuter_id;
    }

    public void setKraeuter_id(Integer kraeuter_id) {
        this.kraeuter_id = kraeuter_id;
    }
}
