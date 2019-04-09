class InsertionSort   //best among all O(n^2) sorts
{
    public static void main(int arr[])
    {
        for(int j=1;j<arr.length;j++)
        {
            int i=j-1;
            int key=arr[j];
            while(i>-1&&arr[i]>key)
            {
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=key;
        }
        for(int p=0;p<arr.length;p++)
        {
            System.out.print(arr[p]+"\t");
        }
    }
}