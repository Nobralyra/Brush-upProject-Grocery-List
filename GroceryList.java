public class GroceryList
{
    private GroceryItemOrder[] _arrayGrocery = new GroceryItemOrder[10];
    private int _current = -1;

    public void addItem(GroceryItemOrder groceryitemorder)
    {
        _current++;
        if (_current >= 10)
        {
            throw new ArrayIndexOutOfBoundsException("Can not store more Items!");
        }
      _arrayGrocery[_current] = groceryitemorder;
    }

    public double TotalCostList()
    {
        double totalCost = 0;
        int length = _current >= 10?9:_current;
        for (int i = 0; i <= length; i++)
        {
            totalCost += _arrayGrocery[i].getCost();

        }
        return totalCost;
    }

    @Override
    public String toString()
    {
        int length = _current >= 10?9:_current;
        for (int i = 0; i <= length; i++)
        {
            System.out.println(_arrayGrocery[i].toString());
        }
        System.out.println("Total price" + TotalCostList());
        return "";
    }
}
