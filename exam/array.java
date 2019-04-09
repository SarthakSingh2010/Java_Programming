/*
 * 1 2 3 4 5 6 7 8 9 10
 * 1 3 5 7 9
 * 1 3 7 9
 * 1 3 7
 */
class  array
{
    public static void main(int arr[])
    {
        int n=arr.length,k=1,c=2;
        while(k<n)
        {
            int j=0;
            for(int m=k;m<n;m=m+c)
            arr[m]=-9999;
            for(int m=0;m<n;m++)
            {
                if(arr[m]!=-9999)
                arr[j++]=arr[m];
            }
            k++;
            n=j;
            c++;
        }
        for(int p=0;p<n;p++)
        System.out.print(arr[p]+"  ");
    }
}        