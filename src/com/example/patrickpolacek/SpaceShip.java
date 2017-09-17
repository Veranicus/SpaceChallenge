package com.example.patrickpolacek;

public interface SpaceShip {

    boolean launch();

    boolean land();

    boolean canCarry(Item i);

    void carry(Item i);



}
