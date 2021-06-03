//Write a java program which accept string from user and display it in reverse order.
import java.util.*;

class StringDemo
{
   public static String Reverse(String str)
   {
       char ch[] = str.toCharArray();
       String rev = " ";
       for(int i = ch.length-1;i>=0;i-- )
       {
          rev+=ch[i];
       }
       return rev;
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
   String iRet = dobj.Reverse(str);

   System.out.println("Difference of character is :"+iRet);
}
}

