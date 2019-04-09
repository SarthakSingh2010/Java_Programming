class TowerOfHanoiMethod2
{
    public static void Towers(int size,char fromstack,char tostack,char sparestack)
    {
      if(size==1)
      System.out.println("move disk from "+fromstack+" to "+tostack);
      else
      {
          Towers(size-1,fromstack,sparestack,tostack);
          Towers(1,fromstack,tostack,sparestack);
          Towers(size-1,sparestack,tostack,fromstack);
      }
      return;
    }
    public static void main(String args[])
    {
        Towers(3,'F','T','S');
    }
}
    