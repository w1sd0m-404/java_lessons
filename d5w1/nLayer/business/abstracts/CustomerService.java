package d5w1.nLayer.business.abstracts;

import java.util.List;

import d5w1.nLayer.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	void update(Customer customer);
	void remove(Customer customer);
	void verifyCustomer(int id);
	Customer getEmailAndPassword(String email,String password);
	Customer get(int id);
	List<Customer> getAll();
}
