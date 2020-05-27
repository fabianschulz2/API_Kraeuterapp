package de.proj.Kraueterlehrpfad.Entity;

import com.sun.istack.NotNull;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;


import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name="Kraeuter")

public class Kraeuter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String latName;
    @NotNull
    private Map<String,String> eigenschaften= new HashMap<>();

    public Kraeuter(String name, String latName, Map<String, String> eigenschaften) {
        this.name = name;
        this.latName = latName;
        this.eigenschaften = eigenschaften;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatName() {
        return latName;
    }

    public void setLatName(String latName) {
        this.latName = latName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<String, String> getEigenschaften() {
        return eigenschaften;
    }

    public void setEigenschaften(Map<String, String> eigenschaften) {
        this.eigenschaften = eigenschaften;
    }
}