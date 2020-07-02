package de.proj.Kraueterlehrpfad.Entity;


import javax.persistence.*;

@Entity
@Table(name = "qr_code")
public class QRCodeOhneLinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer qr_id;
    private Integer reben_id;
    private String identifier;

    public QRCodeOhneLinks() {
    }

    public QRCodeOhneLinks(Integer qr_id, Integer reben_id, String identifier) {
        this.qr_id = qr_id;
        this.reben_id = reben_id;
        this.identifier = identifier;
    }

    public Integer getReben_id() {
        return reben_id;
    }

    public void setReben_id(Integer reben_id) {
        this.reben_id = reben_id;
    }

    public Integer getQr_id() {
        return qr_id;
    }

    public void setQr_id(Integer qr_id) {
        this.qr_id = qr_id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }




}
