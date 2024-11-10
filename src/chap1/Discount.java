package chap1;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap gia ban: ");
		double giaBan = sc.nextDouble();
		
		System.out.println("nhap phan tram giam gia: ");
		int giamGia = sc.nextInt();
		
		double result = giaBan - giaBan*giamGia/100;
		
		System.out.println(result);
	}
}
