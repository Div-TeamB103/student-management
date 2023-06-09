package com.div.schoolmanagement;

import com.div.schoolmanagement.controller.TeacherController;
import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.info.Statics;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolmanagementApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SchoolmanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Statics.teacherList.add(new Teacher("Elcan","Elcanli",22,2,3500));
		Statics.teacherList.add(new Teacher("Elmar","Elcanli",22,3,3500));
		Statics.teacherList.add(new Teacher("Togrul","Elcanli",22,4,3500));
		Statics.teacherList.add(new Teacher("Fuad","Elcanli",22,5,3500));
		Statics.teacherList.add(new Teacher("Emil","Elcanli",22,6,3500));
	}
}
