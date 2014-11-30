package net.mauro;

import java.util.ArrayList;
import java.util.Random;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class Principal extends GraphicsProgram{

    int width = 900;
    int height = 600;

    public ArrayList<ObjectesMovils> crearHelicopters(String rutaImatge){

        ArrayList<ObjectesMovils> helicopters = new ArrayList<ObjectesMovils>();
        Random r = new Random();
        int numHeli =r.nextInt(5)+1;
        for(int i=0;i<numHeli;i++){

            Helicopter helicopter = new Helicopter(new GImage(rutaImatge), false);


            helicopter.pintarHelicopter();
            helicopters.add(helicopter);
            this.add(helicopters.get(i).getImatge());
            while(!helicopter.haSortit(this)){
                helicopters.get(i).MouHoritzontal();
            }

        }
        return helicopters;


    }



    public void run(){

        this.setSize(width, height);
        add(new GImage("camp.png"));
        crearHelicopters("helicopter.png");





    }

}
