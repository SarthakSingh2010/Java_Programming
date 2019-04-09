class alternate_word
{
    public static void main(String s,String p)
    {
        System.out.println("1st string "+s);
        System.out.println("2nd Stirng "+p);
        String s1[]=s.split(" ");
        String p1[]=p.split(" ");
        int c=0,d=1;
        String d1[]=new String[s1.length+p1.length];
        if(s1.length>=p1.length)
        {
            for(int k=0;k<s1.length;k++)
            {
                d1[c=c+2]=s1[k];
                if(k<p1.length)
                d1[d=d+2]=p1[k];
            }
        }else
        if(p1.length>s1.length)
        {
            for(int g=0;g<p1.length;g++)
            {
                d1[c=c+2]=p1[g];
                if(g<s1.length)
                  d1[d=d+2]=s1[g];
            }
        }
        for(int r=0;r<d1.length;r++)
            System.out.println(d1[r]+" ");
    }
}
    