package pl.pjatk.grzpio.Interface;

import org.springframework.stereotype.Service;

@Service
public class DevService implements HandlerServiceInterface {
    public void helloMessage() {
        System.out.println("Hello from Dev");
    }
}
