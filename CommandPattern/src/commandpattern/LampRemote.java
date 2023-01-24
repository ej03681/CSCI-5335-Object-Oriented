/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author EddyJ
 */
public class LampRemote {
    private CommandContr command;
    public void setCommand(CommandContr command){
        this.command = command;
    }
    public void onClick(){
        command.execute();
    }
}

