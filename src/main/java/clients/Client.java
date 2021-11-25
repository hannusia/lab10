package clients;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class Client {
    private final int id;
    private final String name;
    private final int age;
    private final char sex;

    public Client(String name, int age, char sex){
        this.id = IdCounter.counter();
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
