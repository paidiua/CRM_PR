package com.entity;
import javax.persistence.*;

@Entity
@Table(name="infoclient")
public class InfoClient {

    public InfoClient(int idInfoClient) {
    }

    public InfoClient(int idInfoClient, String adresa, String telefonFirma, Client clientulCautat) {
        this.idInfoClient = idInfoClient;
        this.adresa = adresa;
        this.telefonFirma = telefonFirma;
        this.clientulCautat = clientulCautat;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idInfoClient")
    private int idInfoClient;

    @Column(name="adresa")
    private String adresa;

    @Column(name="telefonFirma")
    private String telefonFirma;

    @OneToOne(mappedBy = "infoClient")
    private Client clientulCautat;

    public int getIdInfoClient() {
        return idInfoClient;
    }

    public void setIdInfoClient(int idInfoClient) {
        this.idInfoClient = idInfoClient;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefonFirma() {
        return telefonFirma;
    }

    public void setTelefonFirma(String telefonFirma) {
        this.telefonFirma = telefonFirma;
    }

    public Client getClientulCautat() {
        return clientulCautat;
    }

    public void setClientulCautat(Client clientulCautat) {
        this.clientulCautat = clientulCautat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InfoClient{");
        sb.append("idInfoClient=").append(idInfoClient);
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", telefonFirma='").append(telefonFirma).append('\'');
        sb.append(", clientulCautat=").append(clientulCautat.getNumeClient());
        sb.append('}');
        return sb.toString();
    }
}
