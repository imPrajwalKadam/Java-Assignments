import java.nio.channels.ClosedSelectorException;
import java.util.*;


 /*  Problem Statement-

          write Java program which accept number of rows and number of columns 
          from user and display below pattern. 
        Input   :  iRow = 4 iCol = 4 
        Output  :  A B C D 
                   a b c d 
                   A B C D 
                   a b c d  
                                                               
*/
import java.util.*;

class Pattern
{
     char ch1 = 'A',ch2 = 'a';
     int i = 0,j = 0;
     public void patter(int iRow, int iCol )
     {
          for( i = 0; i<iRow ;i++ )
          {
               System.out.println();
               for( j = 0;j<iCol; j++)
               {
                   if(i % 2==0)
                   {
                        System.out.print("\t"+ch1);
                        ch1++;
                   }
                   else{
                        System.out.print("\t"+ch2);
                        ch2++;
                   }
               }
               ch1 = 'A';
               ch2 = 'a';c
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