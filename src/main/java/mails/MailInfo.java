package mails;

import clients.Client;
import lombok.Getter;

@Getter
public class MailInfo {
    private Client client;
    private int mailCode;

    public MailInfo(Client client, int mailCode){
        this.client = client;
        this.mailCode = mailCode;
    }
}
