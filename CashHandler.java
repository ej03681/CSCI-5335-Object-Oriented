
public class CashHandler {
int cashHeld;
	
	
	public CashHandler(){
		
	}

	public CashHandler(int cashHeld) {
		this.cashHeld = cashHeld;
	}

	void dispenseCash(int amount) {
		System.out.printf("Please take your cash from the dispenser\nTotal: %s", amount);
		this.setCashHeld(this.getCashHeld() - amount);

	}
	
	void refillCash(int amount) {
		this.setCashHeld(this.getCashHeld() + amount);
	}
	
	void recieveCash(int amount) {
		//TODO
	}
	//ACCCESSORS & MUTATORS
	
	public int getCashHeld() {
		return cashHeld;
	}

	public void setCashHeld(int cashHeld) {
		this.cashHeld = cashHeld;
	}
}
