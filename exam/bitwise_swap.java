class bitwise_swap
{
    public static void main(int a,int b)
    {
        System.out.println("a = "+a+" b = "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a = "+a+" b = "+b);
        
    }
}
