package sp.contextconfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class BeanD {

    Logger log = LoggerFactory.getLogger(BeanD.class);

    BeanD(){
        log.info("hier in BeanD");
    }

    @Override
    public String toString() {
        return "BeanD{}";
    }
}
