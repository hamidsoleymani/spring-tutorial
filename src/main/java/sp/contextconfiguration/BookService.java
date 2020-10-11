package sp.contextconfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private static final Logger LOG = LoggerFactory.getLogger(BookService.class);
    @Value("${test.message}")
    private String message;

    public void  show(){
        System.out.println("in bookservice class: " + message);
        LOG.info(message);

    }
}
