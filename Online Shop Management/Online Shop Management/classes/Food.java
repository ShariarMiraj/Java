package classes;
import java.lang.*;

public class Food
{
	private String fname;
	private String fId;
	private String fprice;
	private String fquantity;

	
	public void setFName(String fname)
	{
		this.fname=fname;
	}
	public void setFId(String fId)
	{
		this.fId=fId;
	}

	public void setFPrice(String fprice)
	{
		this.fprice=fprice;
	}
	public void setFQuantity(String fquantity)
	{
		this.fquantity=fquantity;
	}
	
	
	public String getFName()
	{
		return fname;
	}

	public String getFId()
	{
		return fId;
	}
	
	public String getFPrice()
	{
		return fprice;
	}
	public String getFQuantity()
	{
		return fquantity;
	}
	
}