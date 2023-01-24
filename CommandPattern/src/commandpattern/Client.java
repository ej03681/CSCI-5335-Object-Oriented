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
public class Client {
    public static void main(String[] args) {
        LampRemote control = new LampRemote();
        Command command = new Command();
        CommandContr on = new LampOn(command);
        CommandContr off = new LampOff(command);
        CommandContr blue = new Blue(command);
        
        control.setCommand(new LampOn(command));
        control.onClick();
        
        
        control.setCommand(blue);
        control.onClick();
        
        control.setCommand(off);
        control.onClick();
    
        
    
    
    }
}
