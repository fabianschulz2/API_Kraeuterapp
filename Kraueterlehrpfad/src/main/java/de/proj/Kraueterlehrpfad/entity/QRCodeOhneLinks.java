package de.proj.Kraueterlehrpfad.entity;


import javax.persistence.*;

@Entity
@Table(name = "qr_code")
public class QRCodeOhneLinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qr_id")
    private Integer qrId;

    @Column(name = "reben_id")
    private Integer rebenId;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    public QRCodeOhneLinks() {
    }

    public QRCodeOhneLinks(Integer qrId, Integer rebenId, String identifier, Double latitude, Double longitude) {
        this.qrId = qrId;
        this.rebenId = rebenId;
        this.identifier = identifier;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getRebenId() {
        return rebenId;
    }

    public void setRebenId(Integer rebenId) {
        this.rebenId = rebenId;
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
