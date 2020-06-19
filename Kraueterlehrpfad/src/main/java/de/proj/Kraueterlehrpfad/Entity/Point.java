package de.proj.Kraueterlehrpfad.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "point")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_id")
    private Integer pointId;
    @Column(name = "longitude")
    private Integer longitude;
    @Column(name = "latitude")
    private Integer latitude;

    @JoinColumn(name = "rout_id")
    @ManyToOne
    @JsonBackReference
    private Route route;

    public Point(){

    }

    public Point(Integer pointId, Integer longitude, Integer latitude, Route route) {
        this.pointId = pointId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.route = route;
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
