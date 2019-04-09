import java.io.*;
class find_the_largest_word_ina_sentence
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER A SENTENSE");
String str=br.readLine()+" ";
int max=0;
String str1=" ",str2=" ";
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch==' ')
{
int y=str1.length();
if(y>max)
{
max=y-1;
str2=str1;
}
str1=" ";
}
else
str1=str1+ch;
}
System.out.println(max+" "+str2);
}
}