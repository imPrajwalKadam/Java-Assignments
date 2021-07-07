import java.util.*;

import javax.lang.model.util.ElementScanner14;

/* 

Problem Statement-
rite Java program which accept String from user and display 
below pattern. 
Input : iRow = 5 iCol = 5 
Output : 1 2 3 4 5 
         1 2     5 
         1   3   5 
         1    4  5    
         1 2 3 4 5 
*/
class Pattern {
     public void Pattern(int iRow, int iCol) {

          for (int i = 1; i <= iRow; i++) {
               for (int j = 1; j <= iCol; j++) {
                     if(((j == iRow) || (i == 1) || (j == 1) || (i == iCol))||(i == j))
                     {
                     System.out.print(j+"\t");
                     }
                     else
                         System.out.print(" "+"\t");
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