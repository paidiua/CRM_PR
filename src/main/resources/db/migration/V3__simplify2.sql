alter table `lead` drop constraint lead_ibfk_1;
alter table `lead` drop constraint lead_ibfk_2;
alter table `lead` drop constraint lead_ibfk_3;
alter table `lead` drop constraint lead_ibfk_4;
alter table `lead` drop idClient;
alter table baza_clienti_petkus.`lead` drop idAngajatGeneratorLead;
alter table `lead` drop remarks;
alter table proiect drop constraint proiect_ibfk_1;
alter table proiect drop constraint proiect_ibfk_2;
alter table proiect drop idLead;
alter table oferta drop constraint oferta_ibfk_1;
alter table oferta drop constraint oferta_ibfk_2;
alter table `lead` drop finantare;
alter table `lead` drop dataLeadInit;
alter table `lead` drop echipamentDorit;
alter table `lead` drop serviceDorit;
alter table `lead` drop leadOrigin;
alter table `lead` drop nextStepAction;
alter table `lead` drop nextStepAngajatResp;
alter table `lead` drop nextStepData;
alter table `lead` drop bugetEstEuro;
alter table `lead` drop leadQualification;
drop table `lead`;

drop table mesaje;
alter table oferta drop idproiect;
alter table proiect drop constraint idOferta;
alter table proiect drop idOferta;
drop table oferta;
alter table proiect add idAngajat int(5) unsigned;
alter table proiect add constraint foreign key (idAngajat) references baza_clienti_PETKUS.angajat(idAngajat);
alter table proiect drop dataIncep;
alter table proiect drop status;
alter table proiect add descriereProiect varchar(50);
