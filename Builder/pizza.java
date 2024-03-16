package Builder;

import java.util.ArrayList;

public class pizza
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
    private ArrayList<String> toppings;
    private String pizzaSize;
    private pizzaStore pizzaStore;

    public pizza(boolean pepperoni, boolean sausage, boolean mushrooms, boolean bacon, boolean onions, boolean extraCheese,
                 boolean peppers, boolean chicken, boolean olives, boolean spinach, boolean tomatoAndBasil, boolean beef,
                 boolean ham, boolean pesto, boolean spicyPork, boolean hamAndPineapple, ArrayList<String> toppings,
                 String pizzaSize, pizzaStore pizzaStore )
    {
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.bacon = bacon;
        this.onions = onions;
        this.extraCheese = extraCheese;
        this.peppers = peppers;
        this.chicken = chicken;
        this.olives = olives;
        this.spinach = spinach;
        this.tomatoAndBasil = tomatoAndBasil;
        this.beef = beef;
        this.ham = ham;
        this.pesto = pesto;
        this.spicyPork = spicyPork;
        this.hamAndPineapple = hamAndPineapple;
        this.toppings = toppings;
        this.pizzaSize = pizzaSize;
        this.pizzaStore = pizzaStore;
    }


    public void eat()
    {
        if(pizzaStore == null)
            System.out.print(pizzaSize +  " pizza with ");
        else
            System.out.print(pizzaSize + " " + pizzaStore + " pizza with ");
        for(String topping : toppings)
        {
            System.out.print(topping + ", ");
        }
    }

}
