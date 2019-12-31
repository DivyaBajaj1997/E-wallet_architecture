package E_wallet.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import E_wallet.entities.Customer;
import E_wallet.exception.CustomerNotFoundException;

public class CustomerDaoImp implements ICustomerDao {
	private Map<String, Customer> map = new HashMap<>();

	@Override
	public void addCustomer(Customer c) {
		map.put(c.getPh_no(), c);
	}

	@Override
	public Customer findById(String id) {
		Customer c = map.get(id);
		if (c == null) {
			throw new CustomerNotFoundException("Customer Not Found");
		}
		return c;
	}

	@Override
	public Set<Customer> allCustomers() {
		Collection<Customer> c = map.values();
		Set<Customer> set = new HashSet<>(c);
		return set;

	}

}
