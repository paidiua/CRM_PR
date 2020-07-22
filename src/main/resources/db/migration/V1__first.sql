
create table baza_clienti_PETKUS.client
(
    idClient  int(5) unsigned auto_increment primary key,
    numeClient varchar(50)
);

create table baza_clienti_PETKUS.angajat
(
    idAngajat int(5) unsigned auto_increment primary key,
    nume varchar(30),
    numePrenume varchar(30),
    pozitieAngajat varchar(30),
    mailAngajat varchar(30),
    telefonAngajat varchar(30),
    tipContAdminNon tinyint(1) default 0
);

create table baza_clienti_PETKUS.persContact
(
    idPersContact int(5) unsigned auto_increment primary key,
    numePersContact varchar(30),
    pozitiePersContact varchar(30),
    telPersContact varchar(15),
    mailPersContact varchar(30),
    contactPrincipal tinyint(1) default 1,
    idClient int(5) unsigned,
    foreign key (idClient) references baza_clienti_PETKUS.client(idClient)
);

create table baza_clienti_PETKUS.dateContact
(
    idDateContact int(5) unsigned auto_increment primary key,
    persContact int(5) unsigned,
    foreign key (persContact) references baza_clienti_PETKUS.persContact(idPersContact),
    tara varchar(25),
    oras varchar(25),
    adresa varchar(75),
    telefonFirma varchar(15),
    emailFirma  varchar (20),
    contactPrincipalClient tinyint(1) default 1,
    idAngajatResponsabil int(5) unsigned,
    foreign key (idAngajatResponsabil) references baza_clienti_PETKUS.angajat(idAngajat),
    idClient int(5) unsigned,
    foreign key (idClient) references baza_clienti_PETKUS.client(idClient)
);

create table baza_clienti_PETKUS.mesaje
(
    idMesaj int(5) unsigned auto_increment primary key,
    bodyMesaj varchar(300)
);

create table baza_clienti_PETKUS.lead
(
    idLead int(5) unsigned auto_increment primary key,
    idClient int(5) unsigned,
    foreign key (idClient) references baza_clienti_PETKUS.client(idClient),
    idAngajatGeneratorLead int(5) unsigned,
    foreign key (idAngajatGeneratorLead) references baza_clienti_PETKUS.angajat(idAngajat),
    dataLeadInit datetime default now(),
    echipamentDorit varchar(50),
    serviceDorit varchar(50),
    leadQualification varchar(150),
    leadOrigin varchar(150),
    bugetEstEuro  int(10),
    nextStepData datetime default now(),
    nextStepAction varchar(300),
    nextStepAngajatResp int(5) unsigned,
    foreign key (nextStepAngajatResp) references baza_clienti_PETKUS.angajat(idAngajat),
    finantare varchar(20),
    remarks int(5) unsigned,
    foreign key (remarks) references baza_clienti_PETKUS.mesaje(idMesaj)
);

create table baza_clienti_PETKUS.proiect
(
    idProiect int(5) unsigned auto_increment primary key ,
    idClient int(5) unsigned,
    foreign key (idClient) references baza_clienti_PETKUS.client(idClient),
    idLead int(5) unsigned,
    foreign key (idLead) references baza_clienti_PETKUS.lead(idLead),
    dataIncep datetime default now(),
    status varchar(20)
);

create table baza_clienti_PETKUS.oferta
(
    idOferta int(5) unsigned auto_increment primary key,
    idclient int(5) unsigned,
    foreign key (idclient) references baza_clienti_PETKUS.client(idClient),
    idproiect int(5) unsigned,
    foreign key (idproiect) references baza_clienti_PETKUS.proiect(idProiect)
);

alter table baza_clienti_PETKUS.proiect add idOferta int(5) unsigned after idLead;
alter table baza_clienti_PETKUS.proiect add constraint idOferta foreign key (idOferta)
references baza_clienti_PETKUS.oferta(idOferta);

create table baza_clienti_PETKUS.vanzare
(
    idVanzare int(5) unsigned auto_increment primary key,
    idOfertaAcceptata int(5) unsigned,
    foreign key (idOfertaAcceptata) references baza_clienti_PETKUS.oferta(idOferta),
    dataVanzare datetime default now(),
    idVanzator int(5) unsigned,
    foreign key (idVanzator) references baza_clienti_PETKUS.angajat(idAngajat)
);

    create table baza_clienti_PETKUS.alarmeSiRemarks
(
    idAlarmaSiRemark int(5) unsigned auto_increment primary key,
    idClient int(5) unsigned,
    foreign key (idClient) references baza_clienti_PETKUS.client(idClient),
    dataScriere datetime default now(),
    dataSetAlarma datetime default now(),
    idMesaj int(5) unsigned,
    foreign key (idMesaj) references baza_clienti_PETKUS.mesaje(idMesaj),
    idAndgajatSet int(5) unsigned,
    foreign key (idAndgajatSet) references  baza_clienti_PETKUS.angajat(idAngajat),
    idProiect int(5) unsigned,
    foreign key (idProiect) references baza_clienti_PETKUS.proiect(idProiect)
);




