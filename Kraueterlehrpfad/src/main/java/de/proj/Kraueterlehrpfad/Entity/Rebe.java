package de.proj.Kraueterlehrpfad.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "rebe")
public class Rebe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reben_id;
    private String weinlage;
    private String rebsorte;
    private Date pflanzjahr;
    private String sorteneigenschaft;
    private String wissenswertes;
    private String bodenpflege;
    private String shop_link;


    @OneToMany(mappedBy = "rebe")
    private Set<QRCode> qrCodeSet;


    public Rebe() {

    }

    public Rebe(Integer reben_id, String weinlage, String rebsorte, Date pflanzjahr, String sorteneigenschaft, String wissenswertes, String bodenpflege, String shop_link) {
        this.reben_id = reben_id;
        this.weinlage = weinlage;
        this.rebsorte = rebsorte;
        this.pflanzjahr = pflanzjahr;
        this.sorteneigenschaft = sorteneigenschaft;
        this.wissenswertes = wissenswertes;
        this.bodenpflege = bodenpflege;
        this.shop_link = shop_link;
    }

    public Set<QRCode> getQrCodeSet() {
        return qrCodeSet;
    }

    public void setQrCodeSet(Set<QRCode> qrCodeSet) {
        this.qrCodeSet = qrCodeSet;
    }

    public Integer getReben_id() {
        return reben_id;
    }

    public void setReben_id(Integer reben_id) {
        this.reben_id = reben_id;
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

    public String getShop_link() {
        return shop_link;
    }

    public void setShop_link(String shop_link) {
        this.shop_link = shop_link;
    }
}
