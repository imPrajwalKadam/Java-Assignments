import java.util.*;


 /*  Problem Statement-

           Write Java program which accept number of rows and number of columns 
           from user and display below pattern. 

           Input  : iRow = 3 iCol = 5 
           Output : A A A A A 
                    B B B B B 
                    C C C C C 
                                                               
*/
import java.util.*;

class Pattern
{
     char ch1 = 'A';
     int i = 0,j = 0;
     public void patter(int iRow, int iCol )
     {
          for( i = 0; i<iRow ;i++ )
          {
               System.out.println();
               for( j = 0;j<iCol; j++)
               {
                   
                        System.out.print("\t"+ch1);

               }
               ch1++;
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