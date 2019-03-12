import java.util.Scanner;
import java.math.*;

public class PEEB2{
    public static void main(String[] args) {
        System.out.println("Calculate radiant power per unit area for Sun and Planet using\nStefan-Boltzman Law. From balance equation for Planet,\n(Power in) = (Power out), predict temperature of Planet.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Planet: ");
        String planet = scanner.nextLine();
        //String planet = "Mercury";
        System.out.print("distance of Planet from Sun (AU): ");
        double distance = scanner.nextDouble();
        // double distance = 0.39;
        distance = distance * 1.5* Math.pow(10,8);  //km
        System.out.print("radius of Planet (km): ");
        int radius = scanner.nextInt();   
        // int radius = 2440;  //km
        System.out.print("albedo of Planet: ");
        double albedo = scanner.nextDouble();
        // double albedo = 0.1;

        int sunRadius = 700000;  //km
        double sunPower = 64.2*Math.pow(10,6);

        double sp = (sunPower * Math.pow(sunRadius, 2))/Math.pow(distance,2);
        double SAve = sp/4;
        double SAvex = SAve * (1 - albedo);
        double TPK = Math.pow(SAvex/(5.67*Math.pow(10,-8)),0.25);
        double TPC = TPK - 273.15;
        System.out.println("photon flux SP = " + Math.round(sp));
        System.out.println("average photon flux SAve = " + Math.round(SAve));
        System.out.println("including albedo SAve x (1 - alpha) = " + Math.round(SAvex));
        System.out.println("temperature TP (K) = " + Math.round(TPK));
        System.out.println("temperature TP (C) = " + Math.round(TPC));

    }
}
