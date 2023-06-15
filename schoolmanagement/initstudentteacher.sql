#Queries for DDL
CREATE DATABASE IF NOT EXISTS student_management;

CREATE TABLE IF NOT EXISTS students
(
    id         INTEGER PRIMARY KEY AUTO_INCREMENT,
    name       VARCHAR(50) NOT NULL,
    surname    VARCHAR(50) NOT NULL,
    age        INT         NOT NULL,
    class_name VARCHAR(50)
) ENGINE = INNODB
  CHARACTER SET utf8
  COLLATE utf8_general_ci;

CREATE TABLE IF NOT EXISTS teachers
(
    id      INTEGER PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(50) NOT NULL,
    surname VARCHAR(50) NOT NULL,
    age     INT         NOT NULL,
    salary  INT
) ENGINE = INNODB
  CHARACTER SET utf8
  COLLATE utf8_general_ci;

CREATE TABLE IF NOT EXISTS students_teachers
(
    student_id INTEGER,
    teacher_id INTEGER,
    PRIMARY KEY (student_id, teacher_id),
    FOREIGN KEY (student_id) REFERENCES students (id) ON DELETE CASCADE,
    FOREIGN KEY (teacher_id) REFERENCES teachers (id) ON DELETE CASCADE
) ENGINE = INNODB
  CHARACTER SET utf8
  COLLATE utf8_general_ci;

#Queries for inserting
INSERT INTO teachers (name, surname, age, salary)
VALUES ('NadirTeacher', 'Nadirli', 32, 1500),
       ('ElnurTeacher', 'Memmedov', 28, 2000),
       ('ZakirTeacher', 'Eliyev', 62, 3200),
       ('TahirTeacher', 'Qasimov', 54, 600);

INSERT INTO students (name, surname, age, class_name)
VALUES ('NadirStudent', 'Nadirli', 32, 'AAAAA'),
       ('ElnurStudent', 'Memmedov', 28, 'ONNNO'),
       ('ZakirStudent', 'Eliyev', 62, 'PPPAA'),
       ('TahirStudent', 'Qasimov', 54, 'QQQW'),
       ('leylaStudent', 'Selimova', 35, '_)SKK'),
       ('NinaStudent', 'Richi', 33, 'UYSS'),
       ('QaraStudent', 'Aqayev', 41, '_)SSSSS'),
       ('RaminStudent', 'Selimova', 37, 'TTT'),
       ('NicatStudent', 'Makarov', 44, '#$%%');

INSERT INTO students_teachers (student_id, teacher_id)
VALUES (1, 4),
       (1, 3),
       (2, 4),
       (2, 2),
       (4, 1),
       (3, 1),
       (3, 2),
       (1, 2),
       (4, 3),
       (4, 2);


#Queries for left, right, and inner join
SELECT DISTINCT t.name       as 'Teacher name',
                t.surname    as 'Teacher surname',
                t.age        as 'Teacher age',
                t.salary     as 'Teacher salary',
                s.name       as 'Student name',
                s.surname    as 'Student surname',
                s.age        as 'Student age',
                s.class_name as 'Student class name'
FROM teachers t JOIN students_teachers st ON t.id = st.teacher_id LEFT JOIN students s on s.id = st.student_id ORDER BY salary;
