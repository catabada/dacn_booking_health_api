-- insert into symptom(name) values ('headache');
-- insert into symptom(name) values ('cough');
-- insert into symptom(name) values ('fever');
-- insert into symptom(name) values ('sore throat');
--
-- insert into specialist(name) values ('general practitioner');
-- insert into specialist(name) values ('pediatrician');
-- insert into specialist(name) values ('cardiologist');
--
-- insert into specialist_symptom(specialist_id, symptom_id) values (1, 1);
-- insert into specialist_symptom(specialist_id, symptom_id) values (1, 2);
-- insert into specialist_symptom(specialist_id, symptom_id) values (1, 3);
-- insert into specialist_symptom(specialist_id, symptom_id) values (1, 4);
-- insert into specialist_symptom(specialist_id, symptom_id) values (2, 1);
-- insert into specialist_symptom(specialist_id, symptom_id) values (2, 2);
-- insert into specialist_symptom(specialist_id, symptom_id) values (2, 3);
-- insert into specialist_symptom(specialist_id, symptom_id) values (2, 4);
-- insert into specialist_symptom(specialist_id, symptom_id) values (3, 1);
-- insert into specialist_symptom(specialist_id, symptom_id) values (3, 2);
-- insert into specialist_symptom(specialist_id, symptom_id) values (3, 3);
-- insert into specialist_symptom(specialist_id, symptom_id) values (3, 4);
--
-- insert into doctor(name, specialist_id, is_male, image) values ('Dr. Smith', 1, true, 'https://robohash.org/smith');
-- insert into doctor(name, specialist_id, is_male, image) values ('Dr. Jones', 2, true, 'https://robohash.org/jones');
-- insert into doctor(name, specialist_id, is_male, image) values ('Dr. Williams', 3, true, 'https://robohash.org/williams');
--
-- insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-19 08:00:00', 4);
-- insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-19 09:00:00', 4);
-- insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-19 10:00:00', 4);
-- insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-20 08:00:00', 4);
-- insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-20 09:00:00', 4);
-- insert into schedule(doctor_id, appointment_date, max_patient) values (2, '2023-05-19 08:00:00', 4);
-- insert into schedule(doctor_id, appointment_date, max_patient) values (2, '2023-05-19 09:00:00', 4);
-- insert into schedule(doctor_id, appointment_date, max_patient) values (2, '2023-05-19 10:00:00', 4);

insert into symptom(name) values ('Đau ngực');
insert into symptom(name) values ('Khó thở');
insert into symptom(name) values ('Mệt mỏi');
insert into symptom(name) values ('Đau nhói ở tim');
insert into symptom(name) values ('Chóng mặt');
insert into symptom(name) values ('Nhồi máu cơ tim');
insert into symptom(name) values ('Nhịp tim không đều');
insert into symptom(name) values ('Tim đập nhanh');
insert into symptom(name) values ('Ngủ ngáy');
insert into symptom(name) values ('Ngất xỉu');

insert into symptom(name) values ('Sốt cao');
insert into symptom(name) values ('Ho');
insert into symptom(name) values ('Tiêu chảy nhiều ở em bé');
insert into symptom(name) values ('Nôn mửa');
insert into symptom(name) values ('Mất ngủ');
insert into symptom(name) values ('Sự phát triển chậm chạp');
insert into symptom(name) values ('Tăng cân không đáng có');
insert into symptom(name) values ('Kích thước đầu nhỏ');
insert into symptom(name) values ('Lưỡi hoàn màu');
insert into symptom(name) values ('Bỏ bú');

insert into symptom(name) values ('Mẩn ngứa');
insert into symptom(name) values ('Viêm da');
insert into symptom(name) values ('Đỏ da');
insert into symptom(name) values ('Nổi mụn');
insert into symptom(name) values ('Vảy nến');
insert into symptom(name) values ('Sưng tấy');
insert into symptom(name) values ('Kích ứng da');
insert into symptom(name) values ('Mụn trứng cá');
insert into symptom(name) values ('Nổi mẩn đỏ');
insert into symptom(name) values ('Ngứa da');

insert into symptom(name) values ('Chảy máu chân răng');
insert into symptom(name) values ('Sưng nướu');
insert into symptom(name) values ('Đau hàm');
insert into symptom(name) values ('Mất răng');
insert into symptom(name) values ('Hôi miệng');
insert into symptom(name) values ('Mọc răng khôn');
insert into symptom(name) values ('Xỉn màu răng');
insert into symptom(name) values ('Mất cân bằng hàm');
insert into symptom(name) values ('Đau răng');
insert into symptom(name) values ('Mờ nhìn');

insert into symptom(name) values ('Đau mắt');
insert into symptom(name) values ('Đỏ mắt');
insert into symptom(name) values ('Cận thị');
insert into symptom(name) values ('Viễn thị');
insert into symptom(name) values ('Măt nhìn xa không rõ');
insert into symptom(name) values ('Chảy nước mắt');
insert into symptom(name) values ('Sưng mí mắt');
insert into symptom(name) values ('Mất thị lực');
insert into symptom(name) values ('Mắt khô');
insert into symptom(name) values ('Mắt nhìn không rõ');

insert into symptom(name) values ('Sưng amidan');
insert into symptom(name) values ('Mất ngửi');
insert into symptom(name) values ('Chảy nước mũi');
insert into symptom(name) values ('Ho khan');
insert into symptom(name) values ('Khó nuốt');
insert into symptom(name) values ('Tiếng ồn trong tai');
insert into symptom(name) values ('Viêm xoang');
insert into symptom(name) values ('Ngứa mũi');
insert into symptom(name) values ('Mũi thở không đều');
insert into symptom(name) values ('Tai chảy mũ');

insert into symptom(name) values ('Tăng huyết áp');
insert into symptom(name) values ('Hạ huyết áp');
insert into symptom(name) values ('Căng thẳng');
insert into symptom(name) values ('Sự thay đổi tâm trạng');
insert into symptom(name) values ('Giảm ham muốn tình dục');
insert into symptom(name) values ('Tăng nồng độ mỡ trong máu');
insert into symptom(name) values ('Tiền mãn kinh');
insert into symptom(name) values ('Sự thay đổi cảm xúc');
insert into symptom(name) values ('Sự thay đổi thói quen ngủ');
insert into symptom(name) values ('Rối loạn kinh nguyệt');

insert into symptom(name) values ('Tiêu chảy');
insert into symptom(name) values ('Đầy hơi');
insert into symptom(name) values ('Khó tiêu');
insert into symptom(name) values ('Tiêu hóa kém');
insert into symptom(name) values ('Ăn không ngon');
insert into symptom(name) values ('Nôn liên tục khi ăn');
insert into symptom(name) values ('Trào ngược dạ dày');
insert into symptom(name) values ('Nấc cụt');
insert into symptom(name) values ('Đi đại tiện mất kiểm soát');
insert into symptom(name) values ('Ăn không tiêu');

insert into symptom(name) values ('Ho ra máu');
insert into symptom(name) values ('Ho không kiểm soát');
insert into symptom(name) values ('Sỗ mũi');
insert into symptom(name) values ('Ngạt mũi');
insert into symptom(name) values ('Thở không đều');
insert into symptom(name) values ('Nặng ở lòng ngực');
insert into symptom(name) values ('Mệt mỏi khi thở');
insert into symptom(name) values ('Tình trạng lo âu');
insert into symptom(name) values ('Đau khi nuốt');
insert into symptom(name) values ('Hắt hơi liên tục');

insert into symptom(name) values ('Nói lắp');
insert into symptom(name) values ('Nhức đầu');
insert into symptom(name) values ('Mất trí nhớ trong thời gian ngắn');
insert into symptom(name) values ('Co giật toàn thân ');
insert into symptom(name) values ('Thay đổi tính cách');
insert into symptom(name) values ('Rối loạn giác quan');
insert into symptom(name) values ('Đau và yếu cơ');
insert into symptom(name) values ('Đau đầu một cách thường xuyên');
insert into symptom(name) values ('Suy giảm nhận thức');
insert into symptom(name) values ('Khó vận động');

insert into specialist(name) values ('Tim mạch');
insert into specialist(name) values ('Nhi khoa');
insert into specialist(name) values ('Da liễu');
insert into specialist(name) values ('Răng hàm mặt');
insert into specialist(name) values ('Mắt');
insert into specialist(name) values ('Tai mũi họng');
insert into specialist(name) values ('Nội tiết');
insert into specialist(name) values ('Tiêu hóa');
insert into specialist(name) values ('Hô hấp');
insert into specialist(name) values ('Thần kinh');


insert into specialist_symptom(specialist_id, symptom_id) values (1, 1);
insert into specialist_symptom(specialist_id, symptom_id) values (1, 2);
insert into specialist_symptom(specialist_id, symptom_id) values (1, 3);
insert into specialist_symptom(specialist_id, symptom_id) values (1, 4);
insert into specialist_symptom(specialist_id, symptom_id) values (1, 5);
insert into specialist_symptom(specialist_id, symptom_id) values (1, 6);
insert into specialist_symptom(specialist_id, symptom_id) values (1, 7);
insert into specialist_symptom(specialist_id, symptom_id) values (1, 8);
insert into specialist_symptom(specialist_id, symptom_id) values (1, 9);
insert into specialist_symptom(specialist_id, symptom_id) values (1, 10);

insert into specialist_symptom(specialist_id, symptom_id) values (2, 11);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 12);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 13);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 14);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 15);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 16);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 17);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 18);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 19);
insert into specialist_symptom(specialist_id, symptom_id) values (2, 20);


insert into specialist_symptom(specialist_id, symptom_id) values (3, 21);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 22);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 23);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 24);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 25);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 26);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 27);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 28);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 29);
insert into specialist_symptom(specialist_id, symptom_id) values (3, 30);

insert into specialist_symptom(specialist_id, symptom_id) values (4, 31);
insert into specialist_symptom(specialist_id, symptom_id) values (4, 32);
insert into specialist_symptom(specialist_id, symptom_id) values (4, 33);
insert into specialist_symptom(specialist_id, symptom_id) values (4, 34);
insert into specialist_symptom(specialist_id, symptom_id) values (4, 35);
insert into specialist_symptom(specialist_id, symptom_id) values (4, 36);
insert into specialist_symptom(specialist_id, symptom_id) values (4, 37);
insert into specialist_symptom(specialist_id, symptom_id) values (4, 38);
insert into specialist_symptom(specialist_id, symptom_id) values (4, 39);
insert into specialist_symptom(specialist_id, symptom_id) values (4, 40);

insert into specialist_symptom(specialist_id, symptom_id) values (5, 41);
insert into specialist_symptom(specialist_id, symptom_id) values (5, 42);
insert into specialist_symptom(specialist_id, symptom_id) values (5, 43);
insert into specialist_symptom(specialist_id, symptom_id) values (5, 44);
insert into specialist_symptom(specialist_id, symptom_id) values (5, 45);
insert into specialist_symptom(specialist_id, symptom_id) values (5, 46);
insert into specialist_symptom(specialist_id, symptom_id) values (5, 47);
insert into specialist_symptom(specialist_id, symptom_id) values (5, 48);
insert into specialist_symptom(specialist_id, symptom_id) values (5, 49);
insert into specialist_symptom(specialist_id, symptom_id) values (5, 50);

insert into specialist_symptom(specialist_id, symptom_id) values (6, 51);
insert into specialist_symptom(specialist_id, symptom_id) values (6, 52);
insert into specialist_symptom(specialist_id, symptom_id) values (6, 53);
insert into specialist_symptom(specialist_id, symptom_id) values (6, 54);
insert into specialist_symptom(specialist_id, symptom_id) values (6, 55);
insert into specialist_symptom(specialist_id, symptom_id) values (6, 56);
insert into specialist_symptom(specialist_id, symptom_id) values (6, 57);
insert into specialist_symptom(specialist_id, symptom_id) values (6, 58);
insert into specialist_symptom(specialist_id, symptom_id) values (6, 59);
insert into specialist_symptom(specialist_id, symptom_id) values (6, 60);

insert into specialist_symptom(specialist_id, symptom_id) values (7, 61);
insert into specialist_symptom(specialist_id, symptom_id) values (7, 62);
insert into specialist_symptom(specialist_id, symptom_id) values (7, 63);
insert into specialist_symptom(specialist_id, symptom_id) values (7, 64);
insert into specialist_symptom(specialist_id, symptom_id) values (7, 65);
insert into specialist_symptom(specialist_id, symptom_id) values (7, 66);
insert into specialist_symptom(specialist_id, symptom_id) values (7, 67);
insert into specialist_symptom(specialist_id, symptom_id) values (7, 68);
insert into specialist_symptom(specialist_id, symptom_id) values (7, 69);
insert into specialist_symptom(specialist_id, symptom_id) values (7, 70);

insert into specialist_symptom(specialist_id, symptom_id) values (8, 71);
insert into specialist_symptom(specialist_id, symptom_id) values (8, 72);
insert into specialist_symptom(specialist_id, symptom_id) values (8, 73);
insert into specialist_symptom(specialist_id, symptom_id) values (8, 74);
insert into specialist_symptom(specialist_id, symptom_id) values (8, 75);
insert into specialist_symptom(specialist_id, symptom_id) values (8, 76);
insert into specialist_symptom(specialist_id, symptom_id) values (8, 77);
insert into specialist_symptom(specialist_id, symptom_id) values (8, 78);
insert into specialist_symptom(specialist_id, symptom_id) values (8, 79);
insert into specialist_symptom(specialist_id, symptom_id) values (8, 80);

insert into specialist_symptom(specialist_id, symptom_id) values (9, 81);
insert into specialist_symptom(specialist_id, symptom_id) values (9, 82);
insert into specialist_symptom(specialist_id, symptom_id) values (9, 83);
insert into specialist_symptom(specialist_id, symptom_id) values (9, 84);
insert into specialist_symptom(specialist_id, symptom_id) values (9, 85);
insert into specialist_symptom(specialist_id, symptom_id) values (9, 86);
insert into specialist_symptom(specialist_id, symptom_id) values (9, 87);
insert into specialist_symptom(specialist_id, symptom_id) values (9, 88);
insert into specialist_symptom(specialist_id, symptom_id) values (9, 89);
insert into specialist_symptom(specialist_id, symptom_id) values (9, 90);

insert into specialist_symptom(specialist_id, symptom_id) values (10, 91);
insert into specialist_symptom(specialist_id, symptom_id) values (10, 92);
insert into specialist_symptom(specialist_id, symptom_id) values (10, 93);
insert into specialist_symptom(specialist_id, symptom_id) values (10, 94);
insert into specialist_symptom(specialist_id, symptom_id) values (10, 95);
insert into specialist_symptom(specialist_id, symptom_id) values (10, 96);
insert into specialist_symptom(specialist_id, symptom_id) values (10, 97);
insert into specialist_symptom(specialist_id, symptom_id) values (10, 98);
insert into specialist_symptom(specialist_id, symptom_id) values (10, 99);
insert into specialist_symptom(specialist_id, symptom_id) values (10, 100);


insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Phạm Bảo Ngân', 1, false, 'https://robohash.org/smith');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Nguyễn Việt Nghĩa', 2, true, 'https://robohash.org/jones');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Nguyễn Danh Tân', 3, false, 'https://robohash.org/williams');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Lê Viết', 1, false, 'https://robohash.org/smith');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Nguyễn Xuân Danh', 2, true, 'https://robohash.org/jones');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Trần Bá Ngọc', 3, true, 'https://robohash.org/williams');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Đỗ Trung Minh', 1, false, 'https://robohash.org/smith');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Cẩm Lệ', 2, true, 'https://robohash.org/jones');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Mai Thị Lệ', 3, false, 'https://robohash.org/williams');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Hồng Vân', 4, true, 'https://robohash.org/williams');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Văn Hồng', 5, true, 'https://robohash.org/williams');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Bùi Trọng Nghĩa', 6, true, 'https://robohash.org/williams');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Lê Văn Xuân', 7, true, 'https://robohash.org/williams');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Hoàng Quốc Việt', 8, true, 'https://robohash.org/williams');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Lê Quang Chinh', 9, true, 'https://robohash.org/williams');
insert into doctor(name, specialist_id, is_male, image) values ('Bác sĩ Hồng Vân', 10, true, 'https://robohash.org/williams');



insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-21 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (1, '2023-05-21 09:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (2, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (2, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (2, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (2, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (2, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (2, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (3, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (3, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (3, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (3, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (3, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (3, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (4, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (4, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (4, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (4, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (4, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (4, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (5, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (5, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (5, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (5, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (5, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (5, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (6, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (6, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (6, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (6, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (6, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (6, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (7, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (7, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (7, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (7, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (7, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (7, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (8, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (8, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (8, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (8, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (8, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (8, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (9, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (9, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (9, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (9, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (9, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (9, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (10, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (10, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (10, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (10, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (10, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (10, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (11, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (11, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (11, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (11, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (11, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (11, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (12, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (12, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (12, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (12, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (12, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (12, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (13, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (13, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (13, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (13, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (13, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (13, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (14, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (14, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (14, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (14, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (14, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (14, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (15, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (15, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (15, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (15, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (15, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (15, '2023-05-20 15:00:00', 4);

insert into schedule(doctor_id, appointment_date, max_patient) values (16, '2023-05-20 08:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (16, '2023-05-20 09:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (16, '2023-05-20 10:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (16, '2023-05-20 13:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (16, '2023-05-20 14:00:00', 4);
insert into schedule(doctor_id, appointment_date, max_patient) values (16, '2023-05-20 15:00:00', 4);

