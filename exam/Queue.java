class Queue
{
    int front=0;
    int rear=0;
    int arr[];
    int cap;
    Queue(int cc)
    {
        cap=cc;
        arr=new int [cap];
    }
    void push(int v)
    {
        if(rear==cap)
        System.out.println("OVERFLOW");
        else
        {
            arr[rear++]=v;
        }
    }
    int pop()
    {
        if(rear==0&&front==0)
        {
            System.out.println("UNDERFLOW");
            return -999;
        }
        else
        {
            int val=arr[front];
            front++;
            if(front==rear)
            {
                front =0;
                rear=0;
            }
            return val;
        }
    }
    void display()
    {
        for(int i=front;i<rear;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
        
    