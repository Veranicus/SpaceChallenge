package com.example.patrickpolacek;

public class U2Rocket extends Rocket {

//    Declaring fields of the U2Rocket class
//    @cost - represents the cost of the rocket
//    @weight - represents the weight of the rocket
//    @maxWeight - represents the max weight of the rocket

    private double cost = 120000000;
    private double weight = 180000;
    private double maxWeight = 290000;

    public U2Rocket(double cost, double weight) {
        this.cost = 120000000;
        this.weight = 180000;
    }

    @Override
    public boolean launch() {
        double probabilityToExplodeAtLaunch = 0.04 * (weight / maxWeight);

        if((Math.random() * 100) > probabilityToExplodeAtLaunch ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean land() {
        double probabilityToExplodeAtLand = 0.08 * (weight / maxWeight);

        if((Math.random() * 100) > probabilityToExplodeAtLand ){
            return true;
        } else {
            return false;
        }
    }
}
