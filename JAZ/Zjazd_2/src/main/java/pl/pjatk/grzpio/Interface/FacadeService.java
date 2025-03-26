package pl.pjatk.grzpio.Interface;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FacadeService {
    private final QaService qaService;
    private final ProdService prodService;
    private final DevService devService;

    public FacadeService(QaService qaService, ProdService prodService, DevService devService) {
        this.qaService = qaService;
        this.prodService = prodService;
        this.devService = devService;

    }

    public void switchEnviromentMessage(String enviroment) {
        switch (enviroment) {
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

