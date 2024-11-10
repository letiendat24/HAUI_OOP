package chap1;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nhap so nguyen thu nhat: ");
		int num1 = sc.nextInt();
		
		System.out.println("nhap so nguyen thu hai: ");
		int num2 = sc.nextInt();
//tong
		int sum = num1 + num2;
//hieu
		int diff = num1 - num2;
//tich
		int pro = num1 * num2;
// thuong
		double quo = num1*1.0 / num2;
		
		
		System.out.println("Tong 2 so la: " + sum);
		System.out.println("Hieu 2 so la: " + diff);
		System.out.println("Tich 2 so la: " + pro);
		System.out.println("Thuong 2 so la: " + quo);
		
	}
}
