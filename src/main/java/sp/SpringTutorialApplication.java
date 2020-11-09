package sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import sp.mail.service.ConfigurationPropertiesMail;


@SpringBootApplication
@EnableConfigurationProperties(ConfigurationPropertiesMail.class)
public class SpringTutorialApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringTutorialApplication.class, args);

    }
}
