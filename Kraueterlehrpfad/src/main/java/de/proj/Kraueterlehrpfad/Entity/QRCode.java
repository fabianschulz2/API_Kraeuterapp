package de.proj.Kraueterlehrpfad.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "qr_code")

public class QRCode {
    //verlinkungen ohne Daten
//    @Column(name="reben_id", updatable = false, insertable=false)
//    private int rebenId;

    private String identifier;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer qr_id;

    //Verlinkungen mit Daten
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "reben_id")
    private Rebe rebe;


    @OneToMany(mappedBy = "qrCode")
    @JsonManagedReference
    private Set<QRKraeuterLink> qrKraeuterLinkSet;

    public QRCode() {

    }

    public QRCode(Integer qr_id, String identifier/*, Integer rebenId*/) {
        this.qr_id = qr_id;
        this.identifier = identifier;
//        this.rebenId = rebenId;
    }

    public Set<QRKraeuterLink> getQrKraeuterLinkSet() {
        return qrKraeuterLinkSet;
    }

    public void setQrKraeuterLinkSet(Set<QRKraeuterLink> qrKraeuterLinkSet) {
        this.qrKraeuterLinkSet = qrKraeuterLinkSet;
    }

//    public int getRebenId() {
//        return rebenId;
//    }
//
//    public void setRebenId(int rebenId) {
//        this.rebenId = rebenId;
//    }

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
