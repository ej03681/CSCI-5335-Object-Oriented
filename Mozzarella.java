
public class Mozzarella extends ToppingDecorator{
	
	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("adding moz");
	}
	
	public String getDescription() {
	
		return tempPizza.getDescription() + ", Mozzarella";
	}
	
	public double getCost() {
		return tempPizza.getCost() + .50;
	}

}
