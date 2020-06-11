package de.proj.Kraueterlehrpfad.Entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "qr_code")

public class QRCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="qr_id")
    Integer qr_id;
    @Column(name="identifier")
    String identifier;

    @ManyToOne
    @JoinColumn(name = "reben_id")
    private Rebe rebe;



<<<<<<< Updated upstream
    @OneToMany(mappedBy = "qr_code")
=======
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "qrCode")
>>>>>>> Stashed changes
    private Set<QRKraeuterLink> qrKraeuterLinkSet;

    public QRCode() {

    }

    public QRCode(Integer qr_id, String identifier) {
        this.qr_id = qr_id;
        this.identifier = identifier;
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

    public Integer  getQr_id() {
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
