import java.util.*;

/*  Problem Statement-

        Write a program which accept matrix from user and return Largest  number from both  diagonals . 

        Input : 
                3  2  5  9 
                4  3  2  2 
                8  4  1  5
                3  9  7  5  

        Output : 12 
                                                               
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
     public int AddDiagonal() 
     {
		int iCnt = 0,iMax1 = 0,iMax2 = 0,iRet = 0;
		for(int i = 0; i < Arr.length; i++)	// Rows
		{
			for(int j = 0; j < Arr[i].length; j++)	// Columns
			{
                    if(Arr[i][j]>Arr[0][i])
                    {
                         iMax1 = Arr[i][j];
                    }
                    else if(Arr[i][0]>Arr[i][j])
                    {
                         iMax2 = Arr[i][0];
                    }
			}

               if(iMax1>iMax2)
               {
                    iRet = iMax1;
               }
               else{
                    iRet = iMax2;
               }

		}
          return iRet;
		
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
         
          int iRet = mobj.AddDiagonal();
          System.out.println("Maximum of number is:"+iRet);
          System.gc();
     }
}