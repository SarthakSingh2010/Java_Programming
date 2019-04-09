class withoutsemicolon
{
    public static void main(String args[])
    {
        if(System.out.printf("%c",(char)59)!=null)
        {
        }
    }
}


/* here i am using printf() instead of println() because println() 
 * return type is “void”. But printf() returns PrintStream object. 
 * when controll comes into if() then it prints the message.*/