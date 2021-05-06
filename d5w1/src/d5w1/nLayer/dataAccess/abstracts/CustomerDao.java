package d5w1.nLayer.dataAccess.abstracts;

import java.util.List;

import d5w1.nLayer.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void uptade(Customer customer);
	void delete(Customer customer);
	List<Customer> getAll();
	Customer getEmailAndPassword(String email, String password);
	Customer get(int id);
}
