import java.util.Scanner;

/*
 Write java program which accept N numbers from user and accept one another number as NO , return index of last occurrence of that NO.  Write java program which accept N numbers from user and accept 
one another number as NO , return index of last occurrence of that NO. 

 Input   : N : 6 
           No: 66     
 Elements   : 85 66 3 66 93 88 
 Output     : 3 
                                                             */
class Number 
{ 
     public int Product(int Arr[],int iNo) 
    { 
         int iProduct = 1;
         for(int i = 0 ;i < iNo;i++)
         {
           if((Arr[i]%2)!= 0)
           {
             iProduct = iProduct * Arr[i];
           }
         }
         return iProduct;              
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
          Number dobj =new Number();
          int iRet = dobj.Product(arr,iSize);
          System.out.println("Index of Last occerencce is:"+iRet);
          System.gc();
     }    
}