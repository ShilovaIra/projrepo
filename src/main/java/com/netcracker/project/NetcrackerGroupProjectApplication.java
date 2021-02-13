package com.netcracker.project;

import com.netcracker.project.controllers.UserController;
import com.netcracker.project.models.Users;
import com.netcracker.project.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class NetcrackerGroupProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NetcrackerGroupProjectApplication.class, args);
		//SpringApplication.run(NetcrackerGroupProjectApplication.class, args);
		UserRepository repository = context.getBean(UserRepository.class); // ok ????
//		UserController controller = new UserController(repository);
		//repository.save(new Users(Integer.toUnsignedLong(3),"kek"));
		Iterable<Users> users = repository.findAll();
		for (Users user: users) {
			System.out.println(user);
		}
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
