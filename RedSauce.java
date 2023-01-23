
public class RedSauce extends ToppingDecorator{
	
	public RedSauce(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("adding red sauce");
	}
	
	public String getDescription() {
	
		return tempPizza.getDescription() + ", Red Sauce";
	}
	
	public double getCost() {
		return tempPizza.getCost() + .30;
	}

}
