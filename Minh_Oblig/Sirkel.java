import javax.swing.*;

public class Sirkel {
    public static void main(String[] args){

        double radius = Integer.parseInt(JOptionPane.showInputDialog("Radius:"));

        // Statisk metode som beregner og returnerer sirkelens diameter
        double diameter = 2*radius;
        System.out.println("Diameteren er " + diameter);

        // Statisk metode som beregner ot returnerer sirkelens omkrets
        double omkrets = radius * 2 * Math.PI;
        System.out.println("Omkretsen er " + omkrets);

        // Statisk metode som beregner og returnerer sirkelens areal
        double areal = Math.PI * Math.pow(radius, 2);
        System.out.println("Arealet er: " + areal);

    }
}
