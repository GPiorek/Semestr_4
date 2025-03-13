package pl.pjatk.gprpior.Sandbox;

import org.springframework.stereotype.Component;

@Component
public class SecondComponent {

    public SecondComponent(FirstComponent firstComponent) {
        System.out.println("Hello from Second Component Constructor with First Component as argument");
    }

    public void secondComponentMessage() {
        System.out.println("Hello from Second Component Method called from Third Component Constructor");
    }
}
