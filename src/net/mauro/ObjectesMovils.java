package net.mauro;

import java.util.ArrayList;

import acm.graphics.GImage;

public class ObjectesMovils {

    GImage  imatge;
    boolean haSortit;
    int velocitat = 10;
    int pausa = 10;

    public ObjectesMovils(GImage imatge, boolean haSortit){
        this.imatge = imatge;
        this.haSortit = haSortit;
    }

    public GImage getImatge() {
        return imatge;
    }

    public void setImatge(GImage imatge) {
        this.imatge = imatge;
    }

    public boolean isHaSortit() {
        return haSortit;
    }

    public void setHaSortit(boolean haSortit) {
        this.haSortit = haSortit;
    }

    public void MouHoritzontal(){
        this.getImatge().move(0, velocitat);
        this.getImatge().pause(pausa);
    }



}
