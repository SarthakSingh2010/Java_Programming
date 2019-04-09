class TowerOfHanoimethod1
 {
     public static void main(String args[])
     {
         char start='F',inter='S',dest='T';
         int size=3;
         move(size,start,inter,dest);
     }
     public static void move(int size,char start,char inter,char dest)
    {
       if(size!=0)
     {
        move(size-1,start,dest,inter);
        System.out.println("Move Disk "+size+" from "+start+" to "+dest);
        move(size-1,inter,start,dest);
     
     }
    return;
     }
 }