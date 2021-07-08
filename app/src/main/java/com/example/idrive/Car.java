package com.example.idrive;

import android.util.Log;

public class Car {
    public double fuelonekm ;
    public double tank ;
    public String model;

    public Car (String model){
        this.model = model;

    }
    String startEngine (String text){
        if (text.equals("go")) {
            return "Let's go";
        }
        else return "Please start engine";
    }
    Double refuelingTank (double addtank){
       Log.d("MyLog", " refueled on " + addtank);
        return addtank;
    }
    Double travelOnekm (double tank, double fuelonekm){
        this.tank = tank;
        this.fuelonekm = fuelonekm;
        if (tank >= fuelonekm){
            tank = tank - fuelonekm;
            Log.d("MyLog", " Drove 1 km ");
            return tank;
        }
        else {
            Log.d("MyLog", " The fuel is over ");
            return tank;
        }
    }
}
