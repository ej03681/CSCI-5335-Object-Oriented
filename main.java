import java.util.Scanner;

public class main {
public static void main(String[] args) {
		
		AccountManager myAccMan = new AccountManager();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome!\nPlease Enter your Account Number");
		Integer accNum = new Integer(s.nextInt());
		System.out.println("Please Enter your Pin Number");
		int inputPin = s.nextInt();

		
		//prints true if they account and pinN match
		System.out.println(myAccMan.login(accNum, inputPin));
		
		
		if(!myAccMan.login(accNum,inputPin)) {
			System.out.println("Unable to Login");
			System.exit(0); //ideally should loop back to a login prompt
		}
		
		System.out.printf("Successfully Logged In!\nWelcome %s, what would you like to do?\n", myAccMan.getActiveAccount().getAccountHolder());
		System.out.println("W : Withdraw\nD : Deposit\nC : Check Balance\n");
		
		
	
		
		switch(s.next()) {
			case "W": 
				System.out.println("How much would you like to withdraw? (Multiple of $20)");
				int amountWithdraw = s.nextInt();
				myAccMan.getActiveAccount().withdraw(amountWithdraw);
				System.out.println("Cash dispensed. Please take your bills.");
				System.out.println("Your balance is: $" + myAccMan.getActiveAccount().getBalance());
				System.out.println("Transaction successful! Have a good day!");
				break;
			case "D":
				System.out.println("How much would you like to deposit? (No change)");
				int amountDeposit = s.nextInt();
				myAccMan.getActiveAccount().deposit(amountDeposit);
				System.out.println("Your balance is: $" + myAccMan.getActiveAccount().getBalance());
				System.out.println("Transaction successful! Have a good day!");
				break;
			case "C":
				System.out.println("Your balance is: $" + myAccMan.getActiveAccount().getBalance());
				break;
			default:
				System.out.println("Invalid Selection");
		}
		
		
		s.close();

	}
}
