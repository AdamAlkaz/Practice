public class BankAccount {
	private static int AccountNumCount = 0;
	private static double totalSum = 0.0;
	private String AccountHolderName;
	private int accountNum;
	private double minValue;
	private double accountBalance;
	public BankAccount (String name, double balance){
		minValue = balance;
		AccountNumCount++;
		accountNum = AccountNumCount;
		accountBalance = balance;
		totalSum+=balance;
		AccountHolderName = name;
	}
	public BankAccount(){
		AccountNumCount++;
		accountNum=AccountNumCount;
		AccountHolderName = "Unknown Name";
		accountBalance = 0.0;
		minValue = 0.0;
	}
	public static double findAverageAccountBalance(){
		return (totalSum/AccountNumCount);
	}
	public void deposit (double x){
		accountBalance +=x;
		totalSum+=x;
	}
	public boolean withdraw (double x){
		if (x<=accountBalance){
			accountBalance-=x;
			totalSum-=x;
			if (accountBalance<minValue)
				minValue=accountBalance;
			return true;
		}
		else
			return false;
	}
	private double findMinimumBalance(){
		return minValue;
	}
	public String toString(){
		return (accountNum + " " + AccountHolderName + " " + accountBalance + " " + this.findMinimumBalance());
	}
	public static void main(String args[]){
		BankAccount b1, b2, b3;
		b1 = new BankAccount("John Smith", 2000.00);
		// b1 now has 2000.00. Minimum balance 2000.00
		b2 = new BankAccount();
		// b2 now has 0.00. Minimum balance 0.00
		b3 = new BankAccount("Mary Todd", 1000.00);
		// b3 now has 1000.00. Minimum balance 1000.00
		System.out.println("Average Balance after opening three accounts is " + BankAccount.findAverageAccountBalance());
		// Average of 2000.00, 0.00 and 1000.00 is 1000.00
		b1. deposit(1000.00);
		// b1 now has 3000.00. Minimum balance 2000.00
		b2. deposit(500.00);
		// b2 now has 500.00. Minimum balance 0.00
		b3. deposit(5000.00);
		// b3 now has 6000.00. Minimum balance 1000.00
		b1. withdraw(2000.00);
		// b1 now has 1000.00. Minimum balance 1000.00
		b1.deposit(1000.00);
		// b1 now has 2000.00. Minimum balance 1000.00
		b2. withdraw(1000.00);
		// Operation is not permitted. b2 still has 500.00.Minimum balance 0.00
		System.out.println("Average Balance after all transactions is " + BankAccount.findAverageAccountBalance());
		// Average (2000 + 500 + 6000)/3 = 2833.33
		System.out.println(b1.toString()); // See output below
		System.out.println(b2.toString()); // See output below
		System.out.println(b3.toString()); // See output below
		}
		}
