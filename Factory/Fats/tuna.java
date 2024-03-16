package Factory.Fats;

import Factory.Carbs.bread;
import Factory.Carbs.carbs;

public class tuna implements fats
{
    @Override
    public fats makeFats()
    {
        return new tuna();
    }

    public String toString()
    {
        return "Tuna";
    }
}
