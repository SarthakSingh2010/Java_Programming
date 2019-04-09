class LinearSearch
{
    public static void main(int a[],int k)
    {
        int pos=-1,flag=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                flag=1;
                pos=i;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("found "+k+" at index position "+pos);
        }
        else
        System.out.println("not found");
   } 
}