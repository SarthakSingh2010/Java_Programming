class call_by_value
{
    public static void main(String args[])
    {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        System.out.println("values before swap "+x+" "+y);
        call_by_value.swap(x,y);
        System.out.println("values after swap "+x+" "+y);
    }
    public static void swap(int a,int b)
    {
        int temp=0;
        temp=a;
        a=b;
        b=temp;
    }
}
    