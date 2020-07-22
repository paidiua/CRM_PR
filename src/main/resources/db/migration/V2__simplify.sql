ALTER TABLE angajat DROP COLUMN numePrenume;
ALTER TABLE angajat DROP COLUMN pozitieAngajat;
ALTER TABLE angajat DROP COLUMN mailAngajat;
ALTER TABLE angajat DROP COLUMN telefonAngajat;
drop table alarmesiremarks;
ALTER TABLE client add idDateContact int unsigned after numeClient;
alter table client add constraint idDateContact foreign key (idDateContact)
    references baza_clienti_PETKUS.datecontact(idDateContact);
alter table datecontact drop tara;
alter table datecontact drop oras;
alter table datecontact drop emailFirma;
alter table perscontact drop pozitiePersContact;
alter table perscontact drop mailPersContact;
drop table vanzare;

