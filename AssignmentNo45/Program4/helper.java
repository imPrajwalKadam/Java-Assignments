//Write Java program which accept N numbers from user and display all such elements which are even and divisible by 5. 


import java.util.*;

import java.util.*;

class ArrayDemo 
 { 
   ///////////////////////////////////////////////////////////////
   //Function Name: Difference
   //Discription  : this function accept  N numbers from user and Display that number who are even and  divisible by 5 & 3.  
   //Author       : Prajwal Kadam
   //Date         : 1 jun 2021
   ///////////////////////////////////////////////////////////////
    public void Difference(int Arr[],int iNo) 
    { 
        System.out.println("This  elements is  Divisible by 5 and 3:");
        for(int i = 0;i<iNo;i++)
        {
            if(((Arr[i]%3)==0)&&((Arr[i]%5)==0))
            {
                System.out.println(+Arr[i]);
            }
        }
    } 
 }

 class helper
 {
     public static void main(String arg[])
     {
         Scanner sobj = new Scanner(System.in);
         System.out.println("Enter total number of elements ");
         int iSize = sobj.nextInt();
         int arr[] = new int[iSize];

         System.out.println("Enter elements");
         for(int i = 0 ;i < iSize;i++)
         {
             arr[i] = sobj.nextInt();
         }
         ArrayDemo dobj = new ArrayDemo();
         dobj.Difference(arr,iSize);
         System.gc();
     }
 }


