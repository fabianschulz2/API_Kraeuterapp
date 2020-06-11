package de.proj.Kraueterlehrpfad.ID;

<<<<<<< Updated upstream
=======
import javax.persistence.Column;
import javax.persistence.Embeddable;
>>>>>>> Stashed changes
import java.io.Serializable;
import java.util.Objects;

public class QRKraeuterLinkID implements Serializable {
    @Column(name="qr_id")
    private Integer qr_id;
    @Column(name="kraeuter")
    private Integer kraeuter_id;

    public QRKraeuterLinkID(){

    }
    public QRKraeuterLinkID(Integer qr_id, Integer kraeuter_id) {
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
