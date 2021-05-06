package d5w1.nLayer.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import d5w1.nLayer.dataAccess.abstracts.CustomerDao;
import d5w1.nLayer.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {
	
	List<Customer> customers = new ArrayList<Customer>();

	@Override
	public void add(Customer customer) {
		customers.add(customer);
		System.out.println("Hibernate ile eklendi: "+customer.getFirstName());
		
	}

	@Override
	public void uptade(Customer customer) {
		Customer customerToUpdate = get(customer.getId());
		customerToUpdate.setFirstName(customer.getFirstName());
		customerToUpdate.setLastName(customer.getLastName());
		System.out.println("Hibernate ile güncellendi: "+customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		customers.removeIf(obj->obj.getId()==customer.getId());
		System.out.println("Hibernate ile silindi: "+customer.getFirstName());
		
	}


	@Override
	public Customer getEmailAndPassword(String email, String password) {
		for(Customer customer:customers) {
			if(customer.getEmail()==email && customer.getPassword()==password) {
				return customer;
			}
		}return null;
	}

	@Override
	public List<Customer> getAll() {
		return customers;
	}

	@Override
	public Customer get(int id) {
		for(Customer customer:customers) {
			if(customer.getId()==id) {
				return customer;
			}
		}
		return null;
	}

}
