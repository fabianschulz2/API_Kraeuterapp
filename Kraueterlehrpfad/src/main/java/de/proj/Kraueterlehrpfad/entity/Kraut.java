package de.proj.Kraueterlehrpfad.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "kraeuter")

public class Kraut {

    //Gleiche Bezeichner wie in DB

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kraeuter_id")
    private Integer kraeuterId;
    @Column(name = "name")
    private String name;
    @Column(name = "lateinischer_name")
    private String lateinischerName;
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
    @Column(name = "verwendung_in_kueche")
    private String verwendungInKueche;
    @Column(name = "quellen")
    private String quellen;
    @Column(name = "bildUrl")
    private String bildUrl;
    @Column(name = "bluetenzeit_anfang")
    @Temporal(TemporalType.DATE)
    private Date bluetenzeitAnfang;
    @Column(name = "bluetenzeit_ende")
    @Temporal(TemporalType.DATE)
    private Date bluetenzeitEnde;

    @OneToMany(mappedBy = "kraut", orphanRemoval = true, cascade = CascadeType.REMOVE)
    @JsonBackReference
    private Set<QRKraeuterLink> qrKraeuterLinkSet;


    public Kraut() {

    }

    public Kraut(Integer kraeuterId, String name, String lateinischerName, String familie, String wuchs, String bluetenzeit, String blueten, String ausbreitung, String vorkommen, String samenreife, String fruchtreife, String fruechte, String bestaeuber, String insektenarten, String schmetterlingsfutterpflanze, String heilanwendung, String inhaltsstoffe, String verwendungInKueche, String quellen, String bildUrl, Set<QRKraeuterLink> qrKraeuterLinkSet, Date bluetenzeitAnfang, Date bluetenzeitEnde) {
        this.kraeuterId = kraeuterId;
        this.name = name;
        this.lateinischerName = lateinischerName;
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
        this.verwendungInKueche = verwendungInKueche;
        this.quellen = quellen;
        this.bildUrl = bildUrl;
        this.qrKraeuterLinkSet = qrKraeuterLinkSet;
        this.bluetenzeitAnfang = bluetenzeitAnfang;
        this.bluetenzeitEnde = bluetenzeitEnde;
    }

    public String getQuellen() {
        return quellen;
    }

    public void setQuellen(String quellen) {
        this.quellen = quellen;
    }

    public String getBildUrl() {
        return bildUrl;
    }

    public void setBildUrl(String bildUrl) {
        this.bildUrl = bildUrl;
    }

    public String getVerwendungInKueche() {
        return verwendungInKueche;
    }

    public void setVerwendungInKueche(String verwendungInKueche) {
        this.verwendungInKueche = verwendungInKueche;
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

    public Integer getKraeuterId() {
        return kraeuterId;
    }

    public void setKraeuterId(Integer kraeuterId) {
        this.kraeuterId = kraeuterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLateinischerName() {
        return lateinischerName;
    }

    public void setLateinischerName(String lateinischerName) {
        this.lateinischerName = lateinischerName;
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

    public Date getBluetenzeitAnfang() {
        return bluetenzeitAnfang;
    }

    public void setBluetenzeitAnfang(Date bluetenzeitAnfang) {
        this.bluetenzeitAnfang = bluetenzeitAnfang;
    }

    public Date getBluetenzeitEnde() {
        return bluetenzeitEnde;
    }

    public void setBluetenzeitEnde(Date bluetenzeitEnde) {
        this.bluetenzeitEnde = bluetenzeitEnde;
    }
}
