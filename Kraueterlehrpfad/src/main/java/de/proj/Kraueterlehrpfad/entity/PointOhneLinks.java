package de.proj.Kraueterlehrpfad.entity;

import javax.persistence.*;

@Entity
@Table(name = "point")
public class PointOhneLinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_id")
    private Integer pointId;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "rout_id")
    private Integer routId;

    public PointOhneLinks(Integer pointId, Double longitude, Double latitude, Integer routeId) {
        this.pointId = pointId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.routId = routeId;
    }

    public PointOhneLinks() {
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getRoutId() {
        return routId;
    }

    public void setRoutId(Integer routId) {
        this.routId = routId;
    }
}


