package pl.pjatk.gprpior;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Zjazd1Application {

    public static void main(String[] args) {
        SpringApplication.run(Zjazd1Application.class, args);
    }
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
}
