package d3w2;

public class UserManager {
	
	public void userAdd(User user) {
		System.out.println("Yeni kullan�c� eklendi.");
	}
	
	public void userDelete(User user) {
		System.out.println("Kullan�c� silindi.");
	}
	
	public void userAddMultiple(User[] users) {
		for(User user:users) {
			userAdd(user);
			System.out.println("Yeni kullan�c�lar eklendi.");
		}
	}
	
	public void login(User user) {
		System.out.println("Giri� ba�ar�l�. Ho�geldin " + user.getFirstName());
	}
	
	public void logOut(User user) {
		System.out.println("��k�� ba�ar�l�.");
	}

}
