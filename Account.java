import java.util.Scanner;

public class Account {
	static String accoNo;
	String name;
	String mobileNumber;
	static double availableBal = 1500;

	public Account(String accNo, String name, String mobileNumber) {
		this.accoNo = accNo;
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deposit your money Here");
		System.out.print("Enter Account Number :");
		String depAcNo = sc.next();
		if (accoNo.equals(depAcNo)) {
			System.out.println("Account access sucessfully");
			System.out.println("Avaiable Balance " + availableBal);
			System.out.println("Do you Want to deposit the money");
			System.out.print("Type yes to continue or else exit: ");
			String dept = sc.next();
			if (dept.equalsIgnoreCase("yes")) {
				System.out.print("Enter the money: ");
				double money = sc.nextDouble();
				money = availableBal + money;
				System.out.println("money added successfully");
			} else {
				System.out.println("Thank you and visit Again");
			}
		} else {
			System.out.println("please enter correct Account number");
		}
	}

	public void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To WithDraw Section:");
		System.out.println("Enter the Account Number ? ");
		String WAcNo = sc.next();

		if (WAcNo.equalsIgnoreCase(accoNo)) {
			System.out.println("Account access succfully:");
			System.out.println("Available Balence is:" + availableBal);
			System.out.println("Do You Want To Withdraw money press yes others wise no:");
			String Was = sc.next();
			if (Was.equalsIgnoreCase("yes")) {
				System.out.println("Enter the Money");
				Double WithDrawMoney = sc.nextDouble();
				WithDrawMoney = availableBal - WithDrawMoney;
				System.out.println("Deducted Successfully and Current Bal is:" + WithDrawMoney);
			} else {
				System.out.println("Invalid Pls Try agin..");
			}
		} else {
			System.out.println("Pls Enter Account Number Correctly:");
		}

	}

	public void getBalance() {
		   System.out.println("Current Bal is:"+availableBal);

	}

}
