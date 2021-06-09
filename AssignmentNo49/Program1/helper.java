import java.util.Scanner;

/*
 Write java program which accept N numbers from user and accept one another number as NO , check whether NO is present or not. 
 Input   : N : 6 
          No: 66     
 Elements   : 85 66 3 80 93 88 
 Output     : true      
                                                             */
class Number 
{ 
     boolean Check(int Arr[], int iNo,int No) 
    { 
         boolean iFlag = false;
         for(int i = 0;i< iNo;i++)
         {
              if(Arr[i]==No)
              {
                iFlag = true;
              }
             
         }
         return iFlag;                                                    
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
          boolean iRet = dobj.Check(arr,iSize,No);
          if(iRet == true)
          {
               System.out.println("True");
          }
          else
          {
               System.out.println("False");

          }
          System.gc();
     }    
}