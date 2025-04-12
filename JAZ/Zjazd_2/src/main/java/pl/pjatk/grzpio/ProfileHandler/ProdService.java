package pl.pjatk.grzpio.ProfileHandler;

import org.springframework.stereotype.Service;

@Service
public class ProdService implements HandlerServiceInterface{
        public void helloMessage() {
        System.out.println("Hello from Prod");
    }
}
