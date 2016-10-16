import java.util.*;
public class Q1_2013 {
	public static boolean m (String aString){
		String newString;
		char c1,c2;
		if (aString.length()<=1)
			return true;
		else{
			c1 = aString.charAt(0);
			c2 = aString.charAt(aString.length()-1);
			if (c1!=c2)
				return false;
			else{
				newString = aString.substring(1,aString.length()-1);
				return m(newString);
			}
		}
	}
	public static void main (String a[]){
		String input = "healthy pqrqp";
		String aToken;
		boolean result;
		String vowelsAndSpace = " aeiouAEIOU";
		StringTokenizer tokens;

		tokens = new StringTokenizer (input, vowelsAndSpace);
		while (tokens.hasMoreTokens()){
			aToken = tokens.nextToken();
			System.out.println("Token is " + aToken);;
			if (aToken.length()>3){
				result = m(aToken);
				System.out.println("result is " + result);
			}
		}
	}
}
