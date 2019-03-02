import java.util.Scanner;
class CreatePallindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String::");
        String s=sc.next();
        if(checkPallindrome(s)==false)
        System.out.println(createPallindrome(s));
        else
        System.out.println(s);
    }
    public static boolean checkPallindrome(String s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            return false;
        }
        return true;
    }
    public static String createPallindrome(String s)
    {
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        return (s+sb.toString());
    }
}