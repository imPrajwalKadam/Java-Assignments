//Write a program which accept number from user and return difference between summation of even digits and summation of odd digits. 
import java.util.*;

import java.util.*;

class Digit 
{ 
   ///////////////////////////////////////////////////////////////
   //Function Name: Difference
   //Discription  : 
   //Author       : Prajwal Kadam
   //Date         : 1 jun 2021
   ///////////////////////////////////////////////////////////////
  
    public int CountDiff(int iNo) 
    {
        int iSum1 = 0,iSum2=0,iDigit = 0;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2)==0)
            {
                iSum1 = iSum1 + iDigit;
            }
            else{
                iSum2 = iSum2 + iDigit;
            }
            iNo = iNo/10;
        } 
        return iSum1 - iSum2;
    }    
} 

 class helper
 {
     public static void main(String arg[])
     {
         Scanner sobj = new Scanner(System.in);
         System.out.println("Enter Number");
         int iNum = sobj.nextInt();

         Digit dobj = new Digit();
         int iRet = dobj.CountDiff(iNum);
         System.out.println(+iRet);
         System.gc();

     }
 }


