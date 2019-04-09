class SelectionSort
{
    public static void main(int arr[])
    {
        int min=0,minpos=0,n=arr.length;
        for(int i=0;i<n;i++)
        {
            min=arr[i];
            minpos=i;
            for(int j=minpos+1;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    minpos=j;
                }
            }
            int t=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=t;
        }
        for(int p=0;p<n;p++)
        {
            System.out.print(arr[p]+" ");
        }
    }
}
    