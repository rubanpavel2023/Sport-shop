package BuilderShop.order;


import BuilderShop.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println(" Item: " + item.name());
            System.out.println(" Manufacturer: " + item.manufacturer());
            System.out.println(" Price: " + item.price());
        }
    }
}
