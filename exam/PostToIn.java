import java.io.*;
import java.util.*;
class PostToIn
{
    String stk[];
    int top;
    public PostToIn(int m)
    {
        top=-1;
        stk=new String[m];
    }
    public void push(String i)
    {
        if(top+1<stk.length);
        stk[++top]=i;
    }
    public String pop()
    {
        return stk[top--];
    }
    public void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE EXPRESSION:");
        String s=br.readLine();
        int i;
        StringTokenizer st=new StringTokenizer(s);
        PostToIn o=new PostToIn(st.countTokens());
        int m=st.countTokens();
        for(i=0;i<m;i++)
        {
            String s1=st.nextToken();
            System.out.println(s1);
            char a=(s1).charAt(0);
            
            if(a=='-' || a=='+' || a=='/' ||  a=='*' || a=='^')
            {
                double o1=Double.parseDouble(o.pop());
                double o2=Double.parseDouble(o.pop());
                if(a=='-')
                o.push(Double.toString(o2-o1));
                if(a=='+')
                o.push(Double.toString(o2+o1));
                if(a=='/')
                o.push(Double.toString(o2/o1));
                if(a=='*')
                o.push(Double.toString(o2*o1));
                if(a=='^')
                o.push(Double.toString(Math.pow(o2,o1)));
            }
            else o.push (s1);
        }
        System.out.println(o.stk[0]);
    }
}
            
            
