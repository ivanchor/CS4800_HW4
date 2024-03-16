package Factory.Fats;

import Factory.Carbs.bread;
import Factory.Carbs.carbs;

public class peanuts implements fats
{
    @Override
    public fats makeFats()
    {
        return new peanuts();
    }

    public String toString()
    {
        return "Peanuts";
    }
}
