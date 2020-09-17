package oppgave1;

import javax.swing.*;

public class Sirkel {
    public static void main(String[] args){


        double radius = Double.parseDouble(JOptionPane.showInputDialog("Radius:"));

        // Statisk metode som beregner og returnerer sirkelens diameter
        double diameter = 2*radius;
        String d = String.format("%.2f", diameter);
        System.out.println("Diameteren av sirkelen med radius" + radius + " er " + d);


        // Statisk metode som beregner ot returnerer sirkelens omkrets
        double omkrets = radius * 2 * Math.PI;
        String o = String.format("%.2f", omkrets);
        System.out.println("Omkretsen av srikelen med radius" + radius + " er " + o);

        // Statisk metode som beregner og returnerer sirkelens areal
        double areal = Math.PI * Math.pow(radius, 2);
        String a = String.format("%.2f", areal);
        System.out.println("Arealet av sirkelen med radius " + radius + " er " + a);

    }
}
