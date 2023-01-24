/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign6;

import java.util.Scanner;

/**
 *
 * @author EddyJ
 */

public class PizzaMaker {
	
	public static void main(String[] args) {
		
		Pizza basicPizza = new Mozzarella(new RedSauce(new PlainPizza()));
		
                System.out.println("Basic Pizza:");
		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Price: " + basicPizza.getCost());
                
                Pizza hawaiian = new HawaiianPizza();
                
                System.out.println("Hawaiian Pizza:");
                System.out.println("Ingredients: " + hawaiian.getDescription());
		System.out.println("Price: " + hawaiian.getCost());
                
                Pizza spicyPizza = new ItalianSausage(new Jalopeneos(new Mozzarella(new WhiteSauce(new PlainPizza()))));
                
                System.out.println("Custom Pizza:");
                System.out.println("Ingredients: " + spicyPizza.getDescription());
		System.out.println("Price: " + spicyPizza.getCost());
                 
                Pizza allTops = new Ham(new Pineapple(new Jalopeneos(new Pepporoni(new ItalianSausage(new Mozzarella(new RedSauce(new PlainPizza())))))));
                
                System.out.println("All topping Pizza:");
                System.out.println("Ingredients: " + allTops.getDescription());
		System.out.println("Price: " + allTops.getCost());
        }
}
