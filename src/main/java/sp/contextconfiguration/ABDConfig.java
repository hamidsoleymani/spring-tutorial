package sp.contextconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.annotation.PostConstruct;
/*


@ContextConfiguration is only usable in tests in other code
it doesn't do anything. @Import is useless on a test and will only be useful
on @Configuration classes to import other configuration classes
(with @ImportResource you can import XML configuration files).
 */
@Configuration
@Import({BeanA.class, BeanB.class, BeanD.class})
public class ABDConfig {

    @Autowired
    private ConfigurableEnvironment environment;

    @PostConstruct
    public void construct() {
        environment.addActiveProfile("test");
        environment.addActiveProfile("prod");
        environment.addActiveProfile("qa");
    }

}
