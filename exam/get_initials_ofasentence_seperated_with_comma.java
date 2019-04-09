import java.io.*;
class get_initials_ofasentence_seperated_with_comma
{
public static void main(String aa[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence:");
String s=br.readLine();
s=s.trim();
s=" "+s;
for(int i=0; i<=s.lastIndexOf(' '); i++)
if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
{
System.out.print(Character.toUpperCase(s.charAt(++i))+".");
}
}
}

