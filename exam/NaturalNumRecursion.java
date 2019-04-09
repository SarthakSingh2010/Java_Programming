import java.util.Scanner;
public class NaturalNumRecursion
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        NaturalNumRecursion obj = new NaturalNumRecursion();
        System.out.print("Natural numbers till "+n+" :");
        obj.natural(n,1);
 
 
    }
    int natural(int y, int i)
    {
        if(i <= y)
        {
            System.out.print(i+" ");
            return(natural(y,++i));
        }
        return 1;
    }
}