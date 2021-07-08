package com.example.idrive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car volvo = new Car("volvo");
        double tank = 10.0;
        double fuelonekm = 0.07;
        String go = volvo.startEngine("go");
        if (go.equals("Let's go")) {
            Log.d("MyLog", go);
            int i = 1;
            while (i <= 1200) {


                if (tank >= fuelonekm ) {
                    tank = volvo.travelOnekm(tank,fuelonekm);
                    Log.d("MyLog", String.valueOf(i) + " km drove");
                    Log.d("MyLog", String.valueOf(tank));
                    i = i + 1;
                    }
                else {
                    tank = volvo.travelOnekm(tank,fuelonekm);
                    tank = tank + volvo.refuelingTank(20.0);
                    Log.d("MyLog", String.valueOf(tank));
                    tank = volvo.travelOnekm(tank,fuelonekm);
                    Log.d("MyLog", String.valueOf(tank));
                    Log.d("MyLog", String.valueOf(i) + " km drove");
                    i = i + 1;
                    }

                }
            }

             else Log.d("MyLog", go);

        }
    }
