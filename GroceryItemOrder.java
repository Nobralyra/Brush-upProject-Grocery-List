public class GroceryItemOrder
{
    private String ItemName;
    private int Quantity;
    private double PricePrUnit;

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

    public GroceryItemOrder(String itemName)
    {
        ItemName = itemName;
    }

    public GroceryItemOrder(int quantity, double pricePrUnit)
    {
        Quantity = quantity;
        PricePrUnit = pricePrUnit;
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
