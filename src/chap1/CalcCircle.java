package chap1;
import java.math.*;
import java.util.Scanner;

public class CalcCircle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ban kinh:");
		int bk = sc.nextInt();
		
		double dienTich = Math.PI * Math.pow(bk, 2);
		double chuVi = 2 * Math.PI * bk;
		
		System.out.println("dien tich la: "+dienTich);
		System.out.println("chu vi la: "+chuVi);
		
	}
}
