import java.io.*;
class merge
{
public static void main(String args[])throws IOException
{
int p[]=new int [6];
int q[]=new int [4];
int r[]=new int [10];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,k,d=0;
for(i=0;i<6;i++)
{
System.out.println("enter a no.for 1st array");
p[i]=Integer.parseInt(br.readLine());
}
for(j=0;j<4;j++)
{
System.out.println("enter a no. for 2nd array");
q[j]=Integer.parseInt(br.readLine());
}
System.out.println("mergeing 2 arrays we get");
for(i=0;i<6;i++)
{
r[d++]=p[i];
}
for(j=0;j<4;j++)
{
r[d++]=q[j];
}
for(k=0;k<10;k++)
{
System.out.print(r[k]+" ");
}
}
}




