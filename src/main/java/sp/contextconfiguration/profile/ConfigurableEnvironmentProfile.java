package sp.contextconfiguration.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.annotation.PostConstruct;

@Configuration
public class ConfigurableEnvironmentProfile {

    @Autowired
    private ConfigurableEnvironment environment;

    @PostConstruct
    public void construct(){
        environment.setActiveProfiles("ga");
    }
}
