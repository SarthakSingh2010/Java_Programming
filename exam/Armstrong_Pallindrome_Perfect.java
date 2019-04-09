import java.io.*;
class Armstrong_Pallindrome_Perfect
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER A NO");
int a=Integer.parseInt(br.readLine());
int b=a,v,s=0;
while(b>0)
{
v=b%10;
s=s+(v*v*v);
b=b/10;
}
if(s==a)
System.out.println("ARMSTRONG");
else
System.out.println("NOT ARMSTRONG");
int i,f=0;
for(i=1;i<a;i++)
{
if(a%i==0)
f=f+i;
}
if(a==f)
System.out.println("PERFECT");
else
System.out.println("NOT PERFECT");
int y=a;
int d=0;
int l;
while(y>0)
{
l=y%10;
d=(d*10)+l;
y=y/10;
}
if(d==a)
System.out.println("PALLINDROME");
else
System.out.println("NOT PALLINDROME");
}
}


