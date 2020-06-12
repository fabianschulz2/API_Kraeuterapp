package de.proj.Kraueterlehrpfad.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "qr_code")

public class QRCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer qr_id;
    @NonNull
    String identifier;

    @ManyToOne
    @JoinColumn(name = "reben_id")
    private Rebe rebe;


    @OneToMany(mappedBy = "qrCode")
    @JsonManagedReference
    private Set<QRKraeuterLink> qrKraeuterLinkSet;

    public QRCode() {

    }

    public QRCode(Integer qr_id, String identifier, Integer reben_id) {
        this.qr_id = qr_id;
        this.identifier = identifier;
        //this.reben_id = reben_id;
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


}
