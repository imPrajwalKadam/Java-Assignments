import java.util.*;

/*  Problem Statement-

 Write a program which accept matrix and swap the contents of consecutive rows. 
         Input : 
                4  3  2  2 
                3  2  5  9 
                3  9  7  5 
                8  4  1  5 

     Output : 18 18 15 25
                                                               
*/

import java.util.*;
class Matrix
{
     public int Arr[][];
     public Matrix(int iRow,int iCol)
     {
          Arr = new int[iRow][iCol];
     }
     protected void finalize()
     {
          Arr = null;
     }
     public void Accept()
     {
          Scanner sobj = new Scanner(System.in);

          System.out.println("Enter the elements:");
          for(int i = 0; i <Arr.length; i++)
          {
               for(int j = 0; j < Arr[i].length; j++)
               {
                    Arr[i][j] = sobj.nextInt();
               }
          }
     }
     public void Display()
     {
          System.out.println("Entered elements are:");
          for(int i = 0; i <Arr.length;i++)
          {
               for(int j = 0 ; j < Arr[i].length ;j++)
               {
                    System.out.print(Arr[i][j]+"\t");
               }
               System.out.println();
          }
     }
     public boolean ChkSparse() 
     {
          int iCnt1 = 0,iCnt2 = 0; 
          System.out.println("Swaped elements are:");
		for(int i = 0; i < Arr.length; i++)	// Rows
		{
			for(int j = 0; j < Arr[i].length; j++)	// Columns
			{
                    if(Arr[i][j]==0)
                         iCnt1++;
                    else
                         iCnt2++;
          	}
          }
          if(iCnt1>iCnt2)
          return true;
          else 
          return false;
     } 
}
class helper
{
     public static void main(String arg[])
     {        
          Scanner sobj = new Scanner(System.in);
          System.out.println("Enter Number of rows");
          int row = sobj.nextInt();

          System.out.println("Enter number of columns");
          int col = sobj.nextInt();


          Matrix mobj = new Matrix(row,col);
          mobj.Accept();
          mobj.Display();
          boolean bRet = mobj.ChkSparse();
          if(bRet == true)
          {
               System.out.println("it is an Sparse matrix");
          }
          else
          {
               System.out.println("its not Sparse matrix");
          }
          System.gc();
     }
}