import java.util.*;
public class Q1_2 {
	private static String s ="";
	public Q1 (String input){
		if (s.length()<input.length())
			s=input;
	}
	public String process (String aString){
		int numberOfTokens;
		String newToken, best ="";
		StringTokenizer myTokenizer = new StringTokenizer(aString," ");
		numberOfTokens = myTokenizer.countTokens();
		for (int i = 0; i< numberOfTokens; i++){
			newToken = myTokenizer.nextToken();
			if(newToken.length()>best.length())
				best = newToken;
		}
		return best;
	}
	public int m1 (char c){
		String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if (alphabets.indexOf(c)>=0)
			return 0;
		else return 1;
	}
	public int m2 (int x){
		return x*10;
	}
	public static String getS(){
		return s;
	}
}
