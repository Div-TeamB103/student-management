create database exam_management;

create table parent
(
    id              int primary key auto_increment,
    name            varchar(45),
    surname         varchar(45),
    email           varchar(50),
    password        varchar(255),
    phone_number    varchar(20),
    last_login_date date,
    last_login_ip   varchar(40),
    status          tinyint(1),
    index (id)
);

create table student
(
    id              int primary key auto_increment,
    email           varchar(45),
    password        varchar(255),
    join_date       date,
    birth_date      date,
    phone_number    varchar(20),
    parent_id       int,
    status          tinyint(1),
    last_login_date date,
    last_login_ip   varchar(40),
    first_name      varchar(45),
    last_name       varchar(45),
    index (id),
    foreign key (parent_id) references parent (id)
);


create table teacher
(
    id              int primary key auto_increment,
    email           varchar(45),
    password        varchar(255),
    first_name      varchar(45),
    last_name       varchar(45),
    phone_number    varchar(20),
    brith_date      date,
    last_login_date date,
    status          tinyint(1),
    last_login_ip   varchar(40),
    salary          int,
    index (id)
);

create table classroom
(
    id          int auto_increment primary key,
    class_name  varchar(15),
    teacher_id  int,
    student_id int,
    create_year date,
    status      tinyint(1),
    foreign key (teacher_id) references teacher (id),
    foreign key (student_id) references student (id)
);

create table exam_type
(
    id          int primary key auto_increment,
    type_name   varchar(40),
    description varchar(255)
);

create table exam
(
    id           int primary key auto_increment,
    exam_type_id int,
    question_id int,
    exam_name    varchar(45),
    start_date   date,
    foreign key (exam_type_id) references exam_type (id),
    foreign key (question_id) references question (id)
);

create table exam_result
(
    id            int auto_increment,
    student_id    int,
    student_point double,
    exam_id       int,
    primary key (id, student_id, exam_id),
    foreign key (student_id) references student (id),
    foreign key (exam_id) references exam (id)

);

create table question
(
    id       int primary key auto_increment,
    question varchar(255)

);

create table question_answers
(
    id                int primary key auto_increment,
    question_id       int,
    questions_answers varchar(255),
    is_true           tinyint(1),
    foreign key (question_id) references question (id)
);