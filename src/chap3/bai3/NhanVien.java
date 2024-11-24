package chap3.bai3;

public class NhanVien {
	private String name;
	private DiaChi address;
	private String dob;
	private char gender;
	
	public NhanVien() {
		name = "";
		dob = "";
		gender = 'M';
	}

	public NhanVien(String name, DiaChi address, String dob, char gender) {
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DiaChi getAddress() {
		return address;
	}

	public void setAddress(DiaChi address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "Ten: " + this.name + "\n"
				+ "Ngay sinh: " + this.dob + "\n"
				+ "Dia chi: " + this.address + "\n"
				+ "Gioi tinh: " + this.gender + "\n";
	}
	
}
