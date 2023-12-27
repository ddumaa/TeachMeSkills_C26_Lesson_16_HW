package homework.task_5;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        //Создаю Мар с Строкой и Клиентом
        Map<String, Client> baseClient = new HashMap<>();

        //Создаю клиента
        Client client_1 = new Client("David", "Orifam", 31, new Date(), new ArrayList<>());
        //создаю заказы клиента
        Order client_1_order_1 = new Order(47, "Белые тапочки", 1);
        Order client_1_order_2 = new Order(404, "nVME", 1);
        //кладу заказы клиента в ArrayList
        client_1.clientOrder.add(client_1_order_1);
        client_1.clientOrder.add(client_1_order_2);
        //добавляю клиента в базу Мар
        baseClient.put(Passport.passport1, client_1);

        //повтор действий
        Client client_2 = new Client("Myak", "Gegerton", 21, new Date(), new ArrayList<>());
        Order client_2_order_1 = new Order(1502, "Роза", 101);
        Order client_2_order_2 = new Order(10, "Вафля", 1);
        Order client_2_order_3 = new Order(51, "Светильник", 1);
        client_2.clientOrder.add(client_2_order_1);
        client_2.clientOrder.add(client_2_order_2);
        client_2.clientOrder.add(client_2_order_3);
        baseClient.put(Passport.passport2, client_2);

        /**
         *Хотел использовать быструю возможность создания клиента и добавлять заказы, по примеру
         * baseClient.put(Passport.passport2, new Client("David", "Orifam", 31, new Date(), new ArrayList<>()));
         * но как в таком случае заполнить ArrayList ???
         */


        //так же при выводе, выводим клиента и выводится ArrayList с заказами, но выводится не совсем красиво, как это исправить?
        for (Map.Entry<String, Client> e : baseClient.entrySet()){
            System.out.println(e.toString());
        }

        System.out.println("-----------------");
        Iterator<Map.Entry<String, Client>> itr = baseClient.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<String, Client> entry =  itr.next();
            String key = entry.getKey();
            Client value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }

        System.out.println("-----------------");
        String k = baseClient.keySet().toString();
        Collection<Client> v = baseClient.values();
        System.out.println(k);
        System.out.println(v);
    }
}
