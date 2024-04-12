package org.example;

enum MenuItemType{
    DRINK,
    DISH
}


public class MenuItem {
    private String name;
    private MenuItemType type;

    public MenuItem(String name, MenuItemType type){
        this.name = name;
        this.type = type;
    }
    public String getName(){
        return name;
    }
    public MenuItemType getType(){
        return type;
    }
    public String toString(){
        return "Name:" + name + ", Type:" + type;
    }
}

enum OrderStatus {
        PENDING,
        PROCESSING,
        SHIPPED,
        DELIVERED,
        CANCELLED;
        public String getDescription(){
            switch (this){
                case CANCELLED:
                    return "Заказ отменен";
                case DELIVERED:
                    return "Заказ доставлен";
                case SHIPPED:
                    return "Заказ отправлен";
                case PROCESSING:
                    return "Заказ в процессе";
                case PENDING:
                    return "Заказ ожидается";
                default:
                    return "Неизвестно";

                }
            }
            public boolean canCancel(){
            return this == PENDING || this == PROCESSING;
            }
        }




