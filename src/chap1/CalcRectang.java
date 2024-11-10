package chap1;

import java.util.Scanner;

public class CalcRectang {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chieu dai");
		int chieuDai = sc.nextInt();
		System.out.println("nhap chieu rong");
		int chieuRong = sc.nextInt();
		
		int area = chieuDai * chieuRong;
		int peri = (chieuDai + chieuRong)*2;
		
		System.out.println("chu vi la: " + peri);
		System.out.println("dien tich la: " + area);
	}
}
