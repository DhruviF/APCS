public class Plus {
  public static void main(String[] args) {
    int verticalLines = 5;
    int horizontalLines = (2*verticalLines)-2;
    // String space = new String(" ");
    // String spaces = space.repeat(horizontalLines/2);
    // String dash = new String("-");
    // String dashes = dash.repeat(horizontalLines/2);
    for (int i=1;i<=verticalLines;i++){
      if (i != (verticalLines+1)/2){
        // System.out.println(spaces + "|" );
           for (int j = 1;j<=(horizontalLines/2); j++){
             System.out.print(" ");
           }
           System.out.println("|");
      }
      else{
        // System.out.print(dashes + "|" + dashes);
        for (int j = 1;j<=(horizontalLines/2); j++){
          System.out.print("-");
        }
        System.out.print("|");
        for (int j = 1;j<=(horizontalLines/2); j++){
          System.out.print("-");
        }
        System.out.println();
      }
    }
  }
}
