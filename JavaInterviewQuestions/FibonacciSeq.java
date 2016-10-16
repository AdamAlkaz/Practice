public class FibonacciSeq {
	public static void main (String args[]){
		long preVal1 = 0, preVal2 = 1, currVal;
		System.out.println(1);
		for (long i = 0; i < 10; i++){
			currVal = preVal1 + preVal2;
			System.out.println(currVal);
			preVal1 = preVal2;
			preVal2 = currVal;
		}
	}
}
