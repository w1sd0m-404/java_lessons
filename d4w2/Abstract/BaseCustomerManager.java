package d4w2.Abstract;

import d4w2.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerInterface{

	public void save(Customer customer) {
		System.out.println("Veritabanýna kaydedildi. " + customer.getFirstName());
		
	}
}
