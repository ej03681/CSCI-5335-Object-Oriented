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
public class Establish implements Family {
    private String name;
    private String relation;
    
    public Establish(String name, String relation){
        this.name = name;
        this.relation = relation;
    }
    public void add(Family member){
    }

    public void remove(Family member) {
    }

    public Family getChild(int i) {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
    }

    public void print() {
        System.out.println("___________________");
        System.out.println("Name is: " + getName());
        System.out.println("Relation : " + getRelation());
    }
}
