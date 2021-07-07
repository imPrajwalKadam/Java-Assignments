import java.util.*;

import javax.lang.model.util.ElementScanner14;

/* 

Problem Statement-
Write a java program which accept number of rows and number of 
columns from user and display below pattern. 
nput : iRow = 6 iCol = 6 
Output : * * * * * * 
         * # # # * * 
         * # # * $ * 
         * # * $ $ * 
         * * $ $ $ * 
         * * * * * * 
*/
class Pattern {
     public void Pattern(int iRow, int iCol) {

          for (int i = iRow; i >= 1; i--) {
               for (int j = 1; j <= iCol; j++) {
                    if (((j == iRow) || (i == 1) || (j == 1) || (i == iCol)) || (i == j))
                         System.out.print("*" + "\t");

                    else if (i > j)
                         System.out.print("#" + "\t");
                    else {
                         System.out.print("$" + "\t");
                    }
               }
               System.out.println();
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