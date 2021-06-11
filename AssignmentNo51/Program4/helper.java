import java.util.*;


 /*  Problem Statement-

            Write Java program which accept number of rows and number of columns 
            from user and display below pattern. 

            Input  : iRow = 4 iCol = 5 
            Output : 4 4 4 4 4 
                     3 3 3 3 3 
                     2 2 2 2 2 
                     1 1 1 1 1 
                                                               
*/
import java.util.*;

class Pattern
{
    
     int i = 0,j = 0;
     public void patter(int iRow, int iCol )
     {
          for( i = iRow; i>= 1 ;i-- )
          {
               System.out.println();
               for( j = 1 ;j<=iCol ; j++)
               {
                   
                        System.out.print("\t"+i);

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