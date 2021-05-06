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
			System.out.println("Kayýt iþlemi baþarýsýz ! Lütfen tüm alanlarý doðru girip tekrar deneyiniz.");
			return;
		}else {
			System.out.println("Kayýt iþlemi baþarýlý. Lütfen e-postanýza gelen doðrulama adresine gidip üyelik iþleminizi tamamlayýnýz.");
			emailService.sender("Doðrulamak için TIKLAYIN ", customerToRegister.getEmail());
			customerService.add(customerToRegister);
		}
		
	}

	@Override
	public void login(String email, String password) {
		Customer customerToLogin = customerService.getEmailAndPassword(email, password);
		if(email==null || password==null) {
			System.out.println("Giriþ baþarýsýz.Lütfen tüm alanlarý doldurunuz.");
			return;
		}
		if(customerToLogin == null) {
			System.out.println("Giriþ bilgileriniz hatalý. Lütfen bilgilerinizi gözden geçirip tekrar deneyiniz.");
			return;
		}else {
			System.out.println("Giriþ baþarýlý ! Merhaba "+customerToLogin.getFirstName() +" "+customerToLogin.getLastName());
			
		}
		
	}

}
