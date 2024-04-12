package org.example;

import org.example.MenuItem;
import org.example.MenuItemType;

public class Main {
    public static void main(String[] args) {
        MenuItem coffee = new MenuItem("Coffee", MenuItemType.DRINK);
        MenuItem pizza = new MenuItem("Pizza", MenuItemType.DISH);
        System.out.println(coffee);
        System.out.println(pizza);
        OrderStatus status = OrderStatus.PROCESSING;
        System.out.println(status.getDescription());
        System.out.println("Заказ отменен: " + status.canCancel());
    }
}
