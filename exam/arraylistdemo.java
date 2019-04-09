import java.util.*;
class arraylistdemo
{
    public static void main(String args[])
    {
        ArrayList<String> arrlist=new ArrayList<String>();
        arrlist.add("ab");
        arrlist.add("cd");
        arrlist.add("ef");
        arrlist.add("gh");
        arrlist.add("ij");
        System.out.println(arrlist);
        arrlist.add(3,"kl");
        System.out.println(arrlist);
        ArrayList<String> arrlist2=new ArrayList<String>();
        arrlist2.add("mn");
        arrlist2.add("op");
        arrlist2.add("qr");
        arrlist2.add("st");
        arrlist.addAll(arrlist2);
        System.out.println(arrlist);
        arrlist.addAll(2,arrlist2);
        System.out.println(arrlist);
        arrlist.remove("uv");
        System.out.println(arrlist);
        arrlist.subList(2,5).clear();
        System.out.println(arrlist);
        arrlist.set(9,"wx");
        System.out.println(arrlist);
        System.out.println(arrlist.size());
        String arr[]=new String[arrlist.size()];
        /*for(int i=0;i<arr.length;i++)
        arr[i]=arrlist.get(i).intValue();*/
        arr=arrlist.toArray(arr);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
    