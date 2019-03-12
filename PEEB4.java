/*  Write a Java program PEEB4 to calculate Earth's surface temperature, TP, as a
function of emissivity, ε, as described by equation (4).  Take user input for ε from
the console.  Report the surface temperature rounded to the nearest integer. */

import java.util.Scanner;
import java.math.*;

public class PEEB4{
  public static void main(String[] args) {
    System.out.println("Calculate surface temperature as a function of");
    System.out.println("emissivity for the single-layer atmosphere model.");

    Scanner scan = new Scanner(System.in);
    System.out.print("enter emissivity: ");
    double emissivity = scan.nextDouble();

    System.out.println("emissivity (= absorptivity) = " + emissivity);

    double albedo = 0.3;
    double save = 342;
    double sigma = 5.67 * Math.pow(10,-8);

    double surfaceTemperature = Math.pow(((2*(1-albedo)* save)/(sigma*(2-emissivity))),0.25);
    
    System.out.println("surface temperature = " + Math.round(surfaceTemperature)+"K");

    // for (double emissivity=0.0; emissivity<=1; emissivity+=0.1){
    //   double surfaceTemperature = Math.pow(((2*(1-albedo)* save)/(sigma*(2-emissivity))),0.25);
    //   System.out.println("surface temperature = " + Math.round(surfaceTemperature)+"K");
    // }

  }
}
