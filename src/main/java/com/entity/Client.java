package com.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="client")
public class Client {

    public Client() {
    }

    public Client(int idClient, String numeClient, InfoClient infoClient, List<Proiect> listaProiecteAferenteClientului, List<PersContact> listaPC) {
        this.idClient = idClient;
        this.numeClient = numeClient;
        this.infoClient = infoClient;
        this.listaProiecteAferenteClientului = listaProiecteAferenteClientului;
        this.listaPC = listaPC;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    private int idClient;

    @Column(name="numeClient")
    private String numeClient;

    @OneToOne
    @JoinColumn(name="idInfoClient", referencedColumnName = "idInfoClient")
    private InfoClient infoClient;


    @OneToMany(mappedBy = "clientulAferentProiectului")
    private List<Proiect> listaProiecteAferenteClientului;

    @OneToMany(mappedBy = "clientulDeCareTinePC")
    private List<PersContact> listaPC;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public InfoClient getInfoClient() {
        return infoClient;
    }

    public void setInfoClient(InfoClient infoClient) {
        this.infoClient = infoClient;
    }

    public List<Proiect> getListaProiecteAferenteClientului() {
        return listaProiecteAferenteClientului;
    }

    public void setListaProiecteAferenteClientului(List<Proiect> listaProiecteAferenteClientului) {
        this.listaProiecteAferenteClientului = listaProiecteAferenteClientului;
    }

    public List<PersContact> getListaPC() {
        return listaPC;
    }

    public void setListaPC(List<PersContact> listaPC) {
        this.listaPC = listaPC;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("idClient=").append(idClient);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", infoClient=").append(infoClient);
        sb.append(", listaProiecteAferenteClientului=").append(listaProiecteAferenteClientului.toString());
        sb.append(", listaPC=").append(listaPC.toString());
        sb.append('}');
        return sb.toString();
    }
}
