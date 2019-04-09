class conversion
{
    public static void main(String args[])
    {
        String str="1234";
        int str1;
        int i;
        int sum=0;
        String ch="";
        for(i=0;i<str.length();i++)
        {
            ch=Character.toString(str.charAt(i));
            str1=Integer.parseInt(ch);
            System.out.println(str1);
            sum=sum+str1;
        }
        System.out.println(sum);
    }
}