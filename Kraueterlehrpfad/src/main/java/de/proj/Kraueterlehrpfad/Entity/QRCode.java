package de.proj.Kraueterlehrpfad.Entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "qr_code")

public class QRCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer qr_id;
    @NonNull
    private String identifier;
    //foreign key
    private Integer reben_id;

    public QRCode() {

    }

    public QRCode(Integer qr_id, @NonNull String identifier, Integer reben_id) {
        this.qr_id = qr_id;
        this.identifier = identifier;
        this.reben_id = reben_id;
    }

    public Integer getQr_id() {
        return qr_id;
    }

    public void setQr_id(Integer qr_id) {
        this.qr_id = qr_id;
    }

    @NonNull
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(@NonNull String identifier) {
        this.identifier = identifier;
    }

    public Integer getReben_id() {
        return reben_id;
    }

    public void setReben_id(Integer reben_id) {
        this.reben_id = reben_id;
    }
}