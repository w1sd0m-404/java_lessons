package d5w1.nLayer.core;

public class EmailManager implements EmailService {

	@Override
	public void sender(String message, String email) {
		System.out.println(email + " mail adresine "+message+ " gönderildi.");
	}
	
}
