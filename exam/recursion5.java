class recursion5
{
   public static void main(int a[],int k)
   {
       System.out.println(binarysearch(a,k,0,a.length));
   }
   public static int binarysearch(int a1[],int k1,int l,int u)
   {
       if((l>u)||(k1>a1[a1.length-1]))
       return -1;
       int mid=(l+u)/2;
       if(a1[mid]<k1)
           return binarysearch(a1,k1,mid+1,u);
       else
       if(a1[mid]>k1)
           return binarysearch(a1,k1,l,mid-1);
       else
       return mid;
   }
}

    