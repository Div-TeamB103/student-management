package com.div.schoolmanagement;

import com.div.schoolmanagement.entity.Student;
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

	}
}
