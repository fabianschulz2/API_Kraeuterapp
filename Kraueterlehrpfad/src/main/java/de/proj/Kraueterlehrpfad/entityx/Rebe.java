package de.proj.Kraueterlehrpfad.entityx;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "rebe")
public class Rebe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reben_id")
    private Integer rebenId;
    @Column(name = "weinlage")
    private String weinlage;
    @Column(name = "rebsorte")
    private String rebsorte;
    @Column(name = "pflanzjahr")
    private Date pflanzjahr;
    @Column(name = "sorteneigenschaft")
    private String sorteneigenschaft;
    @Column(name = "wissenswertes")
    private String wissenswertes;
    @Column(name = "bodenpflege")
    private String bodenpflege;
    @Column(name = "shop_link")
    private String shopLink;
    @Column(name = "quellen")
    private String quellen;
    @Column(name = "bildUrl")
    private String bildUrl;

    @OneToMany(mappedBy = "rebe")
    @JsonBackReference
    private Set<QRCode> qrCodeSet;


    public Rebe() {

    }

    public Rebe(Integer rebenId, String weinlage, String rebsorte, Date pflanzjahr, String sorteneigenschaft, String wissenswertes, String bodenpflege, String shopLink, String quellen, String bildUrl, Set<QRCode> qrCodeSet) {
        this.rebenId = rebenId;
        this.weinlage = weinlage;
        this.rebsorte = rebsorte;
        this.pflanzjahr = pflanzjahr;
        this.sorteneigenschaft = sorteneigenschaft;
        this.wissenswertes = wissenswertes;
        this.bodenpflege = bodenpflege;
        this.shopLink = shopLink;
        this.quellen = quellen;
        this.bildUrl = bildUrl;
        this.qrCodeSet = qrCodeSet;
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

    public Set<QRCode> getQrCodeSet() {
        return qrCodeSet;
    }

    public void setQrCodeSet(Set<QRCode> qrCodeSet) {
        this.qrCodeSet = qrCodeSet;
    }

    public Integer getRebenId() {
        return rebenId;
    }

    public void setRebenId(Integer rebenId) {
        this.rebenId = rebenId;
    }

    public String getWeinlage() {
        return weinlage;
    }

    public void setWeinlage(String weinlage) {
        this.weinlage = weinlage;
    }

    public String getRebsorte() {
        return rebsorte;
    }

    public void setRebsorte(String rebsorte) {
        this.rebsorte = rebsorte;
    }

    public Date getPflanzjahr() {
        return pflanzjahr;
    }

    public void setPflanzjahr(Date pflanzjahr) {
        this.pflanzjahr = pflanzjahr;
    }

    public String getSorteneigenschaft() {
        return sorteneigenschaft;
    }

    public void setSorteneigenschaft(String sorteneigenschaft) {
        this.sorteneigenschaft = sorteneigenschaft;
    }

    public String getWissenswertes() {
        return wissenswertes;
    }

    public void setWissenswertes(String wissenswertes) {
        this.wissenswertes = wissenswertes;
    }

    public String getBodenpflege() {
        return bodenpflege;
    }

    public void setBodenpflege(String bodenpflege) {
        this.bodenpflege = bodenpflege;
    }

    public String getShopLink() {
        return shopLink;
    }

    public void setShopLink(String shopLink) {
        this.shopLink = shopLink;
    }
}
