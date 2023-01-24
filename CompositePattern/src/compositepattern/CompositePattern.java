/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

/**
 *
 * @author EddyJ
 */
public class CompositePattern {
    public static void main(String[] args) {
        
        Family mem1 = new Establish("Bryant", "Brother");
        Family memMe = new Establish("Edgar", "You");
        Family mem2 = new Establish("Jefferey", "Brother");
        Family mem3 = new Establish("Gabriel", "Brother");
        
        Family par1 = new Parent("Sonia", "Mother");
        par1.add(mem1);
        par1.add(memMe);
        par1.remove(memMe);
        par1.add(mem2);
        par1.add(mem3);
        
        Parent par2 = new Parent("Cecilio", "Father");
        par2.add(par1);
        par2.print();
    }
}
