package d5w1.nLayer.business.concretes;

import d5w1.nLayer.business.abstracts.CustomerService;
import d5w1.nLayer.business.abstracts.CustomerVerificationService;
import d5w1.nLayer.core.EmailService;
import d5w1.nLayer.core.VerificationService;
import d5w1.nLayer.entities.concretes.Customer;

public class BaseVerificationManager implements VerificationService{
	CustomerService customerService;
	CustomerVerificationService customerVerificationService;
	EmailService emailService;

	public BaseVerificationManager(CustomerService customerService,
			CustomerVerificationService customerVerificationService, EmailService emailService) {
		super();
		this.customerService = customerService;
		this.customerVerificationService = customerVerificationService;
		this.emailService = emailService;
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		Customer customerToRegister = new Customer(id, firstName, lastName, email, password, false);
		if(customerVerificationService.isVerified(customerToRegister)==false) {
			System.out.println("Kay�t i�lemi ba�ar�s�z ! L�tfen t�m alanlar� do�ru girip tekrar deneyiniz.");
			return;
		}else {
			System.out.println("Kay�t i�lemi ba�ar�l�. L�tfen e-postan�za gelen do�rulama adresine gidip �yelik i�leminizi tamamlay�n�z.");
			emailService.sender("Do�rulamak i�in TIKLAYIN ", customerToRegister.getEmail());
			customerService.add(customerToRegister);
		}
		
	}

	@Override
	public void login(String email, String password) {
		Customer customerToLogin = customerService.getEmailAndPassword(email, password);
		if(email==null || password==null) {
			System.out.println("Giri� ba�ar�s�z.L�tfen t�m alanlar� doldurunuz.");
			return;
		}
		if(customerToLogin == null) {
			System.out.println("Giri� bilgileriniz hatal�. L�tfen bilgilerinizi g�zden ge�irip tekrar deneyiniz.");
			return;
		}else {
			System.out.println("Giri� ba�ar�l� ! Merhaba "+customerToLogin.getFirstName() +" "+customerToLogin.getLastName());
			
		}
		
	}

}
