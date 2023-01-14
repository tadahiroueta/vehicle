
public class TaxableItem {

	private double taxRate;
	private double listPrice;
	
	public TaxableItem(double list, double rate)
	{
		listPrice = list;
		taxRate = rate;
	}
	
	//Allows you to change the list price;
	public void changeListPrice(double list)
	{
		listPrice = list;
	}
	
	//returns the price of the item including the tax
	public double purchasePrice()
	{
		return this.listPrice * (1 + taxRate / 100);
	}
}

