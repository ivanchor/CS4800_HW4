package Factory.Carbs;

public class bread implements carbs
{
    @Override
    public carbs makeCarbs()
    {
        return new bread();
    }

    public String toString()
    {
        return "Bread";
    }
}
