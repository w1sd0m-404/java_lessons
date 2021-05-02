package d4w2.Concrete;

import d4w2.Abstract.BaseCustomerManager;
import d4w2.Abstract.CheckingManager;
import d4w2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CheckingManager checkingManager;

	public StarbucksCustomerManager(CheckingManager checkingManager) {
		super();
		this.checkingManager = checkingManager;
	}

	@Override
	public void save(Customer customer) {
		
		if(checkingManager.checkIfRealPerson(customer)) {
			System.out.println("Veritabanýna kaydedildi. " + customer.getFirstName());
		}else {
			System.out.println("Kimlik bilgileri hatalý.");
		}
		
	}

}
