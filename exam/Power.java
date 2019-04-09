class Power
{
    //o(lg b) complexcity
    public static void main(String args[])
    {
        System.out.println(pow(2,3));
    }
    public static double pow(double a,double b)
    {
        if(b==1)
        return a;
        if(b%2==0)
        return pow(a*a,b/2);
        else
        return a*pow(a,b-1);
    }
}