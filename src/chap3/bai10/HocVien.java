package chap3.bai10;

public abstract class HocVien {
	protected String hoTen;
	protected String diaChi;
	protected String loaiUuTien;
	protected String loaiChuongTrinh;
	
	public HocVien() {
		
	}

	public HocVien(String hoTen, String diaChi,String loaiUuTien, String loaiChuongTrinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiUuTien = loaiUuTien;
		this.loaiChuongTrinh = loaiChuongTrinh;
	}

	public String getLoaiUuTien() {
		return loaiUuTien;
	}

	public void setLoaiUuTien(String loaiUuTien) {
		this.loaiUuTien = loaiUuTien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiChuongTrinh() {
		return loaiChuongTrinh;
	}

	public void setLoaiChuongTrinh(String loaiChuongTrinh) {
		this.loaiChuongTrinh = loaiChuongTrinh;
	}
	
	public abstract double getUuTien();
	public abstract double hocPhi();

	@Override
	public String toString() {
		return "HocVien [hoTen=" + hoTen + ", diaChi=" + diaChi + ", loaiUuTien=" + loaiUuTien + ", loaiChuongTrinh="
				+ loaiChuongTrinh + "]";
	}
	
	
	
}
