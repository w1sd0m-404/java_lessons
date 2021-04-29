package d3w2;

public class UserManager {
	
	public void userAdd(User user) {
		System.out.println("Yeni kullanýcý eklendi.");
	}
	
	public void userDelete(User user) {
		System.out.println("Kullanýcý silindi.");
	}
	
	public void userAddMultiple(User[] users) {
		for(User user:users) {
			userAdd(user);
			System.out.println("Yeni kullanýcýlar eklendi.");
		}
	}
	
	public void login(User user) {
		System.out.println("Giriþ baþarýlý. Hoþgeldin " + user.getFirstName());
	}
	
	public void logOut(User user) {
		System.out.println("Çýkýþ baþarýlý.");
	}

}
