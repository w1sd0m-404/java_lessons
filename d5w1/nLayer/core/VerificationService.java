package d5w1.nLayer.core;


public interface VerificationService {
	void register(int id,String firstName,String lastName,String email,String password);
	void login(String email,String password);
}
