package chap3.bai10;

public class HocVienDH extends HocVien{
	protected int soBuoi;
	protected double donGia;
	public HocVienDH() {
		super();
		
	}
	public HocVienDH(String hoTen, String diaChi, String loaiUuTien, String loaiChuongTrinh, int soBuoi, double donGia) {
		super(hoTen, diaChi, loaiUuTien, loaiChuongTrinh);
		this.soBuoi = soBuoi;
		this.donGia = donGia;
	}
	public int getSoBuoi() {
		return soBuoi;
	}
	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getUuTien() {
		if (loaiUuTien == "1") {
			return 1000000;
		} else if (loaiUuTien == "2") {
			return 800000;
		}
	}
	
	@Override
	public double hocPhi() {
		return soBuoi*donGia - getUuTien();
	}
	@Override
	public String toString() {
		return "HocVienDH [soBuoi=" + soBuoi + ", donGia=" + donGia + ", hoTen=" + hoTen + ", diaChi=" + diaChi
				+ ", loaiUuTien=" + loaiUuTien + ", loaiChuongTrinh=" + loaiChuongTrinh + "]";
	}
	
	
	
	
}
