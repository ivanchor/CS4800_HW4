package Factory.Macronutrients;

import Factory.Carbs.carbsFactory;
import Factory.Fats.fatsFactory;
import Factory.Protein.proteinFactory;

import java.util.Random;

public class createMeal extends macronutrientMeal
{


    public void makeMeal(String type)
    {
        macronutrientFactory factory = new carbsFactory();
        switch(type) {
            case "paleo":

                                factory.getCarb("pistachio");
                System.out.print("Pistachio ");

                factory = new fatsFactory();
                Random rand = new Random();
                int number = rand.nextInt(3);
                switch (number) {
                    case 0:
                        factory.getFat("avocado");
                        System.out.print("Avocado ");
                        break;
                    case 1:
                        factory.getFat("tuna");
                        System.out.print("Tuna ");
                        break;
                    default:
                        factory.getFat("peanuts");
                        System.out.print("Peanuts ");
                        break;
                }

                factory = new proteinFactory();
                number = rand.nextInt(3);
                switch (number) {
                    case 0:
                        factory.getProtein("fish");
                        System.out.print("Fish ");
                        break;
                    case 1:
                        factory.getProtein("chicken");
                        System.out.print("Chicken ");
                        break;
                    default:
                        factory.getProtein("beef");
                        System.out.print("Beef ");
                        break;

                }
                break;

            case "vegan":
                factory = new carbsFactory();

                rand = new Random();
                number = rand.nextInt(3);
                switch (number) {
                    case 0:
                        factory.getCarb("bread");
                        System.out.print("Bread ");
                        break;
                    case 1:
                        factory.getCarb("lentils");
                        System.out.print("Lentils ");
                        break;
                    default:
                        factory.getCarb("pistachio");
                        System.out.print("Pistachio ");
                        break;
                }


                factory = new fatsFactory();
                number = rand.nextInt(2);
                switch (number) {
                    case 0:
                        factory.getFat("avocado");
                        System.out.print("Avocado ");
                        break;

                    default:
                        factory.getFat("peanuts");
                        System.out.print("Peanuts ");
                        break;
                }


                factory = new proteinFactory();


                        factory.getProtein("tofu");
                        System.out.print("Tofu ");

                break;


            case "nutAllergy":
                factory = new carbsFactory();

                rand = new Random();
                number = rand.nextInt(3);
                switch (number) {
                    case 0:
                        factory.getCarb("cheese");
                        System.out.print("Cheese ");
                        break;
                    case 1:
                        factory.getCarb("bread");
                        System.out.print("Bread ");
                        break;
                    default:
                        factory.getCarb("lentils");
                        System.out.print("Lentils ");
                        break;

                }


                factory = new fatsFactory();
                number = rand.nextInt(3);
                switch (number) {
                    case 0:
                        factory.getFat("avocado");
                        System.out.print("Avocado ");
                        break;
                    case 1:
                        factory.getFat("sourCream");
                        System.out.print("Sour Cream ");
                        break;
                    case 2:
                        factory.getFat("tuna");
                        System.out.print("Tuna ");
                        break;

                }


                factory = new proteinFactory();
                number = rand.nextInt(4);
                switch (number) {
                    case 0:
                        factory.getProtein("fish");
                        System.out.print("Fish ");
                        break;
                    case 1:
                        factory.getProtein("chicken");
                        System.out.print("Chicken ");
                        break;
                    case 2:
                        factory.getProtein("beef");
                        System.out.print("Beef ");
                        break;
                    default:
                        factory.getProtein("tofu");
                        System.out.print("Tofu ");
                        break;
                }
                break;

            default:

                factory = new carbsFactory();

                rand = new Random();
                number = rand.nextInt(4);
                switch (number) {
                    case 0:
                        factory.getCarb("cheese");
                        System.out.print("Cheese ");
                        break;
                    case 1:
                        factory.getCarb("bread");
                        System.out.print("Bread ");
                        break;
                    case 2:
                        factory.getCarb("lentils");
                        System.out.print("Lentils ");
                        break;
                    default:
                        factory.getCarb("pistachio");
                        System.out.print("Pistachio ");
                        break;
                }


                factory = new fatsFactory();
                number = rand.nextInt(4);
                switch (number) {
                    case 0:
                        factory.getFat("avocado");
                        System.out.print("Avocado ");
                        break;
                    case 1:
                        factory.getFat("sourCream");
                        System.out.print("Sour Cream ");
                        break;
                    case 2:
                        factory.getFat("tuna");
                        System.out.print("Tuna ");
                        break;
                    default:
                        factory.getFat("peanuts");
                        System.out.print("Peanuts ");
                        break;
                }


                factory = new proteinFactory();
                number = rand.nextInt(4);
                switch (number) {
                    case 0:
                        factory.getProtein("fish");
                        System.out.print("Fish ");
                        break;
                    case 1:
                        factory.getProtein("chicken");
                        System.out.print("Chicken ");
                        break;
                    case 2:
                        factory.getProtein("beef");
                        System.out.print("Beef ");
                        break;
                    default:
                        factory.getProtein("tofu");
                        System.out.print("Tofu ");
                        break;
                }
                break;
        }

    }

}
