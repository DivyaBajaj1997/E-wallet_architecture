package E_wallet.ui;

import java.util.Collection;
import java.util.Set;
import E_wallet.dao.*;
import E_wallet.entities.*;
import E_wallet.exception.*;
import E_wallet.services.*;


public class CustomerUI {
	ICustomerServices c = new CustomerServicesImp(new CustomerDaoImp());

	public static void main(String[] args) {
		CustomerUI ui = new CustomerUI();
		ui.run();
	}

	public void run() {
		try {
			Customer e1 = new Customer("9999900000", "Divya");
			Customer e2 = new Customer("9999923445", "kavya");
			c.addCustomer(e1);
			c.addCustomer(e2);
			Customer e3 = c.findById("9999900000");
			System.out.println(e3.getName());
			Set<Customer> set = c.allCustomers();
			print(set);
		} catch (CustomerNotFoundException e) {
			System.out.println("employee not found");
		} catch (IdNotFoundException e) {
			System.out.println("id was incorrect");
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		}

	}

	public void print(Collection<Customer> c) {
		for (Customer e : c) {
			System.out.println(e.getName());
		}
	}
}
