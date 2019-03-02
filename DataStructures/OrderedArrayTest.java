class OrderedArrays
{
    private int a[];
    private int len;
    public OrderedArrays(int cap)
    {
        a=new int[cap];
        len=0;
    }
    public int size()
    {
        return len;
    }
    public int find(int item)
    {
        int lower=0;
        int upper=len-1;
        int pos=-1;
        while(lower<=upper)
        {
            int mid=(lower+upper)/2;
            if(a[mid]==item)
            {
                pos=mid;
                break;
            }
            else
            if(a[mid]<item)
            lower=mid+1;
            else
            if(a[mid]>item)
            upper=mid-1;
        }
        return pos;
    }
    public void insert(int item)
    {
        int pos=-1,c=0;
        for(int i=0;i<len;i++)
        {
            if(a[i]>item)
            {
                pos=i;
                c=1;
                break;
            }
        }
        if(c==0)
        a[len]=item;
        else
        {
            for(int p=len-1;p>=pos;p--)
            a[p+1]=a[p];
            a[pos]=item;
        }
        len++;
    } 
    public void display()
    {
        for(int i=0;i<len;i++)
        System.out.print(a[i]+"  ");
        System.out.println();
    }
    public void delete(int val)
    {
        int pos=find(val);
        for(int i=pos;i<len;i++)
        {
            a[i]=a[i+1];
        }
        len--;
    }
}
public class OrderedArrayTest
{
    public static void main(String args[])
    {
        OrderedArrays obj=new OrderedArrays(10);
        obj.insert(1);
        obj.insert(2);
        obj.insert(4);
        obj.insert(5);
        obj.insert(3);
        obj.display();
        System.out.println("3 is index at "+obj.find(3));
        obj.delete(3);
        obj.display();
        System.out.println("3 is index at "+obj.find(3));
    }
}   