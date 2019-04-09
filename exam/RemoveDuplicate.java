class RemoveDuplicate
{
    public static void main(int arr[])
    {
        int n=arr.length;
        int c=-1;
        int flag=0;
        int co;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            co=arr[i];
            flag=0;
            for(int j=0;j<=c;j++)
            {
                if(res[j]==co)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                res[++c]=co;
            }
        }
        for(int p=0;p<=c;p++)
        {
            System.out.print(res[p]+" ");
        }
    }
}
            