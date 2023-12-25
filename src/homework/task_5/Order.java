package homework.task_5;

import java.util.Objects;

public class Order {
    double price;
    String description;
    int units;

    public Order(double price, String description, int units) {
        this.price = price;
        this.description = description;
        this.units = units;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", units=" + units +
                '}';
    }
}
