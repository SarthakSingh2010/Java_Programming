class anomynousArray
{
   public static void main(String args[])
   {
       int a[]={1,2,3};    
       for(int p=0;p<3;p++)
       {
           System.out.print(a[p]+" ");
       }
       System.out.println();
       a=new int[] {9,8,7} ;
       for(int p=0;p<3;p++)
       {
           System.out.print(a[p]+" ");
       }
   }
}
        