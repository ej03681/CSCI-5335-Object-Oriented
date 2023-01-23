import java.io.File;
import java.util.*;

public class AccountManager {
	private HashMap<Integer, Account> accountMap;
	private Account activeAccount;
	
	
	public AccountManager(){
		this.accountMap = new HashMap<Integer,Account>();
		this.addAccount(new Account());
		
	}
	
	
	public AccountManager(HashMap<Integer, Account> accountMap){
		this.accountMap = new HashMap<Integer,Account>(accountMap);
	}


	
	void setAccountMap(File file){
		//TODO
	}
	
	void addAccount(Account acc) {
		this.getAccountMap().put(acc.getAccountNumber(), acc);
	}
	
	
	
	
	public boolean login(Integer accNum, int pin) {
		

		if(!this.getAccountMap().containsKey(accNum)) {;
			System.out.println("Invalid Account Number");
			return false;
		}
		else {
			 if(this.getAccountMap().get(accNum).login(pin)) {;
			 	this.setActiveAccount(this.getAccountMap().get(accNum));
			 	return true;
			 }
			 else {
				 return false;
			 }
		}
		
		
	}
	
	//ACCSESSORS & MUTATORS
	public HashMap<Integer, Account> getAccountMap() {
		return accountMap;
	}


	public void setAccountMap(HashMap<Integer, Account> accountMap) {
		this.accountMap = accountMap;
	}


	public Account getActiveAccount() {
		return activeAccount;
	}


	public void setActiveAccount(Account activeAccount) {
		this.activeAccount = activeAccount;
	}
}
