/**
 * 运用了异或的性质，x^y=y^x,所以乱序的异或可以变成两两异或，然后相同的取消
 * */
public class Demo {
	public static void main(String args[]) {
		int[] a = { 2, 3, 1, 2, 1, 3, 3, 54, 3, 54, 9 };
		int x = a[0];
		for (int i = 1; i < a.length; i++) {
			x ^= a[i];
		}
		System.out.println("single number is: " + x);
	}
}
