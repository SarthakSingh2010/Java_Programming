class callByReference
{
    static int a=10;
    static int b=20;
    public static void main(String args[])
    {
        System.out.println("intially a is "+a+" and b is "+b);
        callbyvalueswap(a,b);
        System.out.println("value of a "+a+" and b is "+b+" after callByValueSwap");
        callByReference obj=new callByReference();
        callbyreferenceswap(obj);
        System.out.println("value of a "+a+" and b is "+b+" after callByReferenceSwap");
    }
    public static void callbyvalueswap(int a,int b)
    {
        int t=a;
        a=b;
        b=t;
        System.out.println("value of a "+a+" and b is "+b+" inside callByValueSwap function");
    }
    public static void callbyreferenceswap(callByReference obj)
    {
        int t=obj.a;
        obj.a=obj.b;
        obj.b=t;
        System.out.println("value of a "+a+" and b is "+b+" inside callByReferenceSwap function");
    }
}