package Pizza;

public class pizzaStoreBuilder
{
    private String storeName;

    public pizzaStoreBuilder setStoreName(String storeName)
    {
        this.storeName = storeName;
        return this;
    }

    public pizzaStore createPizzaStore()
    {
        return new pizzaStore(storeName);
    }

}
