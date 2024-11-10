package chap1;

import java.util.Scanner;

public class MoneyElec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so dien: ");
		int dien = sc.nextInt();
		double tien = 0;
		if (dien>0 && dien <= 50) {
			tien = dien*1418;
		} else if (dien >= 51 && dien <= 100) {
			tien = 50*1418 + (dien-50) * 1533;
		} else if (dien >= 101 && dien <= 200) {
			tien = 50 * 1418 + 50*1533 + (dien-100) *1786;
		} else if (dien >= 201) {
			tien = 50 * 1418 + 50*1533 + 100* 1786 + (dien - 50 - 50 -100)*2242;
		}
		System.out.println("tien dien la: " + tien);
	}
}
