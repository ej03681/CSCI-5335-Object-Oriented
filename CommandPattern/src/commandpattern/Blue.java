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
public class Blue implements CommandContr{
    private Command command;
    
    public Blue(Command command){
        this.command = command;
    }
    public void execute(){
        command.blue();
    }
    
}
