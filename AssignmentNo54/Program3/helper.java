import java.util.*;


 /*  Problem Statement-

     . Write Java program which accept number of rows and number of columns 
       from user and display below pattern. 
Input : iRow = 3 iCol = 5 
Output : A A A A A 
         B B B B B
         C C C C C                                                      
*/
import java.util.*;
class Pattern 
{
     public void Pattern(int iRow,int iCol)
     {
          char ch = 'A';
          for(int i = 0; i<iRow ; i++)
          {
               for(int j = 0 ;j <iCol; j++)
               {
                    System.out.print(ch+"\t");   
               }
               ch++;
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