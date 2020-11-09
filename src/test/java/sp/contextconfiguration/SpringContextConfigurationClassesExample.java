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
 * The @RunWith annotation is required to enable Spring integration testing and that’s why
 * we have passed the SpringJUnit4ClassRunnner class to it,
 * while @ContextConfiguration annotation specifies how to load application context.
 * The SpringJUnit4ClassRunner is a powerful class which not only loads the application context but also autowire beans into the test as well.
 * <p>
 * For example, in this test class, we needed a BookService to test itsfindByTitle()
 * method and that bean is automatically injected by SpringJUnit4ClassRunner class so we just
 * left with writing our
 * testBookService() method.
 *
 * @SpringApplicaitonCongifguation Now, coming back to @ContextConfiguration, even though it helps to load application context, it doesn’t enable logging or loads additional properties from application.properties e.g. server.port property
 * which is required to change the port of embedded tomcat server in spring boot application.
 * Since Spring 2.5, integration testing support has been offered in the form of
 * SpringJUnit4ClassRunner, a JUnit class runner that loads a Spring application context
 * for use in a JUnit test and enables autowiring of beans into the test class.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ABDConfig.class, BookConfiguration.class})
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
