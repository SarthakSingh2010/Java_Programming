import java.io.*;
class sumofdiagonal    
{
public static void main(String args[])throws IOException   
{
BufferedReader br = new BufferedReader (new InputStreamReader(System. in)) ;
int num[][]=new int [3][3]; 
  int  i, j, ld=0, rd=0 ;
for(i=0;i<3;i++)
 {  
 for(j=0;j<3;j++)
 {
 System.out.println("Enter the number") ;
 num[i][j]=Integer.parseInt(br.readLine()) ;   
 } }
 System.out.println("The matrix entered is :") ;
 for(i=0;i<3;i++)
 {
 for(j=0;j<3;j++)
 {
 if( i==j)
{
ld=ld+num[i][j] ;
}
if( i + j==2)
{
 rd= rd + num[ i ][ j ] ;
 }
 System.out.print(num[i][j]+"\t") ;
}
System.out.println() ; 
}
System.out.println("The sum of left diagonal is :"+ld) ; System.out.println("The sum of right diagonal is:"+rd) ;
}
}
