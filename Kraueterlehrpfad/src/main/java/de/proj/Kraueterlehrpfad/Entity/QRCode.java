package de.proj.Kraueterlehrpfad.Entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "qr_code")

public class QRCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer qr_id;
    @NonNull
    String identifier;
    //foreign key
    Integer reben_id;

    public QRCode() {

    }

    public QRCode(int qr_id, String identifier, int reben_id) {
        this.qr_id = qr_id;
        this.identifier = identifier;
        this.reben_id = reben_id;
    }

    public int getQr_id() {
        return qr_id;
    }

    public void setQr_id(int qr_id) {
        this.qr_id = qr_id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getReben_id() {
        return reben_id;
    }

    public void setReben_id(int reben_id) {
        this.reben_id = reben_id;
    }
}
