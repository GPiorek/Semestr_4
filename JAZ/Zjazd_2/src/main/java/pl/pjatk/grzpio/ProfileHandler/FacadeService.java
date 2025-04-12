package pl.pjatk.grzpio.ProfileHandler;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FacadeService {
    private final QaService qaService;
    private final ProdService prodService;
    private final DevService devService;
    private final StagingService stagingService;

    public FacadeService(QaService qaService, ProdService prodService, DevService devService, StagingService stagingService) {
        this.qaService = qaService;
        this.prodService = prodService;
        this.devService = devService;
        this.stagingService = stagingService;
    }

    public void switchEnviromentMessage(String enviroment) {
        Map<String, HandlerServiceInterface> stringHandlerServiceInterfaceMap = new HashMap<>();
        stringHandlerServiceInterfaceMap.put("qa", qaService);
        stringHandlerServiceInterfaceMap.put("prod", prodService);
        stringHandlerServiceInterfaceMap.put("dev", devService);
        stringHandlerServiceInterfaceMap.put("staging", stagingService);
        stringHandlerServiceInterfaceMap.forEach((k, v) -> {
            if (enviroment.equals(k)) {
             String enviromentMessage = k;
            }
        });
    }
}


//        {
//            case "qa":
//                qaService.helloMessage();
//                break;
//            case "prod":
//                prodService.helloMessage();
//                break;
//            case "dev":
//                devService.helloMessage();
//                break;
//            case "staging":
//                stagingService.helloMessage();
//        }




