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
public class WhiteSauce extends ToppingDecorator{
	
	public WhiteSauce(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("adding parmesan sauce");
	}
	
	public String getDescription() {
	
		return tempPizza.getDescription() + ", Parmesan Sauce";
	}
	
	public double getCost() {
		return tempPizza.getCost() + .50;
	}
}