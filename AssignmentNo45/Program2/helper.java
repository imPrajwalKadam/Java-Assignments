//Write Java program which accept N numbers from user and display all such elements which are divisible by 5.
import java.util.*;

class ArrayDemo 
 { 
    public void Display(int Arr[],int iNo) 
    { 
        System.out.println("This number is Divisible by 5:");
        for(int i = 0;i<iNo;i++)
        {
            if((Arr[i]%5)==0)
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
         dobj.Display(arr,iSize);
         System.gc();
     }
 }


