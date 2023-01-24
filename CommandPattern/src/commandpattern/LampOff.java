/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

public class LampOff implements CommandContr {

    private Command command;

    public LampOff(Command command){
        this.command = command;
    }
 
    public void execute() {
        command.turnOff();
    }
}
