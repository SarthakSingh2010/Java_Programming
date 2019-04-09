import java.io.*;
class Input
{
    public static void main(String args[])throws IOException
    {
        DataInputStream br=new DataInputStream(System.in);
        System.out.println("enter number");
        int a=Integer.parseInt(br.readLine());
        System.out.println(a);
    }
}
