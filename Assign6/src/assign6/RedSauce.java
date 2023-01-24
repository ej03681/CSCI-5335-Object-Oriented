/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign6;

/**
 *
 * @author EddyJ
 */
public class RedSauce extends ToppingDecorator{
	
	public RedSauce(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("adding tomato sauce");
	}
	
	public String getDescription() {
	
		return tempPizza.getDescription() + ", Tomato Sauce";
	}
	
	public double getCost() {
		return tempPizza.getCost() + .50;
	}

}
