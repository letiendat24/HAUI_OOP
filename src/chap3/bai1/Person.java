package chap3.bai1;

public class Person {
	private String name;
	private String dob;
	private String pob;
	private char gender;
	private String email;
	private String phone;
	
	public Person () {
		name = "";
		dob = "";
		pob = "";
		gender ='M';
		email = "";
		phone = "";
		
	}
	
	public Person(String name, String dob, String pob, char gender, String email, String phone) {
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPob() {
		return pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String toString() {
		return "Ten: " + this.name + "\n"
				+ "Ngay sinh: " + this.dob + "\n"
				+ "Dia chi: " + this.pob + "\n"
				+ "Gioi tinh: " + this.gender + "\n"
				+ "Email: " + this.email + "\n"
				+ "Phone: " + this.phone + "\n";
	}
	
}
