package classes;
import java.lang.*;

public class ImportedProduct extends Product
{
	private String countryName;
	
	public void setCountryName(String countryName)
	{
		this.countryName=countryName;
	}
	public String getCountryName()
	{
		return countryName;
	}
	
	public void showInfo()
	{
		System.out.println("Product id:"+getPid());
		System.out.println("Product Name:"+getName());
		System.out.println("Product AvailableQuantity:"+getAvailableQuantity());
		System.out.println("Product Price"+getPrice());
		System.out.println("ImportedProduct country name:"+getCountryName());
		System.out.println();		
	}
}