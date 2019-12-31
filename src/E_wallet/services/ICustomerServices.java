package E_wallet.services;

import java.util.Set;

import E_wallet.entities.Customer;

public interface ICustomerServices {
	void addCustomer(Customer c);

	Customer findById(String id);

	Set<Customer> allCustomers();
}
