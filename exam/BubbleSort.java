class BubbleSort
{
    public static void main(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<(n-i-1);j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int p=0;p<arr.length;p++)
        {
            System.out.print(arr[p]+" ");
        }
    }
}