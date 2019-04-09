import java.util.Arrays;
public class MyArrayCopy 
{
    public static void main(String args[])
    {
        int[] myArr = {2,4,2,4,5,6,3};
        print(myArr);
        System.out.println("Array size before copy: "+myArr.length);
        int[] newArr = Arrays.copyOf(myArr, 10);
        print(newArr);
        System.out.println("New array size after copying: "+newArr.length);
    }
    static void  print(int arr[])
    {
        for(int p=0;p<arr.length;p++)
        System.out.print(arr[p]+" ");
        System.out.println();
    }
}
