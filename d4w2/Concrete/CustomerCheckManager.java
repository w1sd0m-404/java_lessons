package d4w2.Concrete;

import d4w2.Abstract.CheckingManager;
import d4w2.Entities.Customer;

public class CustomerCheckManager implements CheckingManager {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
