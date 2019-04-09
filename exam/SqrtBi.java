// finding sqrt by bisection search formula
class SqrtBi
{
    public static void main(double x)
    {
        double low=0;
        double high=Math.max(x,1.0);        
        double guess=(high+low)/2.0;
        int c=0;
        while((Math.abs((guess*guess)-x)>0.0001)&&c<=100)
        {
            if((guess*guess)<x)
            low=guess;
            else
            high=guess;
            guess=(high+low)/2.0;
            c++;
        }
        System.out.println(guess);
    }
}
        