public class Array {
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		int arr1[]=new int[10]; //empty array
		for (int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}