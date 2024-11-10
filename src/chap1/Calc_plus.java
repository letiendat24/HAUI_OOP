package chap1;

import java.util.Scanner;

public class Calc_plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Nhap so thu 1: ");
		int num1 = sc.nextInt();
		System.out.print("Nhap so thu 2: ");
		int num2 = sc.nextInt();
		
		System.out.print("Nhap 1 ki tu: ");
		char option = sc.next().charAt(0);
		
		switch (option) {
			case 'A':
				int sum = num1 + num2;
				System.out.println("tong 2 so la: "+sum);
				break;
			case 'S':
				int diff = num1 - num2;
				System.out.println("hieu 2 so la: "+ diff);
				break;
			case 'M':
				int mul = num1 * num2;
				System.out.println("tich 2 so la: "+ mul);
				break;
			case 'D':
				double quo = num1*1.0 / num2;
				System.out.println("thuong 2 so la: "+ quo);
				break;
			default:
				System.out.println("ki tu vao khong hop le!");
		}
			
				
	}  
}
