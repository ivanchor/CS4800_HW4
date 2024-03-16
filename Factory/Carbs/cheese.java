package Factory.Carbs;

public class cheese implements carbs
{
    @Override
    public carbs makeCarbs()
    {
        return new cheese();
    }

    public String toString()
    {
        return "Cheese";
    }
}
