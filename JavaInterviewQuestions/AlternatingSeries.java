//random numbers 10 numbers then summed as an alternating series
//1 - 2 + 3 - 4 .....etc

import java.util.*;

public class AlternatingSeries {
	private int finalSum;

	public AlternatingSeries (){
		int ranNum;
		int marker = 1;
		int sum = 0;
		Random rn = new Random();
		for (int i = 0; i < 10; i++){
			ranNum = rn.nextInt();
			sum += (ranNum * marker);
			marker *= -1;
			//System.out.println(ranNum);
		}
		finalSum = sum;
	}

	public int getSum (){
		return finalSum;
	}

	public static void main (String arg[]){
		AlternatingSeries Ans = new AlternatingSeries ();
		System.out.println(Ans.getSum());
	}
}
