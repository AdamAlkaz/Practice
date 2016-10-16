import java.util.*;
public class Q2_2 {
	private String name;
	private String major;
	private int gradeList[];
	public Q2(String inputString){
		StringTokenizer aTokenizer= new StringTokenizer (inputString,";");
		name = aTokenizer.nextToken();
		major = aTokenizer.nextToken();
		int num = aTokenizer.countTokens();
		gradeList = new int [num];
		for (int i = 0; i<num;i++){
			gradeList[i] =Integer.parseInt( aTokenizer.nextToken());
		}
	}
	public String toString(){
		String result ="";
		result +="Name is" + name+". Major is " +major+"\n";
		for (int i=0;i<gradeList.length;i++){
			result+=gradeList[i] +"\n";
		}
		return result;
	}

	public static void main (String a[]){
		String inputString = "John Smith;Computer Science;87;45;72";
		Q2 myQ2 = new Q2(inputString);
		System.out.println(myQ2.toString());
	}
}
