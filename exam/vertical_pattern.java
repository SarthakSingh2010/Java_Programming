class vertical_pattern
{
public static void main()
{
int i , j , diff , start=1 ;
for(i=1;i<=5;i++) //loop for the number of lines
{
start =i ;  //initial value
diff =4 ; //initial difference
for(j=i ; j<i+ i ; j++)  //i+i will return the loop i times
{
System.out.print(start+"\t") ;
start=start+diff ;
diff-- ;
}
System.out.println() ;
    }
}
    }
    
