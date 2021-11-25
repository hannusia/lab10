package mails;

public class MailSender {
    public void sendMail(MailInfo info){
        System.out.println("Mail " + info.getMailCode() + " to " + info.getClient() + " was sent successfully!");
    }
}
