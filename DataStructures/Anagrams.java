import java.util.*;
class Anagrams
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        String t=sc.next();
        System.out.println(solve(s,t)==true?"YES":"NO");
        
    }
    public static boolean solve(String s,String t)
    {
        char sarr[]=s.toCharArray();
        char tarr[]=t.toCharArray();
        
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        
        return Arrays.equals(sarr,tarr);
    }
}