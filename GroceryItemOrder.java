public class GroceryItemOrder
{
    private String ItemName;
    private int Quantity = 1;
    private double PricePrUnit = 0;

    public GroceryItemOrder(String itemName)
    {
        ItemName = itemName;
    }

    public GroceryItemOrder(String itemName, int quantity, double pricePrUnit)
    {
        ItemName = itemName;
        Quantity = quantity;
        PricePrUnit = pricePrUnit;
    }

    public String getItemName()
    {
        return ItemName;
    }

    public void setItemName(String itemName)
    {
        ItemName = itemName;
    }

    public int getQuantity()
    {
        return Quantity;
    }

    public double getPricePrUnit()
    {
        return PricePrUnit;
    }

    public void setQuantity(int quantity)
    {
        Quantity = quantity;
    }



    public double getCost()
    {
        double totalCost = Quantity * PricePrUnit;

        return totalCost;
    }

    @Override
    public String toString()
    {
        return "Item name: " + ItemName + "Quantity: " + Quantity + "Total Price: " + getCost();
    }
}
