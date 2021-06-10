import java.util.Scanner;

/*
Accept string from user and check whether the string is 
palindrome or not without considering its case. 

Input : "1abccBA1" 
Output : TRUE
                                                             */

// Java implementation of the approach
 class  StringDemo
{
     public boolean  StrPallindrome(String str)
     {
          str = str.toLowerCase();
         boolean bRet = true;
          for(int i = 0; i < str.length()/2 ; i++)
          {
               if(str.charAt(i) != str.charAt(str.length()-i-1))
               {
                    bRet = false;
                    break;
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
     
               System.out.println("Enter String:");
     
               String str1 = sobj.nextLine();
     
               StringDemo strobj = new StringDemo();
       
               boolean bRet =  strobj.StrPallindrome(str1);
               if(bRet == true)
               {
                    System.out.println("String is pallindrome");
               }
               else{
                    System.out.println("String not pallindrome");
               }
     
               System.gc();
          }    
     }
     
 