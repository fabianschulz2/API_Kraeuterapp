package de.proj.Kraueterlehrpfad.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "qr_code")

public class QRCode {

    private String identifier;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer qr_id;

    //Verlinkungen mit Daten
    @ManyToOne
    //@JsonManagedReference
    @JoinColumn(name = "reben_id")
    private Rebe rebe;


    @OneToMany(mappedBy = "qrCode", orphanRemoval = true, cascade = CascadeType.REMOVE)
    //@JsonManagedReference
    private Set<QRKraeuterLink> qrKraeuterLinkSet;

    public QRCode() {

    }

    public QRCode(Integer qr_id, String identifier) {
        this.qr_id = qr_id;
        this.identifier = identifier;
    }

    public Set<QRKraeuterLink> getQrKraeuterLinkSet() {
        return qrKraeuterLinkSet;
    }

    public void setQrKraeuterLinkSet(Set<QRKraeuterLink> qrKraeuterLinkSet) {
        this.qrKraeuterLinkSet = qrKraeuterLinkSet;
    }

    public Rebe getRebe() {
        return rebe;
    }

    public void setRebe(Rebe rebe) {
        this.rebe = rebe;
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
