class Stack
{
    int top=-1;
    int cap;
    int arr[];
    Stack(int cc)
    {
        cap=cc;
        arr=new int[cap];
    }
    void push(int v)
    {
        if(top==cap-1)
        System.out.println("OVERFLOW");
        else
        arr[++top]=v;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("UNDERFLOW");
            return -999;
        }
        else
        {
            int val=arr[top];
            top--;
            return val;
        }
    }
    void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
        
            