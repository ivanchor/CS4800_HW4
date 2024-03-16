package Factory;

import Factory.Carbs.carbsFactory;
import Factory.Macronutrients.macronutrientMeal;
import Factory.Macronutrients.createMeal;

public class factoryDriver
{
    public static void main(String [] args)
    {
        carbsFactory cFactory = new carbsFactory();

        customer customer1 = new customer("John", "none");
        customer customer2 = new customer("Steve", "paleo");
        customer customer3 = new customer("Arthur", "vegan");
        customer customer4 = new customer("Sam", "nutAllergy");
        customer customer5 = new customer("Smith", "anything");
        customer customer6 = new customer("Abby", "paleo");


        macronutrientMeal meal1 = new createMeal();

        System.out.print(customer1.getName() + " " + customer1.getDiet() + " diet ");
        meal1.makeMeal(customer1.getDiet());

        System.out.print("\n" + customer2.getName() + " " + customer2.getDiet() + " diet ");
        meal1.makeMeal(customer2.getDiet());

        System.out.print("\n" + customer3.getName() + " " + customer3.getDiet() + " diet ");
        meal1.makeMeal(customer3.getDiet());

        System.out.print("\n" + customer4.getName() + " " + customer4.getDiet() + " diet ");
        meal1.makeMeal(customer4.getDiet());

        System.out.print("\n" + customer5.getName() + " " + customer5.getDiet() + " diet ");
        meal1.makeMeal(customer5.getDiet());

        System.out.print("\n" + customer6.getName() + " " + customer6.getDiet() + " diet ");
        meal1.makeMeal(customer6.getDiet());


    }
}
