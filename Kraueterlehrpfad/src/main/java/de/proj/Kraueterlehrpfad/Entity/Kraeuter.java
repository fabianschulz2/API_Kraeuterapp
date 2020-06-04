package de.proj.Kraueterlehrpfad.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="kraeuter")

public class Kraeuter {

    //Gleiche Bezeichner wie in DB

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Kraeuter_ID;
    @NotNull
    private String Name;
    @NotNull
    private String Lateinischer_Name;
    @NotNull
    private String Familie;
    @NotNull
    private String Wuchs;
    @NotNull
    private Integer Bluetenzeit;
    @NotNull
    private String Blueten;
    @NotNull
    private String Ausbreitung;
    @NotNull
    private String Vorkommen;
    private Integer Samenreife;
    private Integer Fruchtreife;
    private String Fruechte;
    private String Bestaeuber;
    private String Insektenarten;
    private String Schmetterlingsfutterpflanze;
    private String Heilanwendung;
    private String Inhaltsstoffe;



    public Kraeuter(){

    }

    public Kraeuter(Integer kraeuter_ID, String name, String lateinischer_Name, String familie, String wuchs, Integer bluetenzeit, String blueten, String ausbreitung, String vorkommen, Integer samenreife, Integer fruchtreife, String fruechte, String bestaeuber, String insektenarten, String schmetterlingsfutterpflanze, String heilanwendung, String inhaltsstoffe) {
        Kraeuter_ID = kraeuter_ID;
        Name = name;
        Lateinischer_Name = lateinischer_Name;
        Familie = familie;
        Wuchs = wuchs;
        Bluetenzeit = bluetenzeit;
        Blueten = blueten;
        Ausbreitung = ausbreitung;
        Vorkommen = vorkommen;
        Samenreife = samenreife;
        Fruchtreife = fruchtreife;
        Fruechte = fruechte;
        Bestaeuber = bestaeuber;
        Insektenarten = insektenarten;
        Schmetterlingsfutterpflanze = schmetterlingsfutterpflanze;
        Heilanwendung = heilanwendung;
        Inhaltsstoffe = inhaltsstoffe;
    }

    public Integer getKraeuter_ID() {
        return Kraeuter_ID;
    }

    public void setKraeuter_ID(Integer kraeuter_ID) {
        Kraeuter_ID = kraeuter_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLateinischer_Name() {
        return Lateinischer_Name;
    }

    public void setLateinischer_Name(String lateinischer_Name) {
        Lateinischer_Name = lateinischer_Name;
    }

    public String getFamilie() {
        return Familie;
    }

    public void setFamilie(String familie) {
        Familie = familie;
    }

    public String getWuchs() {
        return Wuchs;
    }

    public void setWuchs(String wuchs) {
        Wuchs = wuchs;
    }

    public Integer getBluetenzeit() {
        return Bluetenzeit;
    }

    public void setBluetenzeit(Integer bluetenzeit) {
        Bluetenzeit = bluetenzeit;
    }

    public String getBlueten() {
        return Blueten;
    }

    public void setBlueten(String blueten) {
        Blueten = blueten;
    }

    public String getAusbreitung() {
        return Ausbreitung;
    }

    public void setAusbreitung(String ausbreitung) {
        Ausbreitung = ausbreitung;
    }

    public String getVorkommen() {
        return Vorkommen;
    }

    public void setVorkommen(String vorkommen) {
        Vorkommen = vorkommen;
    }

    public Integer getSamenreife() {
        return Samenreife;
    }

    public void setSamenreife(Integer samenreife) {
        Samenreife = samenreife;
    }

    public Integer getFruchtreife() {
        return Fruchtreife;
    }

    public void setFruchtreife(Integer fruchtreife) {
        Fruchtreife = fruchtreife;
    }

    public String getFruechte() {
        return Fruechte;
    }

    public void setFruechte(String fruechte) {
        Fruechte = fruechte;
    }

    public String getBestaeuber() {
        return Bestaeuber;
    }

    public void setBestaeuber(String bestaeuber) {
        Bestaeuber = bestaeuber;
    }

    public String getInsektenarten() {
        return Insektenarten;
    }

    public void setInsektenarten(String insektenarten) {
        Insektenarten = insektenarten;
    }

    public String getSchmetterlingsfutterpflanze() {
        return Schmetterlingsfutterpflanze;
    }

    public void setSchmetterlingsfutterpflanze(String schmetterlingsfutterpflanze) {
        Schmetterlingsfutterpflanze = schmetterlingsfutterpflanze;
    }

    public String getHeilanwendung() {
        return Heilanwendung;
    }

    public void setHeilanwendung(String heilanwendung) {
        Heilanwendung = heilanwendung;
    }

    public String getInhaltsstoffe() {
        return Inhaltsstoffe;
    }

    public void setInhaltsstoffe(String inhaltsstoffe) {
        Inhaltsstoffe = inhaltsstoffe;
    }
}
