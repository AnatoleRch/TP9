package exemple;

import bandeau.Bandeau;

public class Rotation extends EffetAnimation{

    public Rotation(){
       super() ;
    }

    public void action(Bandeau monBandeau){
        for (double i = 0; i <= 2.1; i=i+0.1){
            monBandeau.setRotation(Math.PI * i);
            monBandeau.sleep(50);
        }
    }

}
