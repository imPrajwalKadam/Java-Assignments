import java.util.Scanner;

//Write a Java program which accept string from user and count number of capital characters. 

// Input:Atharva Kadam
//Output:2

class StringDemo
{
     public int CountCapital(String str)
     {
          int iCnt = 0;
        char ch[] = str.toCharArray();
        for(int i = 0;i < ch.length;i++)
        {
             if((ch[i]>= 'A')&&(ch[i] <= 'Z'))
             {
                  iCnt++;
             }
        }
        return iCnt;
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
          int iRet= dobj.CountCapital(str);
          System.out.println("Count of Capital character is:"+iRet);

     }
}