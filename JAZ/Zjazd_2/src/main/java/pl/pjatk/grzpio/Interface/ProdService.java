package pl.pjatk.grzpio.Interface;

import org.springframework.stereotype.Service;

@Service
public class ProdService implements HandlerServiceInterface{
        public void helloMessage() {
        System.out.println("Hello from Prod");
    }
}
