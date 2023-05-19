package classes;
import java.lang.*;
import interfaces.*;

public class StoreHouse implements ProductOperations
{
	
	private String name;
	private String sid;
	private Product products[]=new Product[100];
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSid(String sid)
	{
		this.sid=sid;
	}
	public String getName()
	{
		return name;
	}
	public String getSid()
	{
		return sid;
	}
	
	public void insertProduct(Product p)
	{
		int flag=0;
		for(int i=0;i<products.length;i++)
		{
			if(products[i]==null)
			{
				products[i]=p;
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Product Insert");
		}
		else
		{
			System.out.println("Can not Insert");
		}	
		
	}
	
	public void removeProduct(Product p)
	{
		int flag=0;
		for(int i=0;i<products.length;i++)
		{
			if(products[i]==p)
			{
				products[i]=null;
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Product Remove");
		}
		else
		{
			System.out.println("Can not Remove");
		}	
	}
		
		public Product getProduct(String pid)
		{
			Product p=null;
			
			for (int i=0;i<products.length;i++)
			{
				if(products[i].getPid()==pid)
				{
					p=products[i];
					break;
				}
			}
			if(p!=null)
			{
				System.out.println("Product Found");
		    }
			else
			{
				System.out.println("Product Not Found");
			}
			return p;
			
		}
	public void showAllProducts()
	    {
		for(Product p : products)
		{
			if( p!= null)
			{
				p.showInfo();
			}
		}

		
		
	}
	

}