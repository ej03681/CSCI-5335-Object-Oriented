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
public class LampOn implements CommandContr{
    Command command;
    
    public LampOn(Command command){
        this.command = command;
    }
    
    public void execute(){
           command.turnOn();
    }
}
