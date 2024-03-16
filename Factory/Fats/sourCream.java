package Factory.Fats;

import Factory.Carbs.bread;
import Factory.Carbs.carbs;

public class sourCream implements fats
{
    @Override
    public fats makeFats()
    {
        return new sourCream();
    }

    public String toString()
    {
        return "Sour Cream";
    }
}
