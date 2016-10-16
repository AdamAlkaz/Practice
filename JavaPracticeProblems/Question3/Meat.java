public class Meat extends Food {
	double fatPerKilo;
	public Meat(String itemName, double pricePerKilo, double amountPurchased, double fatPerKilo){
		super(itemName,pricePerKilo,amountPurchased);
		this.fatPerKilo=fatPerKilo;
	}
	public double Fat(){
		return fatPerKilo;
	}

}
