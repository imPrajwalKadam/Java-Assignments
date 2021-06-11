import java.util.*;


 /*  Problem Statement-

          Write Java program which accept number of rows and number of columns 
          from user and display below pattern. 
          Input : iRow = 3 iCol = 4 
          Output : 1  2  3  4 
                   5  6  7  8 
                   9  10 11 12 
                                                               
*/
import java.util.*;
class Pattern
{  
     int i = 0,j = 0,k = 1;
     public void patter(int iRow, int iCol )
     {
          for( i = 1; i<= iRow ;i++)
          {
               System.out.println();
               for( j = 1 ;j <= iCol ; j++)
               {   
                    System.out.print("\t"+k);
                    k++;
               }
               System.out.println();
          }
     }
}
class helper
{
     public static void main(String arg[])
     {
          Scanner sobj = new Scanner(System.in); 

          System.out.println("Enter Number for Columns");
          int iCol = sobj.nextInt();

          System.out.println("Enter number for Rows");
          int iRow = sobj.nextInt();

          Pattern pobj = new Pattern();

          pobj.patter(iRow, iCol);

          System.gc();
     }
}