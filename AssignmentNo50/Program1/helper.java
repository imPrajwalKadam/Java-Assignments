import java.util.*;


 /*  Problem Statement-

               write a program which 2 strings from user and check whether 
               first N contents of two strings are equal or not. 
               Note : If third parameter is greater than the size of second string 
               then concat whole string after first string.

     Input    :   "Marvellous Infosystems" 
                  "Marvellous Logic Building" 
        N     :     10
     Output   :               TRUE
                 
     

                                                                 
*/
class  StringDemo 
{
     public String  StrNCatX(String src, String dest,int iCnt) 
     {    
        String sRet = "\0";
        char ch[] = dest.toCharArray();
        char ch1[] = src.toCharArray();  
        for(int i = 0; i < iCnt; i++)
        { 
             sRet = src.concat(dest[i]); 
        }   
        return sRet;
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

          System.out.println("Enter N Number for String");
          int iNo = sobj.nextInt();

          StringDemo strobj = new StringDemo();
  
          String iRet = strobj.StrNCatX(str1,str2,iNo);
  
          System.out.println("String after concatination:"+iRet);
          System.gc();
     }    
}