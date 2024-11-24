package chap3.bai10;

import java.util.Scanner;

public class Test {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = 5;
	        HocVien arr[] = new HocVien[1];
	        for(int i = 0; i < n; i++){
	            boolean check = false;
	            String hoTen = "", diaChi= "", loaiUuTien = "", loaiChuongTrinh = "";
	            int soBuoi = 0;
	            double donGia = 0.0;
	            while(!check){
	                try{
	                    check = true;
	                    hoTen = sc.nextLine();
	                    diaChi = sc.nextLine();
	                    loaiUuTien= sc.nextLine();
	                    loaiChuongTrinh = sc.nextLine();
	                    soBuoi = sc.nextInt();
	                    donGia = sc.nextDouble();
	                    sc.nextLine();
	                    
	                }catch(Exception e){
	                    System.out.println("Thong tin nhap vao bi loi!");
	                    System.out.println("Nhap lai thong tin");
	                    check = false;
	                }
	            }
	            if(loaiChuongTrinh.equals("Lap Trinh")){
	                arr[i] = new HocVienLT(hoTen, diaChi, loaiUuTien, loaiChuongTrinh, soBuoi, donGia );
	            }else{
	                arr[i] =new HocVienDH(hoTen, diaChi, loaiUuTien, loaiChuongTrinh, soBuoi, donGia );
	            }
	        }
	        // In ra thong tin cua hoc vien lap trinh
	        for(int i = 0; i < n; i++){
	            if(arr[i] instanceof HocVienLT){
	                System.out.println(arr[i]);
	            }
	        }
	    }
}
