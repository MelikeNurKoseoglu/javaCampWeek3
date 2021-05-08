
public class StudentUser extends User {
	private String schoolName;
	private int schoolNumber;
	
	public StudentUser() {

	}
	public StudentUser(String schoolName, int schoolNumber) {
		super();
		this.schoolName = schoolName;
		this.schoolNumber = schoolNumber;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getSchoolNumber() {
		return schoolNumber;
	}

	public void setSchoolNumber(int schoolNumber) {
		this.schoolNumber = schoolNumber;
	}

}
