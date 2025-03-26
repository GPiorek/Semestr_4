package pl.pjatk.grzpio;

import org.springframework.stereotype.Component;

@Component
public class FirstClass {
    public FirstClass(Config config) {
        System.out.println(config.getLogin() + "\n" + config.getCredentials().getUser() + "\n" + config.getCredentials().getPassword());
    }
}
