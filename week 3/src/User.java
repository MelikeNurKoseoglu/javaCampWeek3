
public class User {
	private String firstName;
	private String lastName;
	private String userNumber;
	private int password;
	
	public User() {
		
	}
	public User(String firstName, String lastName, String userNumber, int password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userNumber = userNumber;
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

}
