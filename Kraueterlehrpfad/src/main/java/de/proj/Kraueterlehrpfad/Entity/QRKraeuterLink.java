package de.proj.Kraueterlehrpfad.Entity;


import de.proj.Kraueterlehrpfad.ID.QRKraeuterLinkID;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "qr_kraut_link")
@IdClass(QRKraeuterLinkID.class)

public class QRKraeuterLink {


    @Id
    Integer qr_id;
    @Id
    Integer kraeuter_id;

    public QRKraeuterLink() {

    }

    public QRKraeuterLink(int qr_id, int kraeuter_id) {
        this.qr_id = qr_id;
        this.kraeuter_id = kraeuter_id;
    }

    public int getQr_id() {
        return qr_id;
    }

    public void setQr_id(int qr_id) {
        this.qr_id = qr_id;
    }

    public int getKraeuter_id() {
        return kraeuter_id;
    }

    public void setKraeuter_id(int kraeuter_id) {
        this.kraeuter_id = kraeuter_id;
    }
}
