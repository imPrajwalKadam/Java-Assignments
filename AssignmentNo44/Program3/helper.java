//Write a java program which accept string from user and return difference between frequency of small characters and frequency of capital characters. 
//input  : AtharVa
//output : (5-2) 3


import java.util.*;

class StringDemo
{
   int DiffChar(String str)
   {
      int iCnt1 = 0,iCnt2 = 0;
      char ch[] = str.toCharArray();
      for(int i = 0;i < ch.length;i++)
      {
         if((ch[i]>='A')&&(ch[i]<='Z'))
         {
            iCnt1++;
         }
         if((ch[i]>='a')&&(ch[i]<='z'))
         {
            iCnt2++;
         }
      }
      return iCnt1 - iCnt2;
   }
}

class helper
{
public static void main(String arg[])
{
   Scanner sobj = new Scanner(System.in);
   System.out.println("Enter String");
   String str = sobj.nextLine();
   StringDemo dobj = new StringDemo();
   int iRet = dobj.DiffChar(str);

   System.out.println("Difference of character is :"+iRet);
}
}

