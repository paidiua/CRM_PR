alter table angajat drop column tipContAdminNon;
alter table angajat add column tipContAdminNon tinyint(1);
alter table perscontact drop column contactPrincipal;
alter table perscontact add column contactPrincipalClient tinyint(1);
alter table datecontact drop column contactPrincipalClient;
alter table datecontact add column contactPrincipalClient tinyint(1);