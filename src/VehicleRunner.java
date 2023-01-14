import java.text.NumberFormat;

public class VehicleRunner {

	public static void main(String[] args) {
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		TaxableItem obj1 = new TaxableItem(6.50, 10);
		System.out.println(formatter.format(obj1.purchasePrice()));
		
		TaxableItem obj2 = new TaxableItem(9.99, 8.25);
		System.out.println(formatter.format(obj2.purchasePrice()));
		
		Vehicle obj3 = new Vehicle(20000, 2500, 10);
		System.out.println(formatter.format(obj3.purchasePrice()));
		obj3.changeMarkup(1000);
		System.out.println(formatter.format(obj3.purchasePrice()));
		
		Vehicle obj4 = new Vehicle(35000, 5500, 8.25);
		System.out.println(formatter.format(obj4.purchasePrice()));
		obj4.changeMarkup(4500);
		System.out.println(formatter.format(obj4.purchasePrice()));

	}

}
