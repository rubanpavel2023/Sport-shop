package BuilderShop.items.stock.shirts;

import BuilderShop.items.Shirt;

public class BlueShirt extends Shirt {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Blue Shirt";
    }
}
