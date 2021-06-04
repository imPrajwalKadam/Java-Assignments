import java.util.Scanner;

/* Write Java program which accept N numbers from user and return difference between summation of even elements and summation of odd elements. 
 Input : N : 6 
 Elements : 85 66 3 80 93 88 
 Output : 53 (234 - 181)          */


class ArrayDemo 
{
     public int Difference(int Arr[],int iNo)
     {
          int iSum1 = 0,iSum2 = 0;
          for(int i = 0;i < iNo;i++)
          {
               if((Arr[i]%2)==0)
               {
                    iSum1 = iSum1 + Arr[i]; 
               }
               else{
                    iSum2 = iSum2 + Arr[i];
               }
          }
          return iSum1 - iSum2;
     }
     
}
class helper
{
     public static void main(String arg[])throws Exception
     {
          Scanner sobj = new Scanner(System.in);

          System.out.println("Enter total number of elements");
          int iSize = sobj.nextInt();
          int arr[] = new int[iSize];

          System.out.println("Enter the "+iSize+" Numbers:");
          for(int i = 0;i < iSize ;i++)
          {
               arr[i] = sobj.nextInt();
          }
          ArrayDemo dobj =new ArrayDemo();
          int iRet = dobj.Difference(arr,iSize);
          System.out.println("Difference of elements is:"+iRet);
          System.gc();
     }    
}