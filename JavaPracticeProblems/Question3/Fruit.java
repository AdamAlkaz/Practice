public class Fruit extends Food{
	public Fruit (String itemName, double pricePerKilo, double amountPurchased){
		super(itemName,pricePerKilo,amountPurchased);
		super.increaseWeightOfFruit(amountPurchased);
	}
	public double Fat(){
		return 0;
	}
}
