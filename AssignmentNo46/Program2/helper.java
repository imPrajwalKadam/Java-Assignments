//Write a java program which accept number from user and return the Odd of even digits.
import java.util.*;

class digits
{

    public int CountOdd(int iNo)
    {
        int iCnt = 0; 
        while(iNo > 0)
        {
            if(((iNo%10)%2)!=0)
            {
                iCnt++;
            }
            iNo = iNo/10;
        }
        return iCnt;
    }
}
class helper
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iSum = sobj.nextInt();

        digits dobj = new digits();
        int iRet = dobj.CountOdd(iSum);
        System.out.println("Count of Odd number is:"+iRet);
        System.gc();
        sobj.close();
    }
}