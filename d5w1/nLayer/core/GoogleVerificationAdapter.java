package d5w1.nLayer.core;

import d5w1.nLayer.googleVerification.GoogleVerificationManager;

public class GoogleVerificationAdapter implements VerificationService {

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		GoogleVerificationManager googleManager = new GoogleVerificationManager();
		googleManager.register(email, password);	
	}

	@Override
	public void login(String email, String password) {
		GoogleVerificationManager googleManager = new GoogleVerificationManager();
		googleManager.login(email, password);
	}

}
