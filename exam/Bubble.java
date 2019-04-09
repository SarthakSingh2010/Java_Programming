class Bubble
{
    public static void main(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int p=0;p<a.length;p++)
        System.out.print(a[p]+"  ");
    }
}