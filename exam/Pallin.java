class Pallin
{
    public static void main(String s)
    {
        StringBuffer m=new StringBuffer(s);
        m.reverse();
        String k=m.toString();
        if(k.equals(s))
        System.out.println("PALLINDROME");
        else
        System.out.println("NOT PALLINDROME");
    }
}