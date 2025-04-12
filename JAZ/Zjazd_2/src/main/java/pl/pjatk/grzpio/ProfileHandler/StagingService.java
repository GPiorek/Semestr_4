package pl.pjatk.grzpio.ProfileHandler;

import org.springframework.stereotype.Service;

@Service
public class StagingService implements HandlerServiceInterface{

    @Override
    public void helloMessage() {
        System.out.println("Hello from Staging");
    }
}
