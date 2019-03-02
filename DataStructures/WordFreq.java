import java.util.*;
class WordFreq
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Set<Integer> ss=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        ss.add(arr[i]);
        int newarr[]=new int[ss.size()];
        int p=0;
        for(int s:ss)
        newarr[p++]=s;
        for(int i=0;i<newarr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            if(newarr[i]==arr[j])
            count++;
            System.out.println(newarr[i]+"\t"+count);
        }
    }
}