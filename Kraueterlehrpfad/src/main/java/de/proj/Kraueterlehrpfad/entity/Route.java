package de.proj.Kraueterlehrpfad.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "routs")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rout_id")
    private Integer routeId;
    @Column(name = "name")
    private String name;

    //diese annotation wird benoetigt um vor loeschen der route alle punkte zu loeschen
    @OneToMany(mappedBy = "route", orphanRemoval = true, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Point> pointList;


    public Route() {

    }

    public Route(Integer routeId, String name, List<Point> pointList) {
        this.routeId = routeId;
        this.name = name;
        this.pointList = pointList;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }
}
