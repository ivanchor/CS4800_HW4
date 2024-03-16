package Factory.Carbs;

public class pistachio implements carbs
{
    @Override
    public carbs makeCarbs()
    {
        return new pistachio();
    }

    public String toString()
    {
        return "Pistachio";
    }
}
