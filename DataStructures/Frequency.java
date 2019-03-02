import java.util.*;
class Frequency
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        str=str.toUpperCase();
        for(char ch='A';ch<='Z';ch++)
        {
            int count=0;
            for(int i=0;i<str.length();i++)
            {
                if(ch==str.charAt(i))
                {
                    count++;
                }
            }
            if(count!=0)
            System.out.println(ch+"\t"+count);
        }
    }
}
