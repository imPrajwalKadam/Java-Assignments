// Write a java program which accept string from user and display it in reverse order.
import java.util.*;

class StringDemo
{
    public boolean ChkVowel(String  str)
    {
        int iCnt = 0;
        boolean iFlag = true;
        char ch[] = str.toCharArray();
        for(int i = 0;i < ch.length;i++)
        {
            if(((ch[i]=='A')||(ch[i] =='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U'))||((ch[i]=='a')||(ch[i] =='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')))
            {
                iCnt++;
            }
            if(iCnt>0)
            {
                iFlag = true;
            }
            else{
                iFlag = false;
            }
        }  
        return iFlag;
    }
}
class helper
{
    public static void main(String aths[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();
        StringDemo dobj = new StringDemo();
        boolean bRet = dobj.ChkVowel(str);
        if(bRet == true)
        {
            System.out.println("String contains vowels");
        } 
        else{
            System.out.println("String did not contains vowels");
        }
    }
}