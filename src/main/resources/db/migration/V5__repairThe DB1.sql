alter table datecontact rename to infoClient;
alter table infoClient rename column idDateContact to idInfoClient;
alter table infoClient drop column contactPrincipalClient;
alter table proiect add constraint idClient foreign key (idClient)
    references baza_clienti_PETKUS.client(idClient);
alter table infoClient drop constraint infoclient_ibfk_2;
alter table infoClient drop column idAngajatResponsabil;
alter table proiect add column idAngajatResponsabil int unsigned;
alter table proiect add constraint idAngajatResponsabil foreign key (idAngajat)
    references baza_clienti_petkus.angajat(idAngajat);
alter table infoClient drop constraint infoclient_ibfk_3;
alter table infoClient drop column idClient;
alter table perscontact drop constraint perscontact_ibfk_1;
alter table perscontact drop column idClient;

alter table client drop constraint idDateContact;
alter table infoClient drop constraint infoclient_ibfk_1;
alter table proiect drop constraint idClient;
alter table proiect drop constraint proiect_ibfk_1;
alter table proiect drop constraint idAngajatResponsabil;
alter table proiect drop idAngajat;
alter table infoClient drop persContact;

alter table proiect add constraint idClient foreign key (idClient)
    references baza_clienti_petkus.client(idClient);
alter table proiect add constraint idAngajatResponsabil foreign key (idAngajatResponsabil)
    references baza_clienti_petkus.angajat(idAngajat);

alter table client add constraint idDateContact foreign key (idDateContact)
    references baza_clienti_petkus.infoclient(idInfoClient);
alter table perscontact add column idProiect int unsigned;
alter table perscontact add constraint idProiect foreign key (idProiect)
    references baza_clienti_petkus.proiect(idProiect);


alter table perscontact add column idClientPC int unsigned;
alter table perscontact add constraint idClientPC foreign key (idClientPC)
    references baza_clienti_petkus.client(idClient);

alter table angajat add column post varchar(50) after nume;
alter table client rename column idDateContact to idInfoClient;