/**
 * �������������ʣ�x^y=y^x,��������������Ա���������Ȼ����ͬ��ȡ��
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
