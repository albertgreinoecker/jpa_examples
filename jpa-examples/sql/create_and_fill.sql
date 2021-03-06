CREATE database uni_jpa;

insert into STUDENT values (24002,'Xenokrates',18);
insert into STUDENT values (25403,'Jonas',12);
insert into STUDENT values (26120,'Fichte',10);
insert into STUDENT values (26830,'Aristoxenos',8);
insert into STUDENT values (27550,'Schopenhauer',6);
insert into STUDENT values (28106,'Carnap',3);
insert into STUDENT values (29120,'Theophrastos',2);
insert into STUDENT values (29555,'Feuerbach',2);


insert into PROFESSOR values (2125,'Sokrates','C4','226');
insert into PROFESSOR values (2126,'Russel','C4','232');
insert into PROFESSOR values (2127,'Kopernikus','C3','310');
insert into PROFESSOR values (2133,'Popper','C3','52');
insert into PROFESSOR values (2134,'Augustinus','C3','309');
insert into PROFESSOR values (2136,'Curie','C4','36');
insert into PROFESSOR values (2137,'Kant','C4','7');


insert into ASSISTENT values(3002,'Platon','Ideenlehre',2125);
insert into ASSISTENT values(3003,'Aristoteles','Syllogistik',2125);
insert into ASSISTENT values(3004,'Wittgenstein','Sprachtheorie',2126);
insert into ASSISTENT values(3005,'Rhetikus','Planetenbewegung',2127);
insert into ASSISTENT values(3006,'Newton','Keplersche Gesetze',2127);
insert into ASSISTENT values(3007,'Spinoza','Gott und Natur',2126);

insert into VORLESUNG (vorlnr, titel, ects, gelesenvon_persnr) values(5001,'Grundzüge',4,2137);
insert into VORLESUNG (vorlnr, titel, ects, gelesenvon_persnr)values(5041,'Ethik',4,2125);
insert into VORLESUNG (vorlnr, titel, ects, gelesenvon_persnr) values(5043,'Erkenntnistheorie',3,2126);
insert into VORLESUNG (vorlnr, titel, ects, gelesenvon_persnr) values(5049,'Mäeutik',2,2125);
insert into VORLESUNG (vorlnr, titel, ects, gelesenvon_persnr) values(4052,'Logik',4,2125);
insert into VORLESUNG (vorlnr, titel, ects, gelesenvon_persnr) values(5052,'Wissenschaftstheorie',3,2126);
insert into VORLESUNG (vorlnr, titel, ects, gelesenvon_persnr) values(5216,'Bioethik',2,2126);
insert into VORLESUNG (vorlnr, titel, ects, gelesenvon_persnr) values(5259,'Der Wiener Kreis',2,2133);
insert into VORLESUNG (vorlnr, titel, ects, gelesenvon_persnr) values(5022,'Glaube und Wissen',2,2134);
insert into VORLESUNG (vorlnr, titel, ects, gelesenvon_persnr) values(4630,'Die 3 Kritiken',4,2137);

insert into hoeren values(26120,5001);
insert into hoeren values(27550,5001);
insert into hoeren values(27550,4052);
insert into hoeren values(28106,5041);
insert into hoeren values(28106,5052);
insert into hoeren values(28106,5216);
insert into hoeren values(28106,5259);
insert into hoeren values(29120,5001);
insert into hoeren values(29120,5041);
insert into hoeren values(29120,5049);
insert into hoeren values(29555,5022);
insert into hoeren values(25403,5022);


insert into NOTE(id, student_matrNr,VORLESUNG_VORLNR, note,datum) values(1,26120,5001,3, '2021-06-15 09:12:45'); 
insert into NOTE(id, student_matrNr,VORLESUNG_VORLNR, note,datum) values(2,27550,5001,2, '2021-06-15 09:12:45'); 
insert into NOTE(id, student_matrNr,VORLESUNG_VORLNR, note,datum) values(3,27550,4052,4, '2021-06-15 09:12:45'); 
insert into NOTE(id, student_matrNr,VORLESUNG_VORLNR, note,datum) values(4,28106,5041,4, '2021-06-15 09:12:45'); 
insert into NOTE(id, student_matrNr,VORLESUNG_VORLNR, note,datum) values(5,28106,5052,5, '2021-06-15 09:12:45'); 
insert into NOTE(id, student_matrNr,VORLESUNG_VORLNR, note,datum) values(6,28106,5216,1, '2021-06-15 09:12:45'); 
insert into NOTE(id, student_matrNr,VORLESUNG_VORLNR, note,datum) values(7,28106,5259,1, '2021-06-15 09:12:45'); 
insert into NOTE(id, student_matrNr,VORLESUNG_VORLNR, note,datum) values(8,29120,5001,2, '2021-06-15 09:12:45'); 
insert into NOTE(id, student_matrNr,VORLESUNG_VORLNR, note,datum) values(9,29120,5041,2, '2021-06-15 09:12:45'); 
insert into NOTE(id, student_matrNr,VORLESUNG_VORLNR, note,datum) values(10,29120,5049,3, '2021-06-15 09:12:45'); 
insert into NOTE(id, student_matrNr,VORLESUNG_VORLNR, note,datum) values(11,29555,5022,4, '2021-06-15 09:12:45'); 
insert into NOTE(id, student_matrNr,VORLESUNG_VORLNR, note,datum) values(12, 25403,5022,1, '2021-06-15 09:12:45'); 



