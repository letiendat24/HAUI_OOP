package chap3.bai3;

public class Test {
	public static void main(String[] args) {
		DiaChi Address = new DiaChi("Trieu Khuc", "Doi Binh", "Ung Hoa", "Ha Noi");
		NhanVien nv = new NhanVien("Nguyen Van A", Address, "Doi Binh", 'M');
		System.out.println(nv);
	}
}
