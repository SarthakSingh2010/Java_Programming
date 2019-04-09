class Update
{
    private int arr[]={1,2,3,4};
    public void updateref(Update ob)
    {
        for(int k=0;k<ob.arr.length;k++)
        {
            ob.arr[k]+=5;
        }
    }
    public static void main(String args[])
    {
        Update obj1=new Update();
        for(int k=0;k<obj1.arr.length;k++)
        System.out.print(obj1.arr[k]+"   ");
        System.out.println("\nUpdated array:\n");
        obj1.updateref(obj1);
        for(int k=0;k<obj1.arr.length;k++)
        System.out.print(obj1.arr[k]+"   ");
    }
}