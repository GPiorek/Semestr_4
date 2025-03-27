package pl.pjatk.grzpio.Interface;

import org.springframework.stereotype.Service;

@Service
public class StagingService implements HandlerServiceInterface{

    @Override
    public void helloMessage() {
        System.out.println("Hello from Staging");
    }
}
