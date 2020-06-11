package de.proj.Kraueterlehrpfad.ID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class QRKraeuterLinkID implements Serializable {
    @Column( name="qr_id" )
    private int qr_id;
    @Column( name= "kraeuter_id" )
    private int kraeuter_id;

    public QRKraeuterLinkID(){

    }
    public QRKraeuterLinkID(int qr_id, int kraeuter_id) {
        this.qr_id = qr_id;
        this.kraeuter_id = kraeuter_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QRKraeuterLinkID that = (QRKraeuterLinkID) o;
        return qr_id == that.qr_id &&
                kraeuter_id == that.kraeuter_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(qr_id, kraeuter_id);
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
