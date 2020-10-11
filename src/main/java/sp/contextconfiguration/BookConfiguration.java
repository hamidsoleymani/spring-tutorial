package sp.contextconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "sp.contextconfiguration")
@PropertySource("application.properties")
public class BookConfiguration {

    @Autowired
    BookService bookService;



    @Bean
    public Book2Service book2Service(){
        return new Book2Service();
    }

}
