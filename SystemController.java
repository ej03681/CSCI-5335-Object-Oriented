import java.util.Scanner;
import Accounts.AccountManager;
import Logs.LogManager;

public class SystemController {
	private LogManager logMan;
	private AccountManager accMan;
	Scanner s = new Scanner(System.in);
	boolean exit;
	
	public SystemController() {
		this.logMan = new LogManager();
		this.accMan = new AccountManager();
		this.exit = false;
	}
	
	void run() {
		
		while(exit == false) {
			logInPrompt();
		}
		
	}
	
 
	
	void logInPrompt() {
		System.out.println("Welcome!\nPlease Enter your Account Number to Login");
		Integer accNum = new Integer(s.nextInt());
		System.out.println("Please Enter your Pin Number");
		int inputPin = s.nextInt();

		
		if(!accMan.login(accNum,inputPin)) {
			this.logMan.record("LOGIN", false, accNum);
			System.out.println("Unable to Login");
			return;
		}
		else {
			//write to log
			this.logMan.record("LOGIN", true, accNum);
			while(this.actionPrompt());
		}
		
	}
	
	boolean actionPrompt() {
	
		System.out.printf("Welcome %s, what would you like to do?\n", accMan.getActiveAccount().getAccountHolder());
		System.out.println("W : Withdraw\nD : Deposit\nC : Check Balance\nL : LogOff");
		
		
		switch(s.next().toUpperCase()) {
			case "W": 
				System.out.println("How much would you like to withdraw? (Multiple of $20)");
				int amountWithdraw = s.nextInt();
				boolean resultW = accMan.getActiveAccount().withdraw(amountWithdraw);
				if(resultW) {
					this.logMan.record("WITHDRAW", amountWithdraw, resultW, this.accMan.getActiveAccount().getAccountNumber());
					System.out.println("You have successfully withdrawn $" + amountWithdraw + " from your account\n");
					System.out.printf("Your current balance is: $" + (accMan.getActiveAccount().getBalance()) + "\n\n");
				}
				return true;
			case "D":
				System.out.println("How much would you like to deposit? (No change)");
				double amountDeposit = s.nextDouble();
				boolean resultD = accMan.getActiveAccount().deposit((int)amountDeposit);
				if(resultD){
					this.logMan.record("DEPOSIT", ((int)(amountDeposit)), resultD, this.accMan.getActiveAccount().getAccountNumber());
					System.out.println("You have successfully deposited $" + amountDeposit + " into your account\n");
					System.out.printf("Your current balance is: $" + (accMan.getActiveAccount().getBalance()) + "\n\n");
				}
				return true;
				
			case "C":
				System.out.printf("Your balance is: $" + (accMan.getActiveAccount().getBalance()) + "\n\n");
				return true;
	
			case "L":
				this.logMan.record("LOGOFF", true, this.accMan.getActiveAccount().getAccountNumber());
				return false;
				
			default:
				System.out.println("Invalid Selection");
				return true;
		}
	}
	
	void logOut() {
		
		
	}
}
