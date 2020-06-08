package de.proj.Kraueterlehrpfad.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="kraeuter")

public class Kraeuter {

    //Gleiche Bezeichner wie in DB

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer kraeuter_ID;
    @NotNull
    private String name;
    @NotNull
    private String lateinischer_Name;
    @NotNull
    private String familie;
    @NotNull
    private String wuchs;
    @NotNull
    private Integer bluetenzeit;
    @NotNull
    private String blueten;
    @NotNull
    private String ausbreitung;
    @NotNull
    private String vorkommen;
    private Integer samenreife;
    private Integer fruchtreife;
    private String fruechte;
    private String bestaeuber;
    private String insektenarten;
    private String schmetterlingsfutterpflanze;
    private String heilanwendung;
    private String inhaltsstoffe;

    public Integer getKraeuter_ID() {
        return kraeuter_ID;
    }

    public void setKraeuter_ID(Integer kraeuter_ID) {
        this.kraeuter_ID = kraeuter_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLateinischer_Name() {
        return lateinischer_Name;
    }

    public void setLateinischer_Name(String lateinischer_Name) {
        this.lateinischer_Name = lateinischer_Name;
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

    public Integer getBluetenzeit() {
        return bluetenzeit;
    }

    public void setBluetenzeit(Integer bluetenzeit) {
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

    public Integer getSamenreife() {
        return samenreife;
    }

    public void setSamenreife(Integer samenreife) {
        this.samenreife = samenreife;
    }

    public Integer getFruchtreife() {
        return fruchtreife;
    }

    public void setFruchtreife(Integer fruchtreife) {
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

    public Kraeuter(){

    }

    public Kraeuter(Integer kraeuter_ID, String name, String lateinischer_Name, String familie, String wuchs, Integer bluetenzeit, String blueten, String ausbreitung, String vorkommen, Integer samenreife, Integer fruchtreife, String fruechte, String bestaeuber, String insektenarten, String schmetterlingsfutterpflanze, String heilanwendung, String inhaltsstoffe) {
        kraeuter_ID = kraeuter_ID;
        name = name;
        lateinischer_Name = lateinischer_Name;
        familie = familie;
        wuchs = wuchs;
        bluetenzeit = bluetenzeit;
        blueten = blueten;
        ausbreitung = ausbreitung;
        vorkommen = vorkommen;
        samenreife = samenreife;
        fruchtreife = fruchtreife;
        fruechte = fruechte;
        bestaeuber = bestaeuber;
        insektenarten = insektenarten;
        schmetterlingsfutterpflanze = schmetterlingsfutterpflanze;
        heilanwendung = heilanwendung;
        inhaltsstoffe = inhaltsstoffe;
    }



}
