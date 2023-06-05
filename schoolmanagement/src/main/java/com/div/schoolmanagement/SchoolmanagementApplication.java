package com.div.schoolmanagement;

import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.info.Statics;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SchoolmanagementApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SchoolmanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Statics.studentList.addAll(
				List.of(
				new Student(1,"Ali","Alizade",15,"5b"),
				new Student(2,"Zaur","Aqilov",18,"6b"),
				new Student(3,"Aqil","Valiyev",17,"6a"),
				new Student(4,"Asim","Adilov",16,"5c"),
				new Student(5,"Togrul","Aliyev",19,"7b")
				)
		);
		Statics.teacherList.addAll(
				List.of(
				new Teacher(1,"Zakir","Teymurov",15,500),
				new Teacher(2,"Adil","Qarayev",18,800),
				new Teacher(3,"Vazeh","Valiyev",17,1000)
				)
		);

	}
}
