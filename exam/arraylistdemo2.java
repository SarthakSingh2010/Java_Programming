import java.util.*;
class arraylistdemo2
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arrlist=new ArrayList<Integer>(5);
        for(int i=0;i<5;i++)
        {
            System.out.println("value");
            arrlist.add(sc.nextInt());
        }
        System.out.println(arrlist);
        int arr[]=new int[arrlist.size()];
        for(int i=0;i<arr.length;i++)
        arr[i]=arrlist.get(i).intValue();
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
        