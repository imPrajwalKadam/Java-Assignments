import java.util.*;
/* 

Problem Statement-
rite Java program which accept String from user and display 
below pattern. 
Input : Hello 
Output : H  #  #  #  # 
         H  e  #  #  # 
         H  e  l  #  # 
         H  e  l  l  # 
         H  e  l  l  o 
         H  e  l  l  # 
         H  e  l  #  # 
         H  e  l  #  # 
         H  e  #  #  # 
         H  #  #  #  #    
*/
class Pattern 
{
     public void Pattern(String str)
     {
          char[] ch = str.toCharArray();

          for(int i = 0; i < str.length()-1; i++)
          {
               for(int j = 0 ;j < str.length(); j++)
               {       
                    if(j<=i)
                    System.out.print( ch[j]+"\t");  
                    else
                    System.out.print( "#"+"\t");  

               }
               System.out.println();
          }

          for(int i = str.length(); i > 0; i--)
          {
               for(int j = 0 ;j < str.length(); j++)
               {       
                    if(j<i)
                    System.out.print( ch[j]+"\t");  
                    else
                    System.out.print( "#"+"\t"); 
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