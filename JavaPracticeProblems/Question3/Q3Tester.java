public class Q3Tester {
	public static void main (String a[]){
		Food myGrocery[]=new Food [5];
		Food oneFoodItem;
		myGrocery[0]=new Fruit("Apple",1.50,4.0);
		myGrocery[1]=new Meat("Chicken",2.50,2.0,150.0);
		myGrocery[2]=new Fruit("Orange",2.00,3.0);
		myGrocery[3]=new Meat("Lamb",5.00,2.0,200.0);
		myGrocery[4]=new Fruit("Bananas",1.00,3.0);
		for (int i=0;i<myGrocery.length;i++){
			oneFoodItem=myGrocery[i];
			System.out.println(oneFoodItem);
		}
		System.out.println("Total weight of all fruit is "+Food.totalWeightOfAllFruitPurchased()+"Kg");
	}
}
