import java.util.*;
class analyse
{
    public static void main(int y)
    {
        Stack st=new Stack();
        st.push("1");
        st.push("2");
        st.push("3");
        System.out.println(st);
        System.out.println("is stack empty "+st.empty());
        System.out.println("top object is "+st.peek());
        System.out.println("removed this "+st.pop());
        System.out.println("array after removal "+st);
        GregorianCalendar cal=new GregorianCalendar();
        for(int k=1;k<=10;k++)
        {
        int r=(int)(Math.random()*(100-10))+10;
        System.out.println(r);
        }
        if(cal.isLeapYear(y))
        System.out.println("yes leap year");
        else
        System.out.println("no not a leap year");
    }
}