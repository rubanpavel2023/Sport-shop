package BuilderShop.items.stock.shirts;

import BuilderShop.items.Shirt;

public class RedShirt extends Shirt {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Red Shirt";
    }

}
