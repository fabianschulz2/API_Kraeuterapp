package de.proj.Kraueterlehrpfad.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "qr_code")

public class QRCode {

    private String identifier;

    @Column(name = "lat")
    private Double latitude;

    @Column(name = "long")
    private Double longitude;

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

    public QRCode(String identifier, Double latitude, Double longitude, Integer qr_id) {
        this.identifier = identifier;
        this.latitude = latitude;
        this.longitude = longitude;
        this.qr_id = qr_id;
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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
