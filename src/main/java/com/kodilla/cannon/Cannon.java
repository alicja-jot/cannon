package com.kodilla.cannon;

public class Cannon {

    public boolean loaded = false;

    public void fire() {
        if (loaded == true) {
            System.out.println("Fire!!!");
        } else {
            System.out.println("There is no shot in the cannon. I'm loading now.");
            loaded = true;
        }
    }


}



