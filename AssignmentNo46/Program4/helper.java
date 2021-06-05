//Write a program which accept number from user and return multiplication of all digits. 

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
  
    public int Multiply(int iNo) 
    { 
        int iMult = 1;
        int iDigit = 0;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iMult = iMult *iDigit;
            iNo = iNo/10;
        }
        return iMult;
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
         int iRet = dobj.Multiply(iNum);
         System.out.println(+iRet);
         System.gc();

     }
 }


