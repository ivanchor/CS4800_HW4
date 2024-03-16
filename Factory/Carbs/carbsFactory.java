package Factory.Carbs;

import Factory.Fats.*;
import Factory.Macronutrients.macronutrientFactory;
import Factory.Protein.protein;

import java.util.Random;

public class carbsFactory extends macronutrientFactory
{
    public carbsFactory instance;

    public macronutrientFactory getInstance() {
        if(instance == null)
            instance = new carbsFactory();
        return instance;
    }

    public carbs getCarb(String type)
    {
        switch (type)
        {
            case "cheese":
                return new cheese();

            case "bread": {
                return new bread();

            }
            case "lentils":
                return new lentils();
            default:
                return new pistachio();
        }
    }

    @Override
    public fats getFat(String type) {
        return null;
    }

    @Override
    public protein getProtein(String type) {
        return null;
    }




}
