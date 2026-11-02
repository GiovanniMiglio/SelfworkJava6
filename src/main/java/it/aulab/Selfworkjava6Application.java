package it.aulab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import it.aulab.services.JeegService;

@SpringBootApplication
public class Selfworkjava6Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Selfworkjava6Application.class, args);
		context.getBean(JeegService.class).fight();

	}

}
