import java.io.*;
class binary_to_decimal
{
public static void main()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
long bin ;
int j=0 ,num=0 , rem ;
System.out.println("Enter the binary number") ; 
bin = Long.parseLong(br.readLine()) ;
while(bin > 0)
{
rem = (int) bin % 10 ;
num = num +rem * (int)Math.pow(2 , j) ;
j++ ;
bin = bin/10 ;
    }
System.out.println("The decimal equivalent is "+num) ;    
    }
}
    
    

