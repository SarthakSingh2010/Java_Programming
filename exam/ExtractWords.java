class ExtractWords
{
    public static void main(String s)
    {
        s=s.trim();
        s=s+" ";
        int c=0,d=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            c++;
        }
        String as[]=new String[c];
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                s1=s1+s.charAt(i);
            }
            else
            {
               as[d++]=s1;
               s1="";
            }
        }
        for(int p=0;p<c;p++)
        {
            System.out.println(as[p]);
        }
    }
}
            