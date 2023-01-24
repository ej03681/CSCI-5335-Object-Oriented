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
public class Provolone extends ToppingDecorator{
	
	public Provolone(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("adding provolone");
	}
	
	public String getDescription() {
	
		return tempPizza.getDescription() + ", Provolone";
	}
	
	public double getCost() {
		return tempPizza.getCost() + .50;
	}
}