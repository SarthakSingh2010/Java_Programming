import java.util.*;
public class Permutation
{
    static Scanner sc=new Scanner(System.in);
    public char[] arr;
    public int count;
    
    public static void main(String args[])
    {
        System.out.print("Enter The Word : ");
        String word=sc.next();  
        System.out.println();
        Permutation obj=new Permutation(word);
        obj.permute(0); // BEGIN WITH 1ST CHAR
        System.out.println("\nTotal No Of Permutation : "+obj.getCount());
    }
    public Permutation(String word)
    {
        arr=word.toUpperCase().toCharArray();  
        count=0;
    }
    public void permute(int start)
    {
        if(start==arr.length-1) //  TRIVIAL CASE
        {
            System.out.print(arr);
            System.out.print(" ");
            if((getCount()+1)%5==0)
            System.out.println();
            count++;    return;
        }
        for(int i=start;i<arr.length;i++)
        {   
            // SWAPPING i-th AND start-th ELEMENT
            char temp=arr[i];
            arr[i]=arr[start]; 
            arr[start]=temp;    
            permute(start+1);
            // SWAPPING TO ORIGINAL POSITION
            temp=arr[i];    
            arr[i]=arr[start]; 
            arr[start]=temp;
        }
    }
    public int getCount()
    {  
        return count;  
    }
}