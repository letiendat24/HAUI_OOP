package chap1;

public class SumOdd {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("tong cac so le tu 1 den 100 la: " + sum);
	}
}
