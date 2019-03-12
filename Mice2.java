import java.util.*;

public class Mice2{

	public static int mapX;
	public static int mapY;
	public static char[][] map;
	public static Boolean test = false;
	public static Boolean[][] find;

	public static void main(String[]args){

		System.out.println("Enter number of rows and columns, then enter map.");
		Scanner scan =  new Scanner (System.in);

		mapX = scan.nextInt();
		mapY = scan.nextInt();
		map = new char[mapX][mapY];
		find = new Boolean[mapX][mapY];

		for(int i=0; i<mapX; i++){
			String n = scan.next();
			for(int j=0; j< mapY; j++){
				map[i][j] = n.charAt(j);
				find[i][j] = true;
			}
		}

		search(0,0); // starts at the origin

		if(test == true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

	public static void search(int x, int y){
		find[x][y]= false;

		if(map[x][y]==('M')){
			test = true;
			return;
		}else{
			if(map[x][y] != '+'){
				if(y < mapY-1 && find[x][y+1] == true){
					search(x, y+1);
				}
				if(y > 0 && find[x][y-1]==true){
					search(x, y-1);
				}
				if(x < mapX-1 && find[x+1][y]== true){
					search(x+1, y);
				}
				if(x > 0 && find[x-1][y]== true){
					search(x-1, y);
				}
			}
		}
	}

}
