package Cahmi.World.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@SpringBootApplication
public class DemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	/*
	@Bean
	CommandLineRunner runner(StudentRepository repository){

		return args -> {
			Address address = new Address("England","London","NE9");
			String email = "Roger@gmail.com";
			Student student = new Student(
					"Jemal",
					"Harris",
					email,
					Gender.MALE,
					address,
					List.of("Computer Science","Math"),
					BigDecimal.TEN,
					LocalDateTime.now()

			);

			//Check if Email alrady exists in database
			repository.findStudentByEmail(email)
							.ifPresentOrElse(s -> {System.out.println((s + " Already Exists"));},
					()-> {System.out.println("Not Present");});
			repository.insert(student);
		};
	}
	*/
}
