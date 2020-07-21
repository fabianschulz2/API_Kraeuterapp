package de.proj.Kraueterlehrpfad.Entity;


import javax.persistence.*;

@Entity
@Table(name = "qr_code")
public class QRCodeOhneLinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qr_id")
    private Integer qrId;

    @Column(name = "reben_id")
    private Integer reben_id;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "lat")
    private Double latitude;

    @Column(name = "long")
    private Double longitude;

    public QRCodeOhneLinks() {
    }

    public QRCodeOhneLinks(Integer qr_id, Integer reben_id, String identifier, Double latitude, Double longitude) {
        this.qrId = qr_id;
        this.reben_id = reben_id;
        this.identifier = identifier;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getReben_id() {
        return reben_id;
    }

    public void setReben_id(Integer reben_id) {
        this.reben_id = reben_id;
    }

    public Integer getQrId() {
        return qrId;
    }

    public void setQrId(Integer qrId) {
        this.qrId = qrId;
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
