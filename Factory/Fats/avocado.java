package Factory.Fats;

import Factory.Carbs.bread;
import Factory.Carbs.carbs;

public class avocado implements fats
{
    @Override
    public fats makeFats()
    {
        return new avocado();
    }

    public String toString()
    {
        return "Avocado";
    }
}
