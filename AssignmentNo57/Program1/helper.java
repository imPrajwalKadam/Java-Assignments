import java.util.*;
/* 

Problem Statement-
1. Write Java program which accept String from user and display 
below pattern. 
Input : Hello 
Output : H * * * * 
         H e * * * 
         H e l * * 
         H e l l *
         */ 
class Pattern 
{
     public void Pattern(String str)
     {
          char[] ch = str.toCharArray();
          for(int i = 0; i < str.length(); i++)
          {
               for(int j = 0 ;j < str.length(); j++)
               {       
                    if(i<=j)
                    System.out.print( "*"+"\t");
                    else  
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
          System.gc();
     }
}