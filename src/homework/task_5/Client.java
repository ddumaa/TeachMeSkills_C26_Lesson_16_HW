package homework.task_5;

import java.util.Date;
import java.util.List;

public class Client {
    String firstname;
    String lastname;
    int age;
    Date dateRegistration;
    List<Order> clientOrder;

    public Client(String firstname, String lastname, int age, Date dateRegistration, List<Order> clientOrder) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.dateRegistration = dateRegistration;
        this.clientOrder = clientOrder;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", dateRegistration=" + dateRegistration +
                ", clientOrder=" + clientOrder +
                '}';
    }
}
