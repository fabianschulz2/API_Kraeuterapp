package de.proj.Kraueterlehrpfad.Entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "routs")
public class Routs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rout_id;

    @NonNull
    private String name;

    //diese annotation wird benoetigt um vor loeschen der route alle punkte zu loeschen
    @OneToMany(mappedBy = "routs", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Set<Point> pointSet;

    public Routs(Integer rout_id, @NonNull String name, Set<Point> pointSet) {
        this.rout_id = rout_id;
        this.name = name;
        this.pointSet = pointSet;
    }

    public Routs() {
    }

    public Integer getRout_id() {
        return rout_id;
    }

    public void setRout_id(Integer rout_id) {
        this.rout_id = rout_id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public Set<Point> getPointSet() {
        return pointSet;
    }

    public void setPointSet(Set<Point> pointSet) {
        this.pointSet = pointSet;
    }
}
