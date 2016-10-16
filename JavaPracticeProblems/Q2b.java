public class Q2b {
public static void main(String args[]){
int a[] = {2, 8, 3, 1};
int b[]={};
int sum = 0;
int j = 0;
for (int i = 1; i <= a.length; i++){
sum += a[i];
if (a[i] < 5) b[i] = a[i];
}
System.out.println("\nThe sum is " + sum);
for (int i= 1; i <= b.length; i++){
System.out.println("i = " + i + ";b[i] = " + b[i]);
}
}
}
