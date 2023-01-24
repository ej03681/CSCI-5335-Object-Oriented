/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

//////////COMPOSITE////////////

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Parent implements Family{
    
    private String name;
    private String relation;
    
    public Parent(String name, String relation){
        this.name = name;
        this.relation = relation;
    }
    List<Family> members = new ArrayList<Family>();
    
    public void add(Family member){
        members.add(member);
    }
    public Family getChild(int i){
        return members.get(i);
    }
    public String getName(){
        return name;
    }
    public String getRelation(){
        return relation;
    }
    public void print(){
        System.out.println("___________________");
        System.out.println("Name is: " + getName());
        System.out.println("Relation : " + getRelation());
        
        Iterator<Family> famIterator = members.iterator();
        while(famIterator.hasNext()){
            Family member = famIterator.next();
            member.print();
        }
    }
    public void remove(Family member){
        members.remove(member);
    }
}
