package pl.pjatk.gprpior.Sandbox;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class FirstComponent {

    public FirstComponent(@Value("${my.custom.property:Default value}") String valueFromProperties) {
        System.out.println("Hello from FirstComponent Constructor");
        System.out.println(valueFromProperties);
    }

    public void firstComponentMessage() {
        System.out.println("Hello from First Component Method called from Third Component Constructor");
    }

}
