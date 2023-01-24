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
public class Pepporoni extends ToppingDecorator{
	
	public Pepporoni(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("adding pepporoni");
	}
	
	public String getDescription() {
	
		return tempPizza.getDescription() + ", Pepporoni";
	}
	
	public double getCost() {
		return tempPizza.getCost() + .75;
	}
}