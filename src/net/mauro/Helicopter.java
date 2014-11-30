package net.mauro;

import acm.graphics.GImage;

public class Helicopter extends ObjectesMovils{

    int velocitat;
    int ubicacio;
    double x;
    double y;

    public Helicopter(GImage imatge, boolean haSortit) {
        super(imatge, haSortit);
        //this.ubicacio = ubicacio;

    }

    public void pintarHelicopter(){
        x = this.getImatge().getWidth();
        y = this.getImatge().getHeight();
        y+= 23;
        this.getImatge().setLocation(-x, y);
    }




}
