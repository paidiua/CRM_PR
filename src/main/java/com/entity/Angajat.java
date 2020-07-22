package com.entity;
import javax.persistence.*;

@Entity
@Table(name = "angajat")
public class Angajat {

    public Angajat() {
    tipContAdminNon = false;
    }

    public Angajat(int idAngajat, String nume, String post, boolean tipContAdminNon, Proiect proiectLaCareLucreazaAngajatul) {
        this.idAngajat = idAngajat;
        this.nume = nume;
        this.post = post;
        tipContAdminNon = false;
        this.tipContAdminNon = tipContAdminNon;
        this.proiectLaCareLucreazaAngajatul = proiectLaCareLucreazaAngajatul;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAngajat")
    private int idAngajat;

    @Column(name="nume")
    private String nume;

    @Column(name="post")
    private String post;

    @Column(name="tipContAdminNon")
    private boolean tipContAdminNon;

    @OneToOne(mappedBy = "angajatResponsabil")
    private Proiect proiectLaCareLucreazaAngajatul;

    public int getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public boolean getTipContAdminNon() {
        return tipContAdminNon;
    }

    public void setTipContAdminNon(boolean tipContAdminNon) {
        this.tipContAdminNon = tipContAdminNon;
    }

    public Proiect getProiectLaCareLucreazaAngajatul() {
        return proiectLaCareLucreazaAngajatul;
    }

    public void setProiectLaCareLucreazaAngajatul(Proiect proiectLaCareLucreazaAngajatul) {
        this.proiectLaCareLucreazaAngajatul = proiectLaCareLucreazaAngajatul;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append("idAngajat=").append(idAngajat);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", post='").append(post).append('\'');
        sb.append(", tipContAdminNon=").append(tipContAdminNon);
        sb.append(", proiectLaCareLucreazaAngajatul=").append(proiectLaCareLucreazaAngajatul.getDescriereProiect());
        sb.append('}');
        return sb.toString();
    }
}
