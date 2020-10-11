package sp.contextconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigurableEnvironment env = context.getEnvironment();
      //  env.setActiveProfiles("qa");

        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
            Arrays.stream(env.getActiveProfiles()).forEach(a-> System.out.println(a));
            BeanA beanA = context.getBean(BeanA.class);
            BeanB beanb = context.getBean(BeanB.class);
            BeanD beanD = context.getBean(BeanD.class);
        }
    }
}
