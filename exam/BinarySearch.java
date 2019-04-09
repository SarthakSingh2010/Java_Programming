class BinarySearch
{
    public static void main(int a[],int k)
    {
        int mid,pos=-1,u=a.length,l=0,flag=0;
        while(l<u)
        {
            mid=(u+l)/2;
            if(a[mid]==k)
            {
                flag=1;
                pos=mid;
                break;
            }
            else
            if(k>a[mid])
            {
              l=mid+1;
            }
            else
            if(k<a[mid])
            {
                u=mid-1;
            }
        }
        if(flag==1)
        {
            System.out.println("found at index pos "+pos);
        }
        else
        {
            System.out.println("not found");
        }
    }
}           