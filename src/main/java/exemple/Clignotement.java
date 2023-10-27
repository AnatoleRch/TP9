package exemple;

import java.awt.Color;

import bandeau.Bandeau;

public class Clignotement extends EffetAnimation{

    public Clignotement(){
       super() ;
    }

    public void action(Bandeau monBandeau){
        monBandeau.setForeground(Color.WHITE);
        monBandeau.sleep(500);
        monBandeau.setForeground(Color.BLACK);
        monBandeau.sleep(500);
    }

}
