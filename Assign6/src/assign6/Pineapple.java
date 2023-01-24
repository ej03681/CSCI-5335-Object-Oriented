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
public class Pineapple extends ToppingDecorator{
	
	public Pineapple(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("adding pineapple");
	}
	
	public String getDescription() {
	
		return tempPizza.getDescription() + ", Pineapple";
	}
	
	public double getCost() {
		return tempPizza.getCost() + .75;
	}
}