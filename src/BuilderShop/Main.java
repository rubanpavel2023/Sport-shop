package BuilderShop;

import BuilderShop.builder.OrderBuilder;
import BuilderShop.order.Order;

public class Main {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();

        Order orderA = orderBuilder.prepareOrderA();
        System.out.println("Order A:");
        orderA.showItems();
        System.out.println("--Total cost: " + orderA.getCost());

        Order orderB = orderBuilder.prepareOrderB();
        System.out.println("Order B:");
        orderB.showItems();
        System.out.println("--Total cost: " + orderB.getCost());
    }
    }

