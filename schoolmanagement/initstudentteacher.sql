CREATE DATABASE IF NOT EXISTS student_management;

CREATE TABLE IF NOT EXISTS student_management.students
(
    id         INTEGER PRIMARY KEY AUTO_INCREMENT,
    name       VARCHAR(50) NOT NULL,
    surname    VARCHAR(50) NOT NULL,
    age        INT         NOT NULL,
    class_name VARCHAR(50)
) ENGINE=INNODB CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE IF NOT EXISTS student_management.teachers
(
    id      INTEGER PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(50) NOT NULL,
    surname VARCHAR(50) NOT NULL,
    age     INT         NOT NULL,
    salary  INT
) ENGINE=INNODB CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE IF NOT EXISTS student_management.students_teachers
(
    student_id   INTEGER,
    teacher_id   INTEGER,
    PRIMARY KEY (student_id, teacher_id),
    FOREIGN KEY (student_id) REFERENCES students (id) ON DELETE CASCADE,
    FOREIGN KEY (teacher_id) REFERENCES teachers (id) ON DELETE CASCADE
) ENGINE=INNODB CHARACTER SET utf8 COLLATE utf8_general_ci;
