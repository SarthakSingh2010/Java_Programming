class BubbleSortModified
{
    public static void main(int arr[])
    {
        int n=arr.length;
        boolean swap=true;
        while(swap==true)
        {
            swap=false;
            for(int i=0;i<(n-1);i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                    swap=true;
                }
            }
        }
  
        for(int p=0;p<arr.length;p++)
        {
            System.out.print(arr[p]+"  ");
        }
    }
}