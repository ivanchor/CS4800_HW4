package Builder;

public class builderDriver
{
    public static void main(String[] args)
    {
        // 3 initial pizzas
        pizza pizza1 = new pizzaBuilder().setBacon(true).setBeef(true).setChicken(true).setPizzaSize("Small").createPizza();

        pizza pizza2 = new pizzaBuilder().setPepperoni(true).setOnions(true).setOlives(true).setPesto(true)
                .setSpicyPork(true).setHam(true).setPizzaSize("Medium").createPizza();

        pizza pizza3 = new pizzaBuilder().setTomatoAndBasil(true).setPeppers(true).setHamAndPineapple(true)
                .setSausage(true).setHam(true).setExtraCheese(true)
                .setSpinach(true).setOnions(true).setPepperoni(true).setPizzaSize("Large").createPizza();

        System.out.println("First 3 pizzas");
        pizza1.eat();
        System.out.println();
        pizza2.eat();
        System.out.println();
        pizza3.eat();

        // Pizza Hut
        pizzaStore store1 = new pizzaStoreBuilder().setStoreName("Pizza Hut").createPizzaStore();
        pizza pizzaHutPizza1 = new pizzaBuilder().setBacon(true).setPepperoni(true).setMushrooms(true).setPizzaSize("Large").setPizzaStore(store1).createPizza();
        pizza pizzaHutPizza2 = new pizzaBuilder().setBeef(true).setPesto(true).setPizzaSize("Small").setPizzaStore(store1).createPizza();

        System.out.println("\n\nPizza Hut");
        pizzaHutPizza1.eat();
        System.out.println();
        pizzaHutPizza2.eat();

        // Little Caesars
        pizzaStore store2 = new pizzaStoreBuilder().setStoreName("Little Caesars").createPizzaStore();
        pizza littleCaesarsPizza1 = new pizzaBuilder().setPepperoni(true).setSausage(true).setMushrooms(true).setBacon(true).setOnions(true).setExtraCheese(true).setPeppers(true).setChicken(true)
                .setPizzaSize("Medium").setPizzaStore(store2).createPizza();
        pizza littleCaesarsPizza2 = new pizzaBuilder().setHamAndPineapple(true).setSpicyPork(true).setPesto(true).setHam(true).setBeef(true).setTomatoAndBasil(true)
                .setPizzaSize("Small").setPizzaStore(store2).createPizza();

        System.out.println("\n\nLittle Caesars");
        littleCaesarsPizza1.eat();
        System.out.println();
        littleCaesarsPizza2.eat();

        // Dominos
        pizzaStore store3 = new pizzaStoreBuilder().setStoreName("Dominos").createPizzaStore();
        pizza dominosPizza1 = new pizzaBuilder().setExtraCheese(true).setPizzaSize("Small").setPizzaStore(store3).createPizza();
        pizza dominosPizza2 = new pizzaBuilder().setMushrooms(true).setBeef(true).setPepperoni(true).setPizzaSize("Large").setPizzaStore(store3).createPizza();

        System.out.println("\n\nDominos");
        dominosPizza1.eat();
        System.out.println();
        dominosPizza2.eat();

    }
}
