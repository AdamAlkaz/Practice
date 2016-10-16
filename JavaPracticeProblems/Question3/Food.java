public abstract class Food {
	private int itemNumber;
	private static int nextItemNumber =1;
	private static double totalWeightOfAllFruit = 0;
	private String itemName;
	private double pricePerKilo;
	private double amountPurchased;
	public Food (String itemName, double pricePerKilo, double amountPurchased){
		this.itemName=itemName;
		this.pricePerKilo=pricePerKilo;
		this.amountPurchased=amountPurchased;
		itemNumber =nextItemNumber;
		nextItemNumber++;
	}
	public static void increaseWeightOfFruit(double weight){
		totalWeightOfAllFruit+=weight;
	}
	public static double totalWeightOfAllFruitPurchased(){
		return totalWeightOfAllFruit;
	}
	public String toString(){
		return (itemNumber+" "+itemName+" "+amountPurchased+" Kg. Price is $" + amountPurchased*pricePerKilo+" fat content is "+Fat()*amountPurchased+" grams");
	}
	public abstract double Fat();
}
