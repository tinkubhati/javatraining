package daynine.service;

import java.util.List;

import daynine.dto.Customer;
import daynine.exceptions.CustomerNotFoundException;

public interface CustomerService {
		//CRUD- Create,Retrieve, Update and Delete operation
		//Create
		public Customer addCustomer(Customer customer);
		
		//Retrieve
		public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException;
		
		//Retrieve all customers
		public List<Customer> getCustomers();
		
		//Update
		public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
		
		//Delete
		public String deleteCustomer(Customer customer) throws CustomerNotFoundException;
		
		public String deleteCustomerById(Integer customerId);
}
