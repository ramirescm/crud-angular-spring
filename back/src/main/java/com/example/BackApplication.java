package com.example;

import com.example.model.Course;
import com.example.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class BackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackApplication.class, args);
	}
	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();
			Course course = new Course();
			course.setName("Angular with Spring");
			course.setCategory("Front-end");

			courseRepository.save(course);
		};
	}

//	@Bean
//	DataSource getDataSource() {
//		return DataSourceBuilder.create()
//				.driverClassName("com.mysql.cj.jdbc.Driver")
//				.url("jdbc:mysql://localhost:3308/golang_rest_api")
//				.username("root")
//				.password("admin")
//				.build();
//	}
}
