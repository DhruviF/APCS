import java.lang.Math;
import java.util.Scanner;
import java.lang.*;

public class SphericalDistance {
  public static void main(String[] args) {
    System.out.println("This program computes the spherical distance between two points, 1 and 2. ");
    System.out.println("Please enter the latitude and longitude for each point as a pair of integers, degrees, followed by minutes.");

    Scanner scan = new Scanner(System.in);

    System.out.println("Input latitude of point 1: ");
    int latone = scan.nextInt();
    int lattwo = scan.nextInt();
    System.out.println("Latitude 1 = " + latone + " " + lattwo);

    System.out.println("Input longitude of point 1: ");
    int longone = scan.nextInt();
    int longtwo = scan.nextInt();
    System.out.println("Longitude 1 = " + longone + " " + longtwo);

    System.out.println("Input latitude of point 2: ");
    int latonee =  scan.nextInt();
    int lattwoo = scan.nextInt();
    System.out.println("Latitude 2 = " + latonee + " " + lattwoo);

    System.out.println("Input longitude of point 2: ");
    int longonee = scan.nextInt();
    int longtwoo = scan.nextInt();
    System.out.println("Longitude 2 = " + longonee + " " + longtwoo);

    double newlat1 = Math.toRadians(latone + (lattwo/60.));
    double newlng1 = Math.toRadians(longone + (longtwo/60.));
    double newlat2 = Math.toRadians(latonee + (lattwoo/60.));
    double newlng2 = Math.toRadians(longonee + (longtwoo/60.));

    double distance = Math.acos((Math.sin(newlat1)*Math.sin(newlat2))+ (Math.cos(newlat1)*Math.cos(newlat2)*Math.cos(newlng2-newlng1)));
    double radiuskm = Math.round(distance * 6372.795);
    double radiusmiles = Math.round(radiuskm * 0.62137);

    System.out.println("Angular Distance: " + distance);
    System.out.println("Distance(km): " + radiuskm + "km");
    System.out.println("Distance(miles): " + radiusmiles + "miles");

  }
}
