/*
Enhance your Point class to include:
	toString method		       //produces and returns the desired string, e.g (19, 5)
	getQuadrant method	     //returns the quadrant in which (x, y) lies (or 0 if on axis)
	distanceToOrigin method	 //returns distance from (x, y) to origin (use double)
*/

import java.util.Scanner;

public class PointClient1{
    public static void main(String[] args){
        System.out.println("mooDefault = (0,    0)");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x-value: ");
        int x = scan.nextInt();
        System.out.print("Enter y-value: ");
        int y = scan.nextInt();

        Point moo = new Point(x,y);
        System.out.print("(" + moo.getX() + ", " + moo.getY() + ")");

        moo.translate(2,2);
        moo.setXY(moo.getX(),0);
        moo.translate(0,19);
        moo.setXY(moo.getY(),moo.getX());
        System.out.println("(" + moo.getX() + ", " + moo.getY() + ")");

        System.out.println("Quadrant: " + moo.getQuadrant());

        System.out.println("Distance to origin: " + moo.distanceToOrigin());

        System.out.println("x = " + x);

        System.out.println("x = " + moo.getX());

        System.out.println("moo = " + "(" + moo.getX() + ", " + moo.getY() + ")");

        System.out.println("moo = " + "(" + moo.getX() + ", " + moo.getY() + ")");
    }
}
