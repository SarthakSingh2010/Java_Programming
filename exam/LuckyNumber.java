import java.io.*;
class LuckyNumber
 {
     public static void main()throws IOException
     {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the limit");   
       int n=Integer.parseInt(br.readLine());
       int A[]=new int[n];
       int c=0,l=0,l1=0,y=0,i,j;
       if (n%2==0)
       l=n/2;
       else
       l=(n/2)+1;
       l1=l;
       for(i=1;i<=n;i++)
       {
           if(i%2!=0)
           {
               A[c]=i;
               c++;
            }
        }
        int x=A[1];
        boolean ans=true;
            for(i=0;i<l1;i++)
    System.out.print(A[i]+",");
    System.out.println();
        while(ans)
        {
            l=l1;
            /*for(i=0;i<l1;i++)
    System.out.print(A[i]+",");
    System.out.println();*/
            for(i=0;i<l;i++)
            {
                y++;
                if(y==x)
                {
                    for(j=i;j<l1;j++)
                    A[j]=A[j+1];
                    l1--;
                    y=1;
                    System.out.println("l--"+l);
                }
            }
            for(i=0;i<l1;i++)
    System.out.print(A[i]+",");
    System.out.println();
        x=A[x-1];
        System.out.println(x);
        if(x>l1)
        break;
    }
    for(i=0;i<l1;i++)
    System.out.println(A[i]);
}
/* for upto 25
 * 1,3,5,7,9,11,13,15,17,19,21,23,25     3
 * 1,3,7,9,13,15,19,21,25               7
 * 1,3,7,9,13,15,21,25  
 * for upto 100
 * 1,3,7,9,13,15,21,25,31,33,37,43,49,51,63,67,69,73,75,79,87,93,99  
 */
}

        