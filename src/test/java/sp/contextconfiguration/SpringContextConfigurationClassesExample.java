package sp.contextconfiguration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * SpringRunner is an alias for the SpringJUnit4ClassRunner
 * To instruct Spring to load beans for the tests in the class, we annotate the class with @ContextConfiguration
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class, BookConfiguration.class})
@TestPropertySource("/book.properties")
@ActiveProfiles(profiles = {"qa", "prod", "dev", "test"})
public class SpringContextConfigurationClassesExample {

    @Autowired
    private BeanA beanA;
    @Autowired
    private BeanB beanB;
    @Autowired
    private TestBeanC testBeanC;

    @Autowired
    private BeanD testBeanD;

    @Autowired
    private BookService bookService;

    @Autowired
    private Book2Service book2Service;

    @Value("${anzahl}")
    String anzahl;

    @Test
    public void verifyBeans() {
        assertNotNull(beanA);
        assertNotNull(beanB);
        assertNotNull(testBeanC);
        assertNotNull(bookService);
        assertNotNull(book2Service);
        assertNotNull(anzahl);
        bookService.show();
    }
}
