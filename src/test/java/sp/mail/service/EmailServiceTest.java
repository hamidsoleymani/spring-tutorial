package sp.mail.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;
    @Autowired
    ConfigurationPropertiesMail configurationPropertiesMail;

    @Test
    public void testEmail() {
        emailService.sendMail(configurationPropertiesMail.getTo(), "url");
    }
}