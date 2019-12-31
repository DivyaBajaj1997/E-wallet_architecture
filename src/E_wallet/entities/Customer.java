package E_wallet.entities;

import E_wallet.*;

public class Customer {
	// fields
	private String id;
	private String name;
	private double balance;

	// getter setter
	public String getPh_no() {
		return id;
	}

	public void setPh_no(String ph_no) {
		this.id = ph_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	// constructors
	public Customer() {
	}

	public Customer(String ph_no, String name) {
		this.id = ph_no;
		this.name = name;
	}

	// methods
	public void addBalance(double balance) {
		this.balance += balance;
	}

	@Override
	public String toString() {
		return "[ph_no= " + id + ", name= " + name + ", balance= " + balance + "]";
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || !(obj instanceof Customer)) {
			return false;
		}
		Customer obj1 = (Customer) obj;
		return this.id.equals(obj1.id);
	}

}
