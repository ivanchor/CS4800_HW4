package Builder;

import java.util.ArrayList;

public class pizzaBuilder
{
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private boolean bacon;
    private boolean onions;
    private boolean extraCheese;
    private boolean peppers;
    private boolean chicken;
    private boolean olives;
    private boolean spinach;
    private boolean tomatoAndBasil;
    private boolean beef;
    private boolean ham;
    private boolean pesto;
    private boolean spicyPork;
    private boolean hamAndPineapple;
    private ArrayList<String> toppings = new ArrayList<String>();
    private String pizzaSize;
    private pizzaStore pizzaStore;

    public pizzaBuilder setPepperoni(boolean pepperoni)
    {
        this.pepperoni = pepperoni;
        toppings.add("Pepperoni");
        return this;
    }

    public pizzaBuilder setSausage(boolean sausage)
    {
        this.sausage = sausage;
        toppings.add("Sausage");
        return this;
    }

    public pizzaBuilder setMushrooms(boolean mushrooms)
    {
        this.mushrooms = mushrooms;
        toppings.add("Mushrooms");
        return this;
    }

    public pizzaBuilder setBacon(boolean bacon)
    {
        this.bacon = bacon;
        toppings.add("Bacon");
        return this;
    }

    public pizzaBuilder setOnions(boolean onions)
    {
        this.onions = onions;
        toppings.add("Onions");
        return this;
    }

    public pizzaBuilder setExtraCheese(boolean extraCheese)
    {
        this.extraCheese = extraCheese;
        toppings.add("Extra Cheese");
        return this;
    }

    public pizzaBuilder setPeppers(boolean peppers)
    {
        this.peppers = peppers;
        toppings.add("Peppers");
        return this;
    }

    public pizzaBuilder setChicken(boolean chicken)
    {
        this.chicken = chicken;
        toppings.add("Chicken");
        return this;
    }

    public pizzaBuilder setOlives(boolean olives)
    {
        this.olives = olives;
        toppings.add("Olives");
        return this;
    }

    public pizzaBuilder setSpinach(boolean spinach)
    {
        this.spinach = spinach;
        toppings.add("Spinach");
        return this;
    }

    public pizzaBuilder setTomatoAndBasil(boolean tomatoAndBasil)
    {
        this.tomatoAndBasil = tomatoAndBasil;
        toppings.add("Tomato and Basil");
        return this;
    }

    public pizzaBuilder setBeef(boolean beef)
    {
        this.beef = beef;
        toppings.add("Beef");
        return this;
    }

    public pizzaBuilder setHam(boolean ham)
    {
        this.ham = ham;
        toppings.add("Ham");
        return this;
    }

    public pizzaBuilder setPesto(boolean pesto)
    {
        this.pesto = pesto;
        toppings.add("Pesto");
        return this;
    }

    public pizzaBuilder setSpicyPork(boolean spicyPork)
    {
        this.spicyPork = spicyPork;
        toppings.add("Spicy Pork");
        return this;
    }

    public pizzaBuilder setHamAndPineapple(boolean hamAndPineapple)
    {
        this.hamAndPineapple = hamAndPineapple;
        toppings.add("Ham and Pineapple");
        return this;
    }

    public pizzaBuilder setPizzaSize(String pizzaSize)
    {
        this.pizzaSize = pizzaSize;
        return this;
    }

    public pizzaBuilder setPizzaStore(pizzaStore pizzaStore)
    {
        this.pizzaStore = pizzaStore;
        return this;
    }


    public pizza createPizza()
    {
        return new pizza(pepperoni, sausage, mushrooms, bacon, onions, extraCheese,
        peppers, chicken, olives, spinach, tomatoAndBasil, beef,
        ham, pesto, spicyPork, hamAndPineapple, toppings,
        pizzaSize, pizzaStore);
    }
}
