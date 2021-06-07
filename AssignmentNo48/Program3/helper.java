//Write a program which accept number from user and return the  count of digits in between 3 and 7.

import java.util.*;

import java.util.*;

class ArrayDemo 
 { 

   ///////////////////////////////////////////////////////////////
   //Function Name: Difference
   //Discription  :   
   //Author       : Prajwal Kadam
   //Date         : 1 jun 2021
   ///////////////////////////////////////////////////////////////
    public int Difference(int iNo) 
    { 
        int iDigit = 0,iCnt = 0;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if((iDigit>3)&&(iDigit<7))
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
         System.out.println("Enter number");
         int iSum = sobj.nextInt();

         ArrayDemo dobj = new ArrayDemo();

         int iRet = dobj.Difference(iSum);
         System.out.println(+iRet);
     
     }
 }


