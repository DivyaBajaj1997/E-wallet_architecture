package E_wallet.services;

import java.util.Set;

import E_wallet.dao.CustomerDaoImp;
import E_wallet.dao.ICustomerDao;
import E_wallet.entities.Customer;
import E_wallet.exception.IdNotFoundException;

public class CustomerServicesImp implements ICustomerServices {
	ICustomerDao c = new CustomerDaoImp();

	public CustomerServicesImp(ICustomerDao customerDaoImp) {
		this.c = customerDaoImp;
	}

	@Override
	public void addCustomer(Customer x) {
		c.addCustomer(x);
	}

	@Override
	public Customer findById(String id) {
		if (id == null || id.length() != 10) {
			throw new IdNotFoundException("incorrect id");
		}
		return c.findById(id);
	}

	@Override
	public Set<Customer> allCustomers() {
		return c.allCustomers();
	}
}
