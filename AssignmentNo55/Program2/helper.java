import java.util.*;


 /*  Problem Statement-

    Write Java program which accept number of rows and number of columns from user and display below pattern. 
Input : iRow = 4 iCol = 3 
Output : 1 2 3 
         1 2 3 
         1 2 3 
         1 2 3 

                                                               
*/
import java.util.*;
class Pattern 
{
     public void Pattern(int iRow,int iCol)
     {
          for(int i = 0; i<iRow ; i++)
          {
               for(int j = 1 ;j < iCol + 1; j++)
               {
                    System.out.print(j+"\t");    
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