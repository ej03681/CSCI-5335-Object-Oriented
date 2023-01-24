/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

/**
 *
 * @author EddyJ
 */
public class Command {
  private String out;
    
    public void turnOn(){
       System.out.println("Turning on");
    }
    public void blue(){
       System.out.println("Changing to blue");
    }
    public void turnOff(){
       System.out.println("Turning off");
    }
}
