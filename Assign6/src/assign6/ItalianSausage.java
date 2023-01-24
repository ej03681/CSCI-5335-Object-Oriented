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
public class ItalianSausage extends ToppingDecorator{
	
	public ItalianSausage(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("adding italian sausage");
	}
	
	public String getDescription() {
	
		return tempPizza.getDescription() + ", Italian Sausage";
	}
	
	public double getCost() {
		return tempPizza.getCost() + .75;
	}
}