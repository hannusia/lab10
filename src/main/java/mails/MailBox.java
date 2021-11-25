package mails;

import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> info;
    private MailSender sender;
    private void addMailInfo(MailInfo mailInfo){
        info.add(mailInfo);
    }
    public void sendAll(){
        for (MailInfo mailInfo : info){
            sender.sendMail(mailInfo);
        }
    }
}
