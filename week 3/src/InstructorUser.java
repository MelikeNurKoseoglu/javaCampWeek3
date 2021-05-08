
public class InstructorUser extends User {
	private String task;
	
	public InstructorUser() {
		
	}

	public InstructorUser(String task) {
		super();
		this.setTask(task);
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
