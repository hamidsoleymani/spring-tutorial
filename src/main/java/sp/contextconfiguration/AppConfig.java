package sp.contextconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.annotation.PostConstruct;

@Configuration
@Import({BeanA.class, BeanB.class, BeanD.class})
public class AppConfig {

    @Autowired
    private ConfigurableEnvironment environment;

    @PostConstruct
    public void construct(){
        environment.addActiveProfile("test");
        environment.addActiveProfile("prod");
        environment.addActiveProfile("qa");
    }

}
