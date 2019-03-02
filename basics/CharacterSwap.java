public class CharacterSwap {

	public static void main(String[] args) 
	{
		String s="QWERTYUIOP";
		System.out.println("before swap ::\n"+s);
		String p=swap(s,2,5);
		System.out.println("after swapping\nindex 2 with 5 ::\n"+p);
	}
	private static String swap(String a, int i, int j) 
	{
		char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
	}
}
