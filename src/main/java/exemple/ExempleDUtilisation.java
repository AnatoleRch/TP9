package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Hello");
        Clignotement c = new Clignotement();
        Rotation r = new Rotation();
        Zoom z = new Zoom();
        ScenarioAnimation scenario = new ScenarioAnimation();
        scenario.addEffect(c,3);
        scenario.addEffect(z,2);
        scenario.addEffect(r,2);
        scenario.addEffect(z,1);
        scenario.action(monBandeau);
        monBandeau.close();
    }
}
