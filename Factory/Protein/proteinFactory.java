package Factory.Protein;

import Factory.Carbs.*;
import Factory.Fats.fats;
import Factory.Fats.fatsFactory;
import Factory.Macronutrients.macronutrientFactory;

import java.util.Random;

public class proteinFactory extends macronutrientFactory
{
    public proteinFactory instance;

    public macronutrientFactory getInstance() {
        if(instance == null)
            instance = new proteinFactory();
        return instance;
    }
    @Override
    public carbs getCarb(String type) {
        return null;
    }

    @Override
    public fats getFat(String type) {
        return null;
    }

    public protein getProtein(String type)
    {
        switch (type)
        {
            case "fish":
                return new fish();
            case "chicken":
                return new chicken();
            case "beef":
                return new beef();
            default:
                return new tofu();
        }
    }


}
