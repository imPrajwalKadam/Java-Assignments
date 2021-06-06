import java.util.Scanner;

/*
 Write java program which accept N numbers from user and accept Range, Display all elements from that range 

 Input   :  N    : 6 
            Start: 60
            End  : 90      
 Elements   : 85 66 3 76 93 88 
 Output     : 66 76 88
                                                             */
class Number 
{ 
     public void Display(int Arr[],int iNo,int iStart,int iEnd) 
    { 
         int iCnt = 0,iFlag = 0;
         for(int i = 0;i< iNo;i++)
         {
             if((Arr[i] >= iStart) && (Arr[i] <= iEnd))
             {
                 System.out.println("Elements is:"+Arr[i]);
             }
         }
                                                             
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

          System.out.println("Enter Starting Number");
          int iStart = sobj.nextInt();

          System.out.println("Enter Ending Number ");
          int iEnd = sobj.nextInt();

          System.out.println("Enter the "+iSize+" Numbers:");
          for(int i = 0;i < iSize ;i++)
          {
               arr[i] = sobj.nextInt();
          }
          Number dobj =new Number();
          dobj.Display(arr,iSize,iStart,iEnd);
          
          System.gc();
     }    
}