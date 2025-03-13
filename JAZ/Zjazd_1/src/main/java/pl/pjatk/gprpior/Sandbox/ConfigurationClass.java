package pl.pjatk.gprpior.Sandbox;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.List;

@Configuration
public class ConfigurationClass {

    @Bean
    protected PojoClass pojoClass() {
        return new PojoClass(20, "Greg");
    }

    @Bean
    protected List<String> defaultData() {
        return List.of("A", "B", "C", "D", "E");
    }

    @Bean
    protected CustomProperty customProperty(@Value("${second.custom.property}") String value) {
        System.out.println(value);
        return new CustomProperty();
    }

    @Bean
    @ConditionalOnExpression(
            "${third.custom.property:true}")
    protected HomeworkClass homeworkClass(@Value("${third.custom.property}") Boolean value) {
        return new HomeworkClass();
    }

}
