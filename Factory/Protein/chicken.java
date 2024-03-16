package Factory.Protein;

public class chicken implements protein
{
    @Override
    public protein makeProtein()
    {
        return new chicken();
    }

    public String toString()
    {
        return "Chicken";
    }
}
