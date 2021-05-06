package d5w1.nLayer.business.abstracts;

import d5w1.nLayer.entities.concretes.Customer;

public interface CustomerVerificationService {
	boolean isVerified(Customer customer);
}
