package com.kodilla.cannon;

import java.util.LinkedList;

public class Aplication {
    public static void main (String [] args){

        LinkedList<Cannon> cannonList = new LinkedList<>();

        Cannon cannon1 = new Cannon();
        Cannon cannon2 = new Cannon();
        Cannon cannon3 = new Cannon();
        Cannon cannon4 = new Cannon();
        Cannon cannon5 = new Cannon();

        cannonList.add(cannon1);
        cannonList.add(cannon2);
        cannonList.add(cannon3);
        cannonList.add(cannon4);
        cannonList.add(cannon5);

        for (int i =0; i < cannonList.size(); i++){
            cannonList.get(i).fire();
        }




    }
}
