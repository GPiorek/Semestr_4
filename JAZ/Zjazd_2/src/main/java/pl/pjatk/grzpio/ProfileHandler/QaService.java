package pl.pjatk.grzpio.ProfileHandler;

import org.springframework.stereotype.Service;

@Service
public class QaService implements HandlerServiceInterface {
    @Override
    public void helloMessage() {
        System.out.println("Hello from Qa");
    }
}
