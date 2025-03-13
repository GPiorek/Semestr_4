package pl.pjatk.gprpior.Sandbox;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ThirdComponent {

    private final FirstComponent firstComponent;
    private final SecondComponent secondComponent;

    public ThirdComponent(ApplicationContext applicationContext, FirstComponent firstComponent, SecondComponent secondComponent) {
        applicationContext.getBean("secondComponent", SecondComponent.class);
        applicationContext.getBean("firstComponent", FirstComponent.class);
        this.firstComponent = firstComponent;
        firstComponent.firstComponentMessage();
        this.secondComponent = secondComponent;
        secondComponent.secondComponentMessage();
        List<String> defaultData = applicationContext.getBean("defaultData", List.class);
        System.out.println("List:" + defaultData);
    }
}
