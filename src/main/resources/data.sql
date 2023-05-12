insert into symptom(name) values ('headache');
insert into symptom(name) values ('cough');
insert into symptom(name) values ('fever');
insert into symptom(name) values ('sore throat');

insert into specialist(name) values ('general practitioner');
insert into specialist(name) values ('pediatrician');
insert into specialist(name) values ('cardiologist');

insert into specialist_symptom(specialist_id, symptom_id) values (1, 1);
insert into specialist_symptom(specialist_id, symptom_id) values (1, 2);
insert into specialist_symptom(specialist_id, symptom_id) values (1, 3);
insert into specialist_symptom(specialist_id, symptom_id) values (1, 4);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 1);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 2);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 3);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 4);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 1);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 2);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 3);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 4);

insert into doctor(name, specialist_id, is_male) values ('Dr. Smith', 1, true);
insert into doctor(name, specialist_id, is_male) values ('Dr. Jones', 2, true);
insert into doctor(name, specialist_id, is_male) values ('Dr. Williams', 3, true);

insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-19 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-19 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-19 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (2, '2023-05-19 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (2, '2023-05-19 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (2, '2023-05-19 10:00:00', 4);