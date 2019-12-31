package E_wallet.dao;

import java.util.Set;
import E_wallet.entities.Customer;

public interface ICustomerDao {
	void addCustomer(Customer c);

	Customer findById(String id);

	Set<Customer> allCustomers();
}
