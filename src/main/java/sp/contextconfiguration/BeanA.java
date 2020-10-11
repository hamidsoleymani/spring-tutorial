package sp.contextconfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class BeanA {

    Logger log = LoggerFactory.getLogger(BeanA.class);

    BeanA(){
       log.info("hier in BeanA");
    }

    @Override
    public String toString() {
        return "BeanA{}";
    }
}
