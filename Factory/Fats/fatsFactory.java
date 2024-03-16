package Factory.Fats;

import Factory.Carbs.carbs;
import Factory.Carbs.carbsFactory;
import Factory.Macronutrients.macronutrientFactory;
import Factory.Protein.protein;

import java.util.Random;

public class fatsFactory extends macronutrientFactory
{
    public fatsFactory instance;

    public macronutrientFactory getInstance() {
        if(instance == null)
            instance = new fatsFactory();
        return instance;
    }
    @Override
    public carbs getCarb(String type) {
        return null;
    }

    public fats getFat(String type)
    {
        switch (type)
        {
            case "avocado":
                return new avocado();
            case "sourCream":
                return new sourCream();
            case "tuna":
                return new tuna();
            default:
                return new peanuts();
        }
    }

    @Override
    public protein getProtein(String type) {
        return null;
    }


}
