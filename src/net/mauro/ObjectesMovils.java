package net.mauro;

import java.util.ArrayList;

import acm.graphics.GImage;

public abstract class ObjectesMovils {

    GImage  imatge;
    boolean haSortit;
    int velocitat = 5;
    int pausa = 20;

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
        this.getImatge().move(velocitat, 0);
        this.getImatge().pause(pausa);
    }

    public boolean haSortit(Principal pissarra){

        if(this.getImatge().getX() > 0 || this.getImatge().getX() <= pissarra.getWidth()){
            this.setHaSortit(false);
            return false;
        }else{
            return true;

        }
    }



}
