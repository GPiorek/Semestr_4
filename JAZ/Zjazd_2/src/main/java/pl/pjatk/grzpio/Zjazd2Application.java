package pl.pjatk.grzpio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class Zjazd2Application {

	public static void main(String[] args) {
		SpringApplication.run(Zjazd2Application.class, args);
	}

}
