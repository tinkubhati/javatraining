package com.prodapt.kvaluet.assignment.daytwo.tables;



import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Products> products = new ArrayList<Products>();
		ProductData pd = new ProductData(); 
		products = pd.productDatabase();
		
		List<Orders> orders = new ArrayList<Orders>();
		OrderData od = new OrderData();
		orders = od.orderDatabase();
		
		List<Customers> customers = new ArrayList<Customers>();
		CustomerData cd = new CustomerData();
		customers = cd.customerDatabase();
		
		System.out.println("List of Products where Category is 'Books' -\n");
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getCategory().equals("Books") && products.get(i).getPrice()>100)
			{
				System.out.println(products.get(i).getName());
			}
		}
		System.out.println("\nObtain a list of order with products belong to category “Baby”\n");
		for(int i=0;i<products.size();i++)
		{
			for(int j=0;j<orders.size();j++)
			{
				if(products.get(i).getCategory().equals("Baby") && products.get(i).getId()==orders.get(j).getId())
				{
					System.out.println(orders.get(j).getDeliveryDate()+" "+products.get(i).getName()+" "+products.get(i).getCategory());
				}
			}
		}
		System.out.println("\nObtain a list of product with category = “Toys” and then apply 10% discount\n");
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getCategory().equals("Toys"))
			{
				products.get(i).setPrice(products.get(i).getPrice() - (products.get(i).getPrice()*0.1));
				
				System.out.println(products.get(i).getPrice());
			}
		}
		System.out.println("\nGet the cheapest products of “Books” category\n");
		double min = Double.MAX_VALUE;
		String bookmin = "";
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getCategory().equals("Books"))
			{
				if(products.get(i).getPrice()<min)
				{
					min = products.get(i).getPrice();
					bookmin = products.get(i).getName();
				}
			}
		}
		System.out.println("Cheapest Book = "+bookmin+" Price = "+min);
	}

}
