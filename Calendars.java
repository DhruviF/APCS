/* This program produces calendars as output given the parameters of the number of
days in the month and what the day is the first sunday of the month. */

import java.util.*;

public class Calendars{
	public static void main(String [] args){
		questions();
	}

	public static void questions(){
		Scanner console = new Scanner(System.in);
		System.out.println("Number of days in the month: ");
		int total = console.nextInt();
		System.out.println("Date of the first Sunday: ");
		int anyday = console.nextInt();
		title(anyday, total);
	}

	public static void title(int anyday, int total){
		System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
		for(int a=1; a<=7; a++){
			System.out.print("+------");
		}
		System.out.print("+");
		System.out.println();
		int walls = 0;
        if(anyday > 1){
        	int space = 7-(anyday-1);
        	for(int b=1; b<=space; b++){
        		System.out.print("|      ");
        		walls +=1;
        	}
        }
        for(int c=1; c<=total; c++){
        	System.out.print("|");
        	for(int d=1; d<=3-1*(String.valueOf(c).length()-1); d++){
        		System.out.print(" ");
        	}
        	System.out.print(c+ "  ");
        	walls+=1;
        	if(0==walls%7){
        		System.out.print("|");
        		System.out.println();

        	}
        }
        if(walls%7>0){
        	for(int e=1; e<=7*((walls/7)+1)-walls; e++){
        		System.out.print("|      ");

        	}
       		 System.out.print("|");
       		 System.out.println();

  	    }

  	    for(int f=1; f<=7; f++){
			System.out.print("+------");
		}
		System.out.print("+");
		System.out.println();

	}

}
