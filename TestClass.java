import java.util.*;
public class TestClass
{
    public static void main(String[] args)
    {
        int option = 0;

        boolean run = true;

        Scanner input = new Scanner(System.in);

        //GroceryList groceryList = new GroceryList();
        GroceryList2 groceryList = new GroceryList2();

        while (run)
        {
            option = input.nextInt();
            switch (option)
            {
                case 0:
                System.out.println("Input a new item name: ");
                input = new Scanner(System.in);
                String newItemName = input.nextLine();


                System.out.println("Input a new item quantity: ");
                int newItemQuantity = input.nextInt();

                System.out.println("Input a new item pricePrUnit: ");
                double newItemPricePrUnit = input.nextDouble();

                GroceryItemOrder groceryItemOrder = new GroceryItemOrder(newItemName, newItemQuantity, newItemPricePrUnit);

                try
                {
                    groceryList.addItem(groceryItemOrder);
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
                    break;

                case 1:
                    groceryList.toString();
                    break;

                case 2:
                    run = false;
                    break;
            }
        }
    }
}
