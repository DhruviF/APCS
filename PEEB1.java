import java.util.*;
import java.text.DecimalFormat;
import java.lang.Math;

public class PEEB1 {
  public static void main(String[] args) {
    // System.out.println("Radiant photon flux at a given wavelength");
    // System.out.println("and temperature using Planck's Law.");

    double h = 6.626068 * Math.pow(10,-34);
    double c = 299792500;
    double k = 1.38066*Math.pow(10, -23);

    Scanner scan = new Scanner(System.in);
    System.out.print("wavelength in microns: ");
    double wavelength = scan.nextDouble();
    // System.out.print("temperature in degrees Kelvin: ");
    // int temperature = scan.nextInt();

    int temperature = 5800;

    wavelength = wavelength * Math.pow(10, -6);

    double one = (2 * h * Math.pow(c, 2) * Math.pow(wavelength,-5));
    double two = (Math.exp((h * c)/(wavelength * k * temperature))) - 1;

    double B = one/two;
    DecimalFormat flux = new DecimalFormat("0.00E00");
    System.out.println("radiant flux B = " + flux.format(B).toLowerCase() + " Wm-3steradian-1");

  }
}
