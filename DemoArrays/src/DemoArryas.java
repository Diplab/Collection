import java.util.Arrays;


public class DemoArryas {

	public static void main(String[] args) {
		int a[] = {1,10,3,5,80,7};
		Arrays.sort(a);
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, -1));
		System.out.println(Arrays.binarySearch(a, 2));
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, 8));
		System.out.println(Arrays.binarySearch(a, 11));
		System.out.println(Arrays.binarySearch(a, 100));
	}

}
