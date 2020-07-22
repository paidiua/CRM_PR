package com.entity;
import javax.persistence.*;

@Entity
@Table(name="proiect")
public class Proiect {

    public Proiect() {
    }

    public Proiect(int idProiect, String descriereProiect, Angajat angajatResponsabil, Client clientulAferentProiectului, PersContact persContact) {
        this.idProiect = idProiect;
        this.descriereProiect = descriereProiect;
        this.angajatResponsabil = angajatResponsabil;
        this.clientulAferentProiectului = clientulAferentProiectului;
        this.persContact = persContact;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idProiect")
    private int idProiect;

    @Column(name="descriereProiect")
    private String descriereProiect;

    @OneToOne
    @JoinColumn(name = "idAngajatResponsabil", referencedColumnName = "idAngajat")
    private Angajat angajatResponsabil;

    @ManyToOne
    @JoinColumn(name="idClient", referencedColumnName = "idClient")
    private Client clientulAferentProiectului;

    @OneToOne(mappedBy = "proiectulAferentPersDeContact")
    private PersContact persContact;

    public int getIdProiect() {
        return idProiect;
    }

    public void setIdProiect(int idProiect) {
        this.idProiect = idProiect;
    }

    public String getDescriereProiect() {
        return descriereProiect;
    }

    public void setDescriereProiect(String descriereProiect) {
        this.descriereProiect = descriereProiect;
    }

    public Angajat getAngajatResponsabil() {
        return angajatResponsabil;
    }

    public void setAngajatResponsabil(Angajat angajatResponsabil) {
        this.angajatResponsabil = angajatResponsabil;
    }

    public Client getClientulAferentProiectului() {
        return clientulAferentProiectului;
    }

    public void setClientulAferentProiectului(Client clientulAferentProiectului) {
        this.clientulAferentProiectului = clientulAferentProiectului;
    }

    public PersContact getPersContact() {
        return persContact;
    }

    public void setPersContact(PersContact persContact) {
        this.persContact = persContact;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Proiect{");
        sb.append("idProiect=").append(idProiect);
        sb.append(", descriereProiect='").append(descriereProiect).append('\'');
        sb.append(", angajatResponsabil=").append(angajatResponsabil.getNume());
        sb.append(", clientulAferentProiectului=").append(clientulAferentProiectului.getNumeClient());
        sb.append(", persContact=").append(persContact.getNumePersContact());
        sb.append('}');
        return sb.toString();
    }
}
