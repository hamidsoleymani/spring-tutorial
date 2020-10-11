package sp.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class EmailService {
    private final ConfigurationPropertiesMail mailConfig;
    private final JavaMailSenderImpl javaMailSender;

    @Autowired
    public EmailService(JavaMailSenderImpl javaMailSender, ConfigurationPropertiesMail configurationPropertiesMail) {
        this.javaMailSender = javaMailSender;
        Properties props = this.javaMailSender.getJavaMailProperties();
       // props.put("mail.transport.protocol", "smtp");
      //  props.put("mail.smtp.auth", "true");
       // props.put("mail.smtp.starttls.enable", "true");
       // props.put("mail.debug", "true");
        this.mailConfig = configurationPropertiesMail;
    }


    public void sendMail(String toEmail, String url) {

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo(toEmail);
        mailMessage.setSubject(mailConfig.getSubject());
        mailMessage.setText(mailConfig.getMessage() + url);

        mailMessage.setFrom(mailConfig.getFrom());

        javaMailSender.send(mailMessage);
    }
}
