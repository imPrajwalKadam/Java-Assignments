import java.util.Scanner;

/*
 Write java program which accept N numbers from user and accept one another number as NO , return index of first occurrence of that NO. 
 Input   : N : 6 
           No: 66     
 Elements   : 85 66 3 80 93 88 
 Output     : 1      
                                                             */
class Number 
{ 
     public int FirstOcc(int Arr[],int iNo,int No) 
    { 
         int iCnt = 0;
         for(int i = 0;i< iNo;i++)
         {
             if(Arr[i]==No)
             {
                  iCnt++;
                 break;
             }
             
         }
         return iCnt;                                                    
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

          System.out.println("Enter No");
          int No = sobj.nextInt();

          System.out.println("Enter the "+iSize+" Numbers:");
          for(int i = 0;i < iSize ;i++)
          {
               arr[i] = sobj.nextInt();
          }
          Number dobj =new Number();
          int iRet = dobj.FirstOcc(arr,iSize,No);
          System.out.println("Index of first occerencce is:"+iRet);
          System.gc();
     }    
}