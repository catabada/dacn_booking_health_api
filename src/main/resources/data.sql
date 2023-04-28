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

insert into doctor(name, specialist_id) values ('Dr. Smith', 1);
insert into doctor(name, specialist_id) values ('Dr. Jones', 2);
insert into doctor(name, specialist_id) values ('Dr. Williams', 3);

insert into schedule(doctor_id, day_of_week, time) values (1, 1, '09:00');
insert into schedule(doctor_id, day_of_week, time) values (1, 1, '10:00');
insert into schedule(doctor_id, day_of_week, time) values (1, 3, '09:00');
insert into schedule(doctor_id, day_of_week, time) values (1, 4, '09:00');
insert into schedule(doctor_id, day_of_week, time) values (1, 5, '09:00');
insert into schedule(doctor_id, day_of_week, time) values (2, 1, '08:00');
insert into schedule(doctor_id, day_of_week, time) values (2, 2, '10:00');
insert into schedule(doctor_id, day_of_week, time) values (2, 3, '08:00');