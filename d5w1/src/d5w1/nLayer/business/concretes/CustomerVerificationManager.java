package d5w1.nLayer.business.concretes;

import java.util.regex.Pattern;

import d5w1.nLayer.business.abstracts.CustomerVerificationService;
import d5w1.nLayer.entities.concretes.Customer;

public class CustomerVerificationManager implements CustomerVerificationService {
	static String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	public static final Pattern pattern = Pattern.compile(regex);

	@Override
	public boolean isVerified(Customer customer) {
		boolean result=true;
		if(customer.getFirstName().length()<=2 || customer.getLastName().length()<=1 || isVerifiedEmail(customer.getEmail())==false || customer.getPassword().length()<=7) {
			result = false;
		}
		
		if(result==false) {
			System.out.println("Girilen bilgiler hatalý ! Lütfen bilgileri gözden geçirip tekrar deneyiniz.");
		}else {
			System.out.println("Doðrulama baþarýlý...");
		}
		return result;
		
	}
	
	private boolean isVerifiedEmail(String email) {
		return Pattern.matches(regex, email);
	}
	

}


