package Factory.Protein;

public class beef implements protein
{
    @Override
    public protein makeProtein()
    {
        return new beef();
    }

    public String toString()
    {
        return "Beef";
    }
}
