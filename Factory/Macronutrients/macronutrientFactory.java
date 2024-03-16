package Factory.Macronutrients;

import Factory.Carbs.carbs;
import Factory.Protein.protein;
import Factory.Fats.fats;

public abstract class macronutrientFactory
{

    public abstract carbs getCarb(String type);
    public abstract fats getFat(String type);
    public abstract protein getProtein(String type);



}
