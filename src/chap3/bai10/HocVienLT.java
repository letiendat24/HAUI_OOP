package chap3.bai10;

public class HocVienLT extends HocVien{
	    protected double soBuoi;
	    protected double donGia;
	    
	    public HocVienLT() {
	        
	    }

	    public HocVienLT(String hoTen, String diaChi, String loaiUuTien, String loaiChuongTrinh, double soBuoi, double donGia) {
			super(hoTen, diaChi, loaiUuTien, loaiChuongTrinh);
			this.soBuoi = soBuoi;
			this.donGia = donGia;
		}

	    public double getUuTien(){
	        if(loaiUuTien == "1"){
	            return 1000000;
	        }else if (loaiUuTien == "2"){
	            return 500000;
	        }

	    }
	    @Override
	    public double hocPhi() {
	        return this.soBuoi * donGia - getUuTien();
	    }

	    @Override
	    public String toString() {
	        return  super.toString()+ "HocVienLT [soBuoi=" + soBuoi + ", donGia=" + donGia + "Tien hoc phi: " + hocPhi() + "]";
	    }

		
}
