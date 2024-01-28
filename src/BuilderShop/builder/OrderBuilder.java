package BuilderShop.builder;

import BuilderShop.items.stock.caps.BlackCap;
import BuilderShop.items.stock.caps.WhiteCap;
import BuilderShop.items.stock.shirts.BlueShirt;
import BuilderShop.items.stock.shirts.RedShirt;
import BuilderShop.order.Order;

public class OrderBuilder {
    public Order prepareOrderA() {
        Order order = new Order();
        order.addItem(new RedShirt());
        order.addItem(new WhiteCap());
        return order;
    }

    public Order prepareOrderB() {
        Order order = new Order();
        order.addItem(new BlueShirt());
        order.addItem(new BlackCap());
        return order;
    }
}
