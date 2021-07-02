import java.util.*;


 /*  Problem Statement-

Write Java program which accept number of rows and number of 
columns from user and display below pattern. 
Input : iRow = 3 iCol = 4 
Output : 1 1 1 1 
         2 2 2 2 
         3 3 3 3 
*/
import java.util.*;

class Pattern  
{
      void Pattern(int iRow,int iCol)
     {
          for(int i = 1; i < iRow+1 ; i++)
          {
               for(int j = 0;j < iCol; j++)
               {
                    System.out.print(i+"\t");
               }
               System.out.println();
          }
     }
}

class helper
{

     public static void main(String arg[])
     {

          Pattern obj = new Pattern();
          Scanner sobj = new Scanner(System.in);

          System.out.println("Enter Rows:");
          int row = sobj.nextInt();
          System.out.println("Enter Columns");
          int col = sobj.nextInt();

          obj.Pattern(row,col);
          System.gc();
     }
}