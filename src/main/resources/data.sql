INSERT INTO sr_university (university_name) VALUES ('University One');

INSERT INTO sr_faculty (university_id, faculty_name) VALUES(1, 'Faculty One');

INSERT INTO sr_student (last_name, first_name, middle_name, date_of_birth,
passport_seria, passport_number, passport_date)
VALUES('last', 'First', 'Middle', '2000-4-12', '1111', '222222','2016-4-30');

INSERT INTO sr_student_document (document_number, document_date, expired_date,
student_id, faculty_id, student_form)
VALUES('123456', '2017-09-01', '2021-05-31', 1 ,1,0)