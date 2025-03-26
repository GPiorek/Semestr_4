package pl.pjatk.grzpio.Interface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FacadeService {


    public FacadeService(@Value("${app.enviroment}") String appEnviroment, QaService qaService, ProdService prodService, DevService devService) {
        switch (appEnviroment) {
            case "qa":
                qaService.helloMessage();
                break;
            case "prod":
                prodService.helloMessage();
                break;
            case "dev":
                devService.helloMessage();
                break;
        }
    }
}

