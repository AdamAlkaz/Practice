public class Q1 {
private String someString;
public Q1(String someString){
this.someString = someString;
}
public int[] process(String aString){
int result[];
int index;
for (index = 0, result = new int[100]; index <100; index ++){
result[index] = -1;
}
result = process(someString, aString, result, 0);
return result;
}
public int[] process(String someString,
 String aString,
 int [] result,
 int num){
int value;
value = someString.indexOf(aString);
if (value == -1){
return result;
} else{
if (num == 0){
result[num] = value;
num++;
} else {
result[num] = result[num-1] + aString.length() + value;
num++;
}
return process(someString.substring(aString.length() + value),
 aString, result, num);
}
}
public static void main(String a[]){
String a1 = "the cat jumped over the mat and the hat";
Q1 myQ;
int values[];
myQ = new Q1(a1);
values = myQ.process("at");
for (int index = 0; values[index ]!= -1; index++){
System.out.println(values[index]);
}
}
}
