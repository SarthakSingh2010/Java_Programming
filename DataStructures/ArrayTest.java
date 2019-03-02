class Array
{
    private int a[];
    private int len;
    public Array(int cap)
    {
        a=new int[cap];
        len=0;
    }
    public int size()
    {
        return len;
    }
    public void insert(int val)
    {
        a[len]=val;
        len++;
    }
    public int getMax()
    {
        int max=a[0];
        for(int i=0;i<len;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        return max;
    }
    public int find(int val)
    {
        int pos=-1;
        for(int i=0;i<len;i++)
        {
            if(a[i]==val)
            pos=i;
        }
        return pos;
    }
    public void delete(int val)
    {
        int pos=find(val);
        for(int k=pos;k<len;k++)
        a[k]=a[k+1];
        len--;
    }
    public void deleteAll(int val)
    {
        for(int i=0;i<len;i++)
        {
            if(a[i]==val)
            {
                for(int y=i;y<len;y++)
                a[y]=a[y+1];
                len--;
            }
        }
    }
    public void display()
    {
        for(int i=0;i<len;i++)
        System.out.print(a[i]+"  ");
        System.out.println();
    }
}
public class ArrayTest
{
    public static void main(String args[])
    {
        Array obj=new Array(10);
        System.out.println("max value "+obj.getMax());
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(1);
        obj.display();
        System.out.println("max value "+obj.getMax());
        System.out.println("3 is index at "+obj.find(3));
        obj.delete(1);
        obj.display();
        obj.deleteAll(1);
        obj.display();
        System.out.println("3 is index at "+obj.find(3));
    }
}          