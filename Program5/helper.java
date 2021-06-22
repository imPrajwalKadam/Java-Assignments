import java.util.*;

/*  Problem Statement-

        Write a program which accept matrix and swap the contents of consecutive rows. 
        Input : 
                3  2  5  9 
                4  3  2  2 
                8  4  1  5
                3  9  7  5  

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
     public void SwapRows() 
     {
		int temp = 0;
          int j=0;
          System.out.println("Swapped  elements are:");

		for(int i = 0; i < Arr.length; i+=2)	// Rows
		{
               if(i%2!=0)
               {
                    continue;
               }
               j = i+1;
			for(int k = 0; k < Arr[i].length; k++)	// Columns
			{
                  temp = Arr[i][k];
                  Arr[i][k] = Arr[j][k];
                  Arr[j][k] = temp;
          	}
               System.out.println();
          }
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
          mobj.SwapRows();
          mobj.Display();
          System.gc();
     }
}