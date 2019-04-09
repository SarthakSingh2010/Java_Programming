import java.io.*;
class CircularLeftShiftN
{
                public static void main(String sachin[])
                {
                                int arr[]=new int[10];
                                int i,var,j,n;
                                Console con = System.console();
                               
                                System.out.println("enter 10 elements of the array");
                                for(i=0;i<10;i++)
                                                arr[i]=Integer.parseInt(con.readLine());
                                System.out.print("enter value of n ");
                                n=Integer.parseInt(con.readLine());
                                for(j=0;j<n;j++)
                                {
                                var=arr[0];
                                for(i=0;i<9;i++)
                                                arr[i]=arr[i+1];
                                arr[9]=var;
                                }
                                for(i=0;i<10;i++)
                                                System.out.print(arr[i]+" ");
                }
}

//INPUT:-
//Enter 10 elements of the array :
//1 2 3 4 5 6 7 8 9 10
//Enter value of n 3

//OUTPUT:-
//4 5 6 7 8 9 10 1 2 3 
