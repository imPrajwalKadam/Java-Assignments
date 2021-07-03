import java.util.*;
/* 
Problem Statement-
Write Java program which accept String from user and display below pattern. 
Input : Hello 
Output : H  e  l  l  o 
         H  e  l  l 
         H  e  l 
         H  e
         H       
*/
class Pattern 
{
     public void Pattern(String str)
     {
          int j,i;
          char[] ch = str.toCharArray();
          for( i = str.length(); i > 0; i--)
          {
               for( j = 0 ;j < str.length(); j++)
               {       
                    if(j<i)
                    System.out.print( ch[j]+"\t"); 
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
          System.out.println("Enter String:");
          String row = sobj.nextLine();
          obj.Pattern(row);
     }
}