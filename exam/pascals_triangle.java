class pascals_triangle
{
public static void main(String args[])
{
int a[]=new int [6];
for(int i=1;i<=5;i++)
{
for(int k=i;k>=1;k--)
{
if(k==1||k==i)
a[k]=1;
else
a[k]=a[k]+a[k-1];
System.out.print(a[k]);
}
System.out.println();
}
}
}