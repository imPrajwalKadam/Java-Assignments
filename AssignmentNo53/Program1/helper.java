import java.util.*;

import javax.management.relation.InvalidRoleInfoException;

/*  Problem Statement-

      1.Write a program which accept matrix from user and display transpose of the matrix. 
        The transpose of a given matrix is formed by interchanging the rows and columns of a matrix.  
        Input : 
                3  2  5  9 
                4  3  2  2 
                8  4  1  5
                3  9  7  5  

        Output : 
                                                               
*/
import java.util.*;

class Matrix
{
     public int Arr[][];
     public int transpose[][];
     public Matrix(int iRow,int iCol)
     {
          transpose = new int[iRow][iCol];
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
     public void AddDiagonal() 
     {
          int i=0,j=0;
          System.out.println("Swapped elements is:");
		for(i = 0; i < Arr.length; i++)// Rows
		{
			for(j = 0; j < Arr[i].length; j++)	// Columns
			{
                    transpose[j][i] = Arr[i][j];
			}
               System.out.println();
		}
     }
     public void displayTranspose()
     {
          System.out.println("Transpose of matrix is:");
          for(int i = 0; i <transpose.length;i++)
          {
               for(int j = 0 ; j < transpose[i].length ;j++)
               {
                    System.out.print(transpose[i][j]+"\t");
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
          mobj.AddDiagonal();
          mobj.displayTranspose();

          System.gc();
     }
}