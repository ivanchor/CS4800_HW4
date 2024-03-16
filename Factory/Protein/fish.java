package Factory.Protein;

public class fish implements protein
{
    @Override
    public protein makeProtein()
    {
        return new fish();
    }

    public String toString()
    {
        return "Fish";
    }
}
