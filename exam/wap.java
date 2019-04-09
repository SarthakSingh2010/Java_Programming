/**
 * to check eqality for floating point numbers
 */
class wap
{
    public static void main(String args[])
    {
        double a=Math.sqrt(2);
        if(Math.abs((a*a)-2.0)<(1e-15))
        System.out.println("yes");
        else
        System.out.println("no");
    }
}