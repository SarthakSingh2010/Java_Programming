class armstrong
         {
         int  n;
         armstrong ( )
         {
         n=0;
         }
         void input (int x)
         {
         n=x;
         }   
         void display( )
        {
         int s,f=0,k=n;
         do
        {
        s=n%10;
        f=f+(s*s*s);
        n=n/10; 
       }
       while(n>0);
       if(k==f)
       System.out.println("armstrong");
       else
       System.out.println("NOT ARMSTRONG NUMBER");
       } } 
