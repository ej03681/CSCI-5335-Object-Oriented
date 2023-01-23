
public class Account {
	private Integer accountNumber; //Account ID number
	private int pin; 	//used to gain access into account
	private String accountHolder;
	private double balance;
	private double maxWithdrawal; //most amount that can be withdrawn in a single transaction
	private double minBalance;	//minimum balance that has to be maintained at all times
	private boolean isSavings;
	
	Account(){
		this(1234567,0000, "John Doe", 100.00, 100.00, 1.00);
	}


	public Account(int accountNumber, int pin, String accountHolder, double balance, double maxWithdrawal,
			double minBalance) {
		super();
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.maxWithdrawal = maxWithdrawal;
		this.minBalance = minBalance;
	}

	

	
	boolean login(int pin) {
		
		return this.getPin() == pin;
		
	}
	
	public boolean deposit(int amount){
		
		this.updateBalance(amount);
		return true;
		
	}
	
	
	public boolean withdraw(int amount) {
		
		if(amount%20 != 0 || amount > this.getMaxWithdrawal() || (this.getBalance()-amount < this.getMinBalance())) {
			System.out.println("Unalble to withdraw funds");
			return false;
		}
		else {
			this.updateBalance(-amount);
			//System.out.println("You have withdrawn $" + amount + " from your Account");
			return true;
		}
	}
	
	//updates the account balance
	void updateBalance(int amount){
		this.setBalance(this.getBalance() + amount);
	}
	
	
	//ACCESSORS & MUTATORS
	
	
	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public String getAccountHolder() {
		return accountHolder;
	}


	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getMaxWithdrawal() {
		return maxWithdrawal;
	}


	public void setMaxWithdrawal(double maxWithdrawal) {
		this.maxWithdrawal = maxWithdrawal;
	}


	public double getMinBalance() {
		return minBalance;
	}


	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
}
