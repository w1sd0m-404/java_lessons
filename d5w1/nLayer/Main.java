package d5w1.nLayer;


import d5w1.nLayer.business.abstracts.CustomerService;
import d5w1.nLayer.business.abstracts.CustomerVerificationService;
import d5w1.nLayer.business.concretes.BaseVerificationManager;
import d5w1.nLayer.business.concretes.CustomerManager;
import d5w1.nLayer.business.concretes.CustomerVerificationManager;
import d5w1.nLayer.core.EmailManager;
import d5w1.nLayer.core.EmailService;
import d5w1.nLayer.core.GoogleVerificationAdapter;
import d5w1.nLayer.core.VerificationService;
import d5w1.nLayer.dataAccess.concretes.HibernateCustomerDao;
import d5w1.nLayer.googleVerification.GoogleVerificationManager;


public class Main {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao());
		CustomerVerificationService customerVerificationService = new CustomerVerificationManager();
		EmailService emailService = new EmailManager();
		VerificationService verificationService = new BaseVerificationManager(customerService, customerVerificationService, emailService);
		
		
		//register
		verificationService.register(1, "Mahmut", "Özel", "mahmut@gmail.com", "1234567890");
		verificationService.register(2, "Mahmut", "Ö", "mahmut@gmail.com", "1234567890");
		verificationService.register(3, "Mahmut", "", "@gmail.com", "1234567890");
		verificationService.register(5, "mahmut", "ozel", "ozel29@gmail.com", "1234567890");
		

		//login
		customerService.verifyCustomer(1);
		verificationService.login("mahmut@gmail.com", null);
	
		
		//with google
		VerificationService gooVerificationService = new GoogleVerificationAdapter();
		gooVerificationService.register(8, "Mahmut", "Ozel", "ozelmahmut@gmail.com", "1234567890");
		gooVerificationService.login("ozelmahmut@gmail.com", "1234567890");
		
		
	
	}
}
