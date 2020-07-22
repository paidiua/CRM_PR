package com.entity;
import javax.persistence.*;

@Entity
@Table(name="perscontact")
public class PersContact {

    public PersContact() {
    }

    public PersContact(int idPersContact, String numePersContact, String telPersContact, boolean contactPrincipal, Proiect proiectulAferentPersDeContact, Client clientulDeCareTinePC) {
        this.idPersContact = idPersContact;
        this.numePersContact = numePersContact;
        this.telPersContact = telPersContact;
        contactPrincipal=false;
        this.contactPrincipal = contactPrincipal;
        this.proiectulAferentPersDeContact = proiectulAferentPersDeContact;
        this.clientulDeCareTinePC = clientulDeCareTinePC;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPersContact")
    private int idPersContact;

    @Column(name="numePersContact")
    private String numePersContact;

    @Column(name="telPersContact")
    private String telPersContact;

    @Column(name="contactPrincipalClient")
    private boolean contactPrincipal;

    @OneToOne
    @JoinColumn(name="idProiect", referencedColumnName = "idProiect")
    private Proiect proiectulAferentPersDeContact;

    @ManyToOne
    @JoinColumn(name="idClientPC", referencedColumnName = "idClient")
    private Client clientulDeCareTinePC;

    public int getIdPersContact() {
        return idPersContact;
    }

    public void setIdPersContact(int idPersContact) {
        this.idPersContact = idPersContact;
    }

    public String getNumePersContact() {
        return numePersContact;
    }

    public void setNumePersContact(String numePersContact) {
        this.numePersContact = numePersContact;
    }

    public String getTelPersContact() {
        return telPersContact;
    }

    public void setTelPersContact(String telPersContact) {
        this.telPersContact = telPersContact;
    }

    public boolean isContactPrincipal() {
        return contactPrincipal;
    }

    public void setContactPrincipal(boolean contactPrincipal) {
        this.contactPrincipal = contactPrincipal;
    }

    public Proiect getProiectulAferentPersDeContact() {
        return proiectulAferentPersDeContact;
    }

    public void setProiectulAferentPersDeContact(Proiect proiectulAferentPersDeContact) {
        this.proiectulAferentPersDeContact = proiectulAferentPersDeContact;
    }

    public Client getClientulDeCareTinePC() {
        return clientulDeCareTinePC;
    }

    public void setClientulDeCareTinePC(Client clientulDeCareTinePC) {
        this.clientulDeCareTinePC = clientulDeCareTinePC;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersContact{");
        sb.append("idPersContact=").append(idPersContact);
        sb.append(", numePersContact='").append(numePersContact).append('\'');
        sb.append(", telPersContact='").append(telPersContact).append('\'');
        sb.append(", contactPrincipal=").append(contactPrincipal);
        sb.append(", proiectulAferentPersDeContact=").append(proiectulAferentPersDeContact.getDescriereProiect());
        sb.append(", clientulDeCareTinePC=").append(clientulDeCareTinePC.getNumeClient());
        sb.append('}');
        return sb.toString();
    }
}
