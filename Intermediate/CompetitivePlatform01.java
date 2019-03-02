import java.math.*;
import java.io.*;
import java.util.*;
public class CompetitivePlatform01
{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
	static PrintWriter pw= new PrintWriter(System.out);
	
	public static void main(String args[])throws Exception
	{
		pw.println("Hello Competition");
		pw.close();
	}

	
	
	
}
	
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;
 
    public FastScanner(BufferedReader in)
    {
        this.in = in;
    }
    public String nextToken() throws Exception
    {
        while (st == null || !st.hasMoreTokens())
        {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
   	public String next() throws Exception
	{
		return nextToken().toString();
	}
    public int nextInt() throws Exception
    {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws Exception 
    {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws Exception 
    {
        return Double.parseDouble(nextToken());
    }
} 