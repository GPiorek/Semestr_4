package pl.pjatk.grzpio.Interface;

import org.springframework.stereotype.Service;

@Service
public class QaService implements HandlerServiceInterface {
    @Override
    public void helloMessage() {
        System.out.println("Hello from Qa");
    }
}
