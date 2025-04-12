package pl.pjatk.grzpio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
//TODO przeniesc carservice do package car/service i carrepository do car/repository a car do car/model
@EnableConfigurationProperties
@SpringBootApplication
public class Zjazd2Application {

	public static void main(String[] args) {
		SpringApplication.run(Zjazd2Application.class, args);
	}

}
