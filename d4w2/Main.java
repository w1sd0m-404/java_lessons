package d4w2;

import java.sql.Date;

import d4w2.Abstract.BaseCustomerManager;
import d4w2.Adapters.MernisServiceAdapter;
import d4w2.Concrete.CustomerCheckManager;
import d4w2.Concrete.NeroCustomerManager;
import d4w2.Concrete.StarbucksCustomerManager;
import d4w2.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(29, "mahmut", "özel", new Date(2000, 1, 29), 11111111111l));
		customerManager2.save(new Customer(29, "mahmut", "özel", new Date(2000, 1, 29), 11111111111l));

	}

}
