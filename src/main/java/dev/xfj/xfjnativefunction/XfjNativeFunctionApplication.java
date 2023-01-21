package dev.xfj.xfjnativefunction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionRegistration;
import org.springframework.cloud.function.context.catalog.FunctionTypeUtils;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@SpringBootApplication
public class XfjNativeFunctionApplication implements ApplicationContextInitializer<GenericApplicationContext> {
    @Autowired
    private SpringTemplateEngine springTemplateEngine;
    Logger logger = LoggerFactory.getLogger(XfjNativeFunctionApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(XfjNativeFunctionApplication.class, args);
    }

    @Override
    public void initialize(GenericApplicationContext context) {
        context.registerBean("request", FunctionRegistration.class,
                () -> new FunctionRegistration<Function<String, String>>(request())
                        .type(FunctionTypeUtils.functionType(String.class, String.class)));
    }

    @Bean
    public Function<String, String> request() {
        return value -> {
            //https://stackoverflow.com/questions/47456045/spring-boot-thymeleaf-context-parameter-is-not-passed-to-template
            Context context = new Context();
            Map<String, Object> kv = new HashMap<>();
            kv.put("input", "aaa");
            kv.put("second", value);
            context.setVariables(kv);
            
            String html = springTemplateEngine.process("function", context);
            logger.info(html);

            return html;
        };
    }

}
