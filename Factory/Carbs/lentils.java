package Factory.Carbs;

public class lentils implements carbs
{
    @Override
    public carbs makeCarbs()
    {
        return new lentils();
    }

    public String toString()
    {
        return "Lentils";
    }
}
