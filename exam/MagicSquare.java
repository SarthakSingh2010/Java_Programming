import java.io.*;
class MagicSquare
{
    int [][]magic;
    int N;
    MagicSquare(int n)
    {   
        magic=new int[n][n];
        N=n;
    }
    void create()
    {
        int row=0;
        int col=N/2;
        magic[row][col]=1;
        for(int i=2;i<=N*N;i++)
        {
            if(magic[(row-1+N)%N][(col+1)%N]==0)
            {
                row=(row-1+N)%N;
                col=(col+1)%N;
            }
            else
            {
                row=(row+1)%N;
            }
            magic[row][col]=i;
        }
    }
    void display()
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(magic[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void main()
    {
        MagicSquare sq=new MagicSquare(N);
        sq.create();
        sq.display();
    }
}
   