package pl.pjatk.grzpio.ProfileHandler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RequestExecutor {
    final String appEnviroment;
    private final FacadeService facadeService;

    public RequestExecutor(@Value("${app.enviroment}") String appEnviroment, FacadeService facadeService) {
        this.appEnviroment = appEnviroment;
        this.facadeService = facadeService;
        this.execute(appEnviroment);
    }

    public void execute(String appEnviroment) {
        facadeService.switchEnviromentMessage(appEnviroment);
    }

}
