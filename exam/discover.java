class discover
{
    public void first()
    {
        System.out.println("FIRST");
    }
    public void second()
    {
        first();
        System.out.println("SECOND");
    }
    public void third()
    {
        second();
        System.out.println("THIRD");
    }
    public static void main(String args[])
    {
        discover obj=new discover();
        obj.third();
    }
}