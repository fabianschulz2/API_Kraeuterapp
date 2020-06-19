package de.proj.Kraueterlehrpfad.Entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "point")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer point_id;
    @NonNull
    private Integer longitude;
    @NonNull
    private Integer latitude;
    @NonNull
    private Integer rout_id;

    @ManyToOne
    @JoinColumn(name ="rout_id", insertable = false, updatable = false)
    private Routs routs;

    public Point() {
    }

    public Point(Integer point_id, @NonNull Integer longitude, @NonNull Integer latitude, @NonNull Integer rout_id, Routs routs) {
        this.point_id = point_id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.rout_id = rout_id;
        this.routs = routs;
    }

    public Integer getPoint_id() {
        return point_id;
    }

    public void setPoint_id(Integer point_id) {
        this.point_id = point_id;
    }

    @NonNull
    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(@NonNull Integer longitude) {
        this.longitude = longitude;
    }

    @NonNull
    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(@NonNull Integer latitude) {
        this.latitude = latitude;
    }

    @NonNull
    public Integer getRout_id() {
        return rout_id;
    }

    public void setRout_id(@NonNull Integer rout_id) {
        this.rout_id = rout_id;
    }

    public Routs getRouts() {
        return routs;
    }

    public void setRout(Routs routs) {
        this.routs = routs;
    }
}
