package classes;
import java.lang.*;
import interfaces.*;

public class Shop implements CustomerOperations
{
  
    Customer customers[]=new Customer[100];


    
    public void addCustomer(Customer c)
	{
		int flag = 0;
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == null)
			{
				customers[i] = c;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Customer Added");
		}
		else
		{
			System.out.println("Can Not Add");
		}
	}
	

	public void showAllCustomers()
	{
		System.out.println("*/////////////////////////////////*");
		for(Customer c : customers)
		{
			if(c != null)
			{
				System.out.println("Customer First Name: "+ c.getCFName());
				System.out.println("Customer Last Name: "+ c.getCLName());
				System.out.println("Customer ID: "+ c.getCId());
				
				System.out.println();
			}
		}
		System.out.println("*//////////////////////////////////*");
	}
	public Customer getCustomer(String cId)
	{
		Customer c = null;
		
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				if(customers[i].getCId().equals(cId))
				{
					c = customers[i];
					break;
				}
			}
		}
		if(c != null)
		{
			System.out.println("Customer Found");
		}
		else
		{
			System.out.println("Customer Not Found");
		}
		return c;
	}
	
}   
	   