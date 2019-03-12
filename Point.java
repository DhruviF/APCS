/*
Enhance your Point class to include these methods:
	toString			// produces and returns the desired string, e.g (19, 5)
	getQuadrant			// returns the quadrant in which (x, y) lies (or 0 if on axis)
	distanceToOrigin	// returns distance from (x, y) to origin (double)
	slope               // returns the slope between two points (double)
*/


import java.lang.Math.*;

public class Point{
  int x;
  int y;

  public Point(int initialX, int initialY){
    x = initialX;
    y = initialY;
  }

  public Point(){
  }

  public void translate(int dx, int dy){
    x+=dx;
    y+=dy;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public void setXY(int setX, int setY){
    x = setX;
    y = setY;
  }

  public String toString(){ //produces and returns the desired String
    return "(" + x + ", " + y + ")";
  }

  public String getQuadrant(){ //returns the quadrant in which (x,y) lies in
    if (x>=0 && y>=0){
      return "1";
    }
    else if (x<0 && y>0){
      return "2";
    }
    else if (x<0 && y<0){
      return "3";
    }
    else{
      return "4";
    }
  }

  public double distanceToOrigin(){ // returns distance from (x,y) to origin (use double)
    double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    return distance;
  }

  public double slope(Point other){ // returns the slope between two points (double)
    double slope = (double)(y-other.getY())/(x-other.getX());
    return slope;
  }

}
