package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*set up default configuration
starts spring application context
performs class path scan
starts Tomcat server*/

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {

		SpringApplication.run(CourseApiApp.class, args);
		
	}

}



