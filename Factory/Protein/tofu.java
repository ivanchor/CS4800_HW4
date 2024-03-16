package Factory.Protein;

public class tofu implements protein
{
    @Override
    public protein makeProtein()
    {
        return new tofu();
    }

    public String toString()
    {
        return "Tofu";
    }
}
