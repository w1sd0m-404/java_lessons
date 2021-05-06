package d5w1.nLayer.business.concretes;

import java.util.List;

import d5w1.nLayer.business.abstracts.CustomerService;
import d5w1.nLayer.dataAccess.abstracts.CustomerDao;
import d5w1.nLayer.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	private CustomerDao customerDao;

	public CustomerManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
		
	}
	
	public CustomerManager() {}

	@Override
	public void add(Customer customer) {
		customerDao.add(customer);
		
	}

	@Override
	public List<Customer> getAll() {
		return customerDao.getAll();
	}

	@Override
	public Customer getEmailAndPassword(String email, String password) {
		return customerDao.getEmailAndPassword(email, password);
	}

	@Override
	public void verifyCustomer(int id) {
		Customer customer = customerDao.get(id);
		customer.setVerified(true);
		System.out.println("Kullanýcý aktif hale getirildi.");
		
		
	}

	@Override
	public Customer get(int id) {
		return customerDao.get(id);
	}

	@Override
	public void update(Customer customer) {
		customerDao.uptade(customer);
		
	}

	@Override
	public void remove(Customer customer) {
		customerDao.delete(customer);
		
	}

}
