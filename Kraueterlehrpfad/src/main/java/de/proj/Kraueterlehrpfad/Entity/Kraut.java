package de.proj.Kraueterlehrpfad.Entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name="kraeuter")

public class Kraut {

    //Gleiche Bezeichner wie in DB

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer kraeuter_id;
    @NonNull
    private String name;
    @NonNull
    private String lateinischer_name;
    @NonNull
    private String familie;
    @NonNull
    private String wuchs;
    @NonNull
    private Integer bluetenzeit;
    @NonNull
    private String blueten;
    @NonNull
    private String ausbreitung;
    @NonNull
    private String vorkommen;
    private Integer samenreife;
    private Integer fruchtreife;
    private String fruechte;
    private String bestaeuber;
    private String insektenarten;
    private String schmetterlingsfutterpflanze;
    private String heilanwendung;
    private String inhaltsstoffe;




    public Kraut(){

    }

    public Kraut(Integer kraeuter_id, String name, String lateinischer_name, String familie, String wuchs, Integer bluetenzeit, String blueten, String ausbreitung, String vorkommen, Integer samenreife, Integer fruchtreife, String fruechte, String bestaeuber, String insektenarten, String schmetterlingsfutterpflanze, String heilanwendung, String inhaltsstoffe) {
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
}
