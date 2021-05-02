package d4w2.Adapters;

import java.rmi.RemoteException;

import MernisService.KPSPublicSoap;
import MernisService.KPSPublicSoapProxy;
import d4w2.Abstract.CheckingManager;
import d4w2.Entities.Customer;

public class MernisServiceAdapter implements CheckingManager {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthDate().getYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
