/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;


//////////// COMPONENT //////////////
public interface Family {

public void add(Family member);
public void remove(Family member);
public Family getChild(int i);
public String getName();
public String getRelation();
public void print();
}
