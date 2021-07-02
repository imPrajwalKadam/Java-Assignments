import java.util.*;


 /*  Problem Statement-
 Write Java program which accept number of rows and number of 
 columns from user and display below pattern. 
 Input : iRow = 3 iCol = 5 
 Output : 5 4 3 2 1 
          5 4 3 2 1 
          5 4 3 2 1                                                      
*/
import java.util.*;
class Pattern 
{
     public void Pattern(int iRow,int iCol)
     {
          for(int i = 0; i<iRow ; i++)       //Col
          {
               for(int j = iCol ;j > 0; j--)   //Row
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