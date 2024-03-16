package Factory;

public class customer
{
    private String name;
    private String diet;

    public customer(String name, String diet)
    {
        this.name = name;
        this.diet = diet;
    }
    public String getName() {
        return name;
    }

    public String getDiet() {
        return diet;
    }
}
