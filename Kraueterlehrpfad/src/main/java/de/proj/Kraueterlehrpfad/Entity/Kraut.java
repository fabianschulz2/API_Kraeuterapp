package de.proj.Kraueterlehrpfad.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "kraeuter")

public class Kraut {

    //Gleiche Bezeichner wie in DB

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer kraeuter_id;
    private String name;
    private String lateinischer_name;
    private String familie;
    private String wuchs;
    private String bluetenzeit;
    private String blueten;
    private String ausbreitung;
    private String vorkommen;
    private String samenreife;
    private String fruchtreife;
    private String fruechte;
    private String bestaeuber;
    private String insektenarten;
    private String schmetterlingsfutterpflanze;
    private String heilanwendung;
    private String inhaltsstoffe;
    private String verwendung_in_kueche;

    @OneToMany(mappedBy = "kraut", orphanRemoval = true, cascade = CascadeType.REMOVE)
    @JsonBackReference
    private Set<QRKraeuterLink> qrKraeuterLinkSet;


    public Kraut() {

    }

    public Kraut(Integer kraeuter_id, String name,  String lateinischer_name, String familie, String wuchs, String bluetenzeit, String blueten, String ausbreitung, String vorkommen, String samenreife, String fruchtreife, String fruechte, String bestaeuber, String insektenarten, String schmetterlingsfutterpflanze, String heilanwendung, String inhaltsstoffe, String verwendung_in_kueche, Set<QRKraeuterLink> qrKraeuterLinkSet) {
        this.kraeuter_id = kraeuter_id;
        this.name = name;
        this.lateinischer_name = lateinischer_name;
        this.familie = familie;
        this.wuchs = wuchs;
        this.bluetenzeit = bluetenzeit;
        this.blueten = blueten;
        this.ausbreitung = ausbreitung;
        this.vorkommen = vorkommen;
        this.samenreife = samenreife;
        this.fruchtreife = fruchtreife;
        this.fruechte = fruechte;
        this.bestaeuber = bestaeuber;
        this.insektenarten = insektenarten;
        this.schmetterlingsfutterpflanze = schmetterlingsfutterpflanze;
        this.heilanwendung = heilanwendung;
        this.inhaltsstoffe = inhaltsstoffe;
        this.verwendung_in_kueche = verwendung_in_kueche;
        this.qrKraeuterLinkSet = qrKraeuterLinkSet;
    }

    public String getVerwendung_in_kueche() {
        return verwendung_in_kueche;
    }

    public void setVerwendung_in_kueche(String verwendung_in_kueche) {
        this.verwendung_in_kueche = verwendung_in_kueche;
    }

    public String getBluetenzeit() {
        return bluetenzeit;
    }

    public void setBluetenzeit(String bluetenzeit) {
        this.bluetenzeit = bluetenzeit;
    }

    public String getSamenreife() {
        return samenreife;
    }

    public void setSamenreife(String samenreife) {
        this.samenreife = samenreife;
    }

    public String getFruchtreife() {
        return fruchtreife;
    }

    public void setFruchtreife(String fruchtreife) {
        this.fruchtreife = fruchtreife;
    }

    public Set<QRKraeuterLink> getQrKraeuterLinkSet() {
        return qrKraeuterLinkSet;
    }

    public void setQrKraeuterLinkSet(Set<QRKraeuterLink> qrKraeuterLinkSet) {
        this.qrKraeuterLinkSet = qrKraeuterLinkSet;
    }

    public Integer getKraeuter_id() {
        return kraeuter_id;
    }

    public void setKraeuter_id(Integer kraeuter_id) {
        this.kraeuter_id = kraeuter_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLateinischer_name() {
        return lateinischer_name;
    }

    public void setLateinischer_name(String lateinischer_name) {
        this.lateinischer_name = lateinischer_name;
    }

    public String getFamilie() {
        return familie;
    }

    public void setFamilie(String familie) {
        this.familie = familie;
    }

    public String getWuchs() {
        return wuchs;
    }

    public void setWuchs(String wuchs) {
        this.wuchs = wuchs;
    }


    public String getBlueten() {
        return blueten;
    }

    public void setBlueten(String blueten) {
        this.blueten = blueten;
    }

    public String getAusbreitung() {
        return ausbreitung;
    }

    public void setAusbreitung(String ausbreitung) {
        this.ausbreitung = ausbreitung;
    }

    public String getVorkommen() {
        return vorkommen;
    }

    public void setVorkommen(String vorkommen) {
        this.vorkommen = vorkommen;
    }


    public String getFruechte() {
        return fruechte;
    }

    public void setFruechte(String fruechte) {
        this.fruechte = fruechte;
    }

    public String getBestaeuber() {
        return bestaeuber;
    }

    public void setBestaeuber(String bestaeuber) {
        this.bestaeuber = bestaeuber;
    }

    public String getInsektenarten() {
        return insektenarten;
    }

    public void setInsektenarten(String insektenarten) {
        this.insektenarten = insektenarten;
    }

    public String getSchmetterlingsfutterpflanze() {
        return schmetterlingsfutterpflanze;
    }

    public void setSchmetterlingsfutterpflanze(String schmetterlingsfutterpflanze) {
        this.schmetterlingsfutterpflanze = schmetterlingsfutterpflanze;
    }

    public String getHeilanwendung() {
        return heilanwendung;
    }

    public void setHeilanwendung(String heilanwendung) {
        this.heilanwendung = heilanwendung;
    }

    public String getInhaltsstoffe() {
        return inhaltsstoffe;
    }

    public void setInhaltsstoffe(String inhaltsstoffe) {
        this.inhaltsstoffe = inhaltsstoffe;
    }
}
