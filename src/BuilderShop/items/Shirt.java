package BuilderShop.items;

public abstract class Shirt implements Item{
    @Override
    public String manufacturer() {
        return "Active Sports";
    }
}
