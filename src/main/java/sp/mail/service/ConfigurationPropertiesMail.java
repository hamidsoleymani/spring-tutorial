package sp.mail.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mail")
//By default, the annotation reads from the application.properties file.
//The source file can be changed with @PropertySource annotation
//@PropertySource("classpath:mailconfig.properties")
//@Validated
public class ConfigurationPropertiesMail {


    // @NotBlank
    private String subject;
    private String message;
    private String from;
    private String to;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }


}
