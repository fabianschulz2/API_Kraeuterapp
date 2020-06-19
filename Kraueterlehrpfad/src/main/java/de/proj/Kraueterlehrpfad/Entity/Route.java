package de.proj.Kraueterlehrpfad.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
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
    @OneToMany(mappedBy = "route", orphanRemoval = true, cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private Set<Point> pointSet;

    public Route(){

    }

    public Route(Integer routeId, String name, Set<Point> pointSet) {
        this.routeId = routeId;
        this.name = name;
        this.pointSet = pointSet;
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

    public Set<Point> getPointSet() {
        return pointSet;
    }

    public void setPointSet(Set<Point> pointSet) {
        this.pointSet = pointSet;
    }
}
