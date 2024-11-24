package chap3.bai4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		BenhNhan[] bn = new BenhNhan[n];
		System.out.println("nhap tt");
		for (int i = 0; i < n; i++) {
			String ten = sc.nextLine();sc.nextLine();
			int tuoi = sc.nextInt();sc.nextLine();
			char gioiTinh = sc.next().charAt(0);
			String tienSu = sc.nextLine();
			String chuanDoan = sc.nextLine();
			
			String tenBv = sc.nextLine();
			String diaChi = sc.nextLine();
			String giamDoc = sc.nextLine();
			BenhVien bv = new BenhVien(tenBv, diaChi, giamDoc);
			
			bn[i] = new BenhNhan(ten,tuoi, gioiTinh, tienSu, chuanDoan, bv); 
			
			sc.nextLine();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(bn[i]);
		}
	}

}
