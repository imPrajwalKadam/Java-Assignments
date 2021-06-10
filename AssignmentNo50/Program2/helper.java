import java.util.*;


 /*  Problem Statement-

      Write java  program which accepts 2 strings from user and 
     concat N characters of second string after first string.Value of N 
     should be accepted from user. 
     Note : If third parameter is greater than the size of second string 
     then concat whole string after first string. 

     Input    :   
              :   
     N   :     

     Output   :                                                               
*/
class  StringDemo 
{
     public boolean StrCompX(String src, String dest) 
     {    
        if(src.equals(dest))
        {
             return true;
        }
        else
        {
             return false;
        }
     }
}
class helper
{
     public static void main(String arg[])
     {
          Scanner sobj = new Scanner(System.in);

          System.out.println("Enter First String:");
          String str1 = sobj.nextLine();

          System.out.println("Enter Second String");
          String str2 = sobj.nextLine();
  
        StringDemo strobj = new StringDemo();

        boolean iRet = strobj.StrCompX(str1,str2);

        if(iRet == true)
        {
             System.out.println("Strings are same");
        }
        else{
             System.out.println("Strings are different");
        }

        System.gc();
     }    
}