
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + "   giri� yap�ld�");
	}
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
	}

}
