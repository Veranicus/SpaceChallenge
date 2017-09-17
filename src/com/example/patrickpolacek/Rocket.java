package com.example.patrickpolacek;

public class Rocket implements SpaceShip {

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item i) {
        return false;
    }

    @Override
    public void carry(Item i) {

    }
}
