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
     public boolean StrNCmpX(String src,String dest,int iCnt) 
     {    
        boolean bRet = true;
        char ch[] = dest.toCharArray();
        char ch1[] = src.toCharArray();  
        for(int i = 0; i < iCnt; i++)
        {  
                  if(ch[i] == ch1[i])
                  {
                       bRet = true;
                  }
                  else
                    {
                       bRet = false;
                  }
        }   
        return bRet;
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
  
          boolean iRet = strobj.StrNCmpX(str1,str2,iNo);
  
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