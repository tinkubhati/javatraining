package daynine.ui;
import daynine.dto.Customer;
import daynine.exceptions.CustomerNotFoundException;
import daynine.service.CustomerService;
import daynine.service.CustomerServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		Customer cust = new Customer(1, "Tinku", "Greater Noida");
		Customer cust1 = new Customer(2, "Roop", "Greater Noida");
		Customer cust2 = new Customer(3, "Ravi", "Darbhanga");

		CustomerService customerService = new CustomerServiceImpl();
		customerService.addCustomer(cust);
		customerService.addCustomer(cust1);
		customerService.addCustomer(cust2);
		System.out.println(customerService.getCustomers());
		try {
			System.out.println(customerService.getCustomerById(2));
		} catch (CustomerNotFoundException e) {

			System.out.println("No customer with given id is found");
		}
		
		cust2.setCity("Noida");
		try {
			customerService.updateCustomer(cust2);
		}catch(CustomerNotFoundException e) {
			System.out.println("No Customer with given ID found");
		}
		System.out.println(customerService.getCustomers());

		System.out.println("");
		
		
		try {
		customerService.deleteCustomer(cust2);
		}catch(CustomerNotFoundException e) {
			System.out.println(" Deleted Successfully");
		}
		System.out.println(customerService.getCustomers());
		System.out.println(" Deleted Successfully");
		
		
		
		
		
	}

}
