package chap3.bai6;

public class PartTimeEmpoyee extends Employee{
	private String hoursPerWeek;
	
	public PartTimeEmpoyee() {
		
	}

	public PartTimeEmpoyee(String name, int age, char gender, String employerName, String dateHired, String hoursPerWeek) {
		super(name, age, gender, employerName, dateHired);
		this.hoursPerWeek = hoursPerWeek;
	}

	public String getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(String hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public String toString() {
		return "PartTimeEmpoyee [hoursPerWeek=" + hoursPerWeek + "]";
	}
	
	
	
	
}
