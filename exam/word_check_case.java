class word_check_case
{
public static void main(String str)
{
int s=str.length();
char ch;
for(int i=0;i<s;i++)
{
ch=str.charAt(i);
boolean p=Character.isUpperCase(ch);
if(p==true)
System.out.print(Character.toLowerCase(ch));
else
System.out.print(Character.toUpperCase(ch));
}
}
}