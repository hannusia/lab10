package mails;

import clients.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailSenderTest {
    private Client client;
    private MailInfo mailInfo;
    private MailSender mailSender;

    @BeforeEach
    void setUp() {
        client = new Client("Jimin", 27, 'm');
        mailInfo = new MailInfo(client, 34);
        mailSender = new MailSender();
    }

    @Test
    void sendMail() {
        mailSender.sendMail(mailInfo);
    }
}