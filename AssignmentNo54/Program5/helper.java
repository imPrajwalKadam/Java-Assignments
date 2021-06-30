import java.util.*;


 /*  Problem Statement-

Write Java program which accept number of rows and number of columns 
from user and display below pattern. 
Input : iRow = 3 iCol = 4 
Output : 1 2 3 4 
         5 6 7 8 
         9 10 11 12                                                     
*/
import java.util.*;

class Pattern  
{
      void Pattern(int iRow,int iCol)
     {
          int iNo = 1;
          for(int i = 0; i < iRow ; i++)
          {
               for(int j = 0;j < iCol; j++)
               {
                    System.out.print(iNo+"\t");
                    iNo++;   
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