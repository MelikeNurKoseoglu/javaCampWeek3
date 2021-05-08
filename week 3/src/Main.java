
public class Main {

	public static void main(String[] args) {
		
		UserManager userManager =new UserManager();
		
		StudentUser melike= new StudentUser();
		melike.setSchoolNumber(11111);
		melike.setFirstName("melike");
		melike.setLastName("köseoðlu");
		melike.setSchoolName("Samsun Üniversitesi");
		
		InstructorUser engin = new InstructorUser();
		engin.setTask("22222");
		engin.setFirstName("engin");
		engin.setLastName("demiroð");
		
		StudentUser xxx= new StudentUser();
		xxx.setSchoolNumber(333333);
		xxx.setFirstName("xxx");
		xxx.setLastName("yyy");
		xxx.setSchoolName("aaa");
		
		System.out.println(melike.getSchoolNumber());
		System.out.println(melike.getFirstName());
		System.out.println(melike.getLastName());
		System.out.println(melike.getSchoolName());
		
		
		System.out.println("          ");
		System.out.println("**********");
		System.out.println("          ");
		
		
		System.out.println(engin.getTask());
		System.out.println(engin.getFirstName());
		System.out.println(engin.getLastName());
		
		
		System.out.println("          ");
		System.out.println("**********");
		System.out.println("          ");
		
		
		System.out.println(xxx.getSchoolNumber());
		System.out.println(xxx.getFirstName());
		System.out.println(xxx.getLastName());
		System.out.println(xxx.getSchoolName());
		
		
		System.out.println("          ");
		System.out.println("**********");
		System.out.println("          ");
		
		
		User[] users = {melike,engin,xxx};
		userManager.addMultiple(users);
		
		

	}

}
