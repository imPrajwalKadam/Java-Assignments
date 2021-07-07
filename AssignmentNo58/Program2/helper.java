import java.util.*;

/* 

Problem Statement-
Write a java program which accept number of rows and number of 
columns from user and display below pattern. 
Input : iRow = 4 iCol = 4 
Output : * * * # 
         * * # @ 
         * # @ @ 
         # @ @ @
*/
class Pattern {
     public void Pattern(int iRow, int iCol) {

          for (int i = iRow; i >= 1; i--) {
               for (int j = 1; j <= iCol; j++) {
                    if(j<i)
                    System.out.print("*" + "\t");
                    else if (j == i)
                         System.out.print("#" + "\t");
                    else
                         System.out.print("@" + "\t");
               }
               System.out.println();
          }
     }
}

class helper {
     public static void main(String arg[]) {
          Pattern obj = new Pattern();
          Scanner sobj = new Scanner(System.in);
          System.out.println("Enter Row:");
          int row = sobj.nextInt();
          System.out.println("Enter Col:");
          int Col = sobj.nextInt();
          obj.Pattern(row, Col);
          System.gc();
     }
}