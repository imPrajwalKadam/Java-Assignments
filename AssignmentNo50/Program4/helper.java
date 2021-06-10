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
     public void StrNCmpX(String str) 
     {    
        String bRet = "\0";
       // char ret[] = bRet.toCharArray();

        char ch[] = str.toCharArray();
        for(int i = 0; i< str.length() ; i++)
        {
             if((ch[i] >= 'A')&&(ch[i]<='Z'))
             {
                   ch[i]=(char)((int)ch[i]+32);
             }
             else if((ch[i] >= 'a')&&(ch[i]<='z'))
             {
               ch[i]=(char)((int)ch[i]-32);
             }
        }
        System.out.println("Toggled string is:");
        for(int i = 0; i<ch.length; i++)
        {
             System.out.println(ch[i]);
        }
     }   
}
class helper
{
     public static void main(String arg[])
     {
          Scanner sobj = new Scanner(System.in);

          System.out.println("Enter String:");

          String str1 = sobj.nextLine();

          StringDemo strobj = new StringDemo();
  
          strobj.StrNCmpX(str1);

          System.gc();
     }    
}