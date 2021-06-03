//Write a java program which accept string from user and count number of small characters. 
import java.util.*;

class StringDemo
{
    public int CountSmall(String str)
    {
        int iCnt = 0;
        char ch[] = str.toCharArray();
        for(int i=0 ; i < ch.length;i++)
        {
            if((ch[i]>='a')&&(ch[i]<='z'))
            {
                iCnt++;
            }
        }
        return iCnt;

    }
}

class helper
{
    public static void main(String aths[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        StringDemo cobj = new StringDemo();

        int iRet = cobj.CountSmall(str);

        System.out.println("Count of small character is:"+iRet);
    }
}