//Write a java program which accept number from user and return the count of even digits.
import java.util.*;
class digits
{
     public int CountEven(int iNo)
     {
          int iCnt = 0;
          while(iNo > 0)
          {
               if(((iNo%10)%2)==0)
               {
                    iCnt++;
               }   
               iNo = iNo/10;
          }
          return iCnt;
     }
}
class helper
{
     public static void main(String arg[])
     {
          Scanner sobj = new Scanner(System.in);
          System.out.println("Enter Number");
          int iNum = sobj.nextInt();
          digits dobj = new digits();
          int iRet = dobj.CountEven(iNum);
          System.out.println("Count of Even Digits is:"+iRet);
          System.gc();
     }
}