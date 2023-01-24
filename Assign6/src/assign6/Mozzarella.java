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
public class Mozzarella extends ToppingDecorator{
	
	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("adding mozzarella");
	}
	
	public String getDescription() {
	
		return tempPizza.getDescription() + ", Mozzarella";
	}
	
	public double getCost() {
		return tempPizza.getCost() + .50;
	}

}

