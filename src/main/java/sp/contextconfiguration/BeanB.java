package sp.contextconfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("qa")
public class BeanB {

    Logger log = LoggerFactory.getLogger(BeanB.class);

    BeanB(){
        log.info("hier in BeanB");
    }

    @Override
    public String toString() {
        return "BeanB{}";
    }
}
