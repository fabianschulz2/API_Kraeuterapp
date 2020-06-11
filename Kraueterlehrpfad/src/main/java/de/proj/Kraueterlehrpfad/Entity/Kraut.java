package de.proj.Kraueterlehrpfad.Entity;

import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="kraeuter")

public class Kraut {

    //Gleiche Bezeichner wie in DB

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="kraeuter_id")
    private Integer kraeuter_id;
    @Column(name = "name")
    private String name;
    @Column(name = "lateinischer_name")
    private String lateinischer_name;
    @Column(name = "familie")
    private String familie;
    @Column(name = "wuchs")
    private String wuchs;
    @Column(name = "bluetenzeit")
    private String bluetenzeit;
    @Column(name = "blueten")
    private String blueten;
    @Column(name = "ausbreitung")
    private String ausbreitung;
    @Column(name = "vorkommen")
    private String vorkommen;
    @Column(name = "samenreife")
    private String samenreife;
    @Column(name = "fruchtreife")
    private String fruchtreife;
    @Column(name = "fruechte")
    private String fruechte;
    @Column(name = "bestaeuber")
    private String bestaeuber;
    @Column(name = "insektenarten")
    private String insektenarten;
    @Column(name = "schmetterlingsfutterpflanze")
    private String schmetterlingsfutterpflanze;
    @Column(name = "heilanwendung")
    private String heilanwendung;
    @Column(name = "inhaltsstoffe")
    private String inhaltsstoffe;

<<<<<<< Updated upstream
    @OneToMany(mappedBy = "kraeuter")
=======
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "kraut")
>>>>>>> Stashed changes
    private Set<QRKraeuterLink> qrKraeuterLinkSet;


    public Kraut(){

    }

    public Kraut(Integer kraeuter_id, String name, String lateinischer_name, String familie, String wuchs, String bluetenzeit, String blueten, String ausbreitung, String vorkommen, String samenreife, String fruchtreife, String fruechte, String bestaeuber, String insektenarten, String schmetterlingsfutterpflanze, String heilanwendung, String inhaltsstoffe) {
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

    public String getBluetenzeit() {
        return bluetenzeit;
    }

    public void setBluetenzeit(String bluetenzeit) {
        this.bluetenzeit = bluetenzeit;
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
