package classes;

import java.lang.*;
import interfaces.*;

public abstract class Product implements IQuantity
{
	private String pid;
	private String name;
	private int availableQuantity;
	private double price;
	
	public void setPid(String pid)
	{
		this.pid=pid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAvailableQuantity(int quantity)
	{
		this.availableQuantity=quantity;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public String getPid()
	{
		return pid;
	}
	public String getName()
	{
		return name;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public double getPrice()
	{
		return price;
	}
	public abstract void showInfo();
	
	public void addQuantity(int amount)
	{
		if(amount>0)
		{
			System.out.println("Previous Quantity: " +availableQuantity);
			System.out.println("Adding Quantity : "+amount);
			availableQuantity=amount +availableQuantity;
			System.out.println("Current Quantity: "+availableQuantity); 
			
		}
		
		else
		{
			System.out.println("Can not add");
		}
			
		
	}
	public void sellQuantity(int amount)
	{
		if(amount>0 && amount<=availableQuantity)
		{
			System.out.println("Previous Quantity: "+availableQuantity);
			System.out.println("Selling Quantity :"+amount);
		    
			availableQuantity=availableQuantity-amount;
			System.out.println("Current Quantity: "+availableQuantity);
		}
		else 
		{
			System.out.println("Can not sell");
		}
	}
	
}