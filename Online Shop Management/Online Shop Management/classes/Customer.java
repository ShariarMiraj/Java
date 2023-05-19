package classes;
import java.lang.*;

public class Customer
{
	private String cfname;
	private String clname;
	private String cId;
	private String cmobile;
	private String caddress;
	private String cemail;
	
	public void setCFName(String cfname)
	{
		this.cfname=cfname;
	}
	public void setCLName(String clname)
	{
		this.clname=clname;
	}
	public void setCId(String cId)
	{
		this.cId=cId;
	}

	public void setCMobile(String cmobile)
	{
		this.cmobile=cmobile;
	}
	public void setCAddress(String caddress)
	{
		this.caddress=caddress;
	}
	public void setCEmail(String cemail)
	{
		this.cemail=cemail;
	}
	
	
	
	public String getCFName()
	{
		return cfname;
	}
	public String getCLName()
	{
		return clname;
	}
	public String getCId()
	{
		return cId;
	}
	
	public String getCMobile()
	{
		return cmobile;
	}
	public String getCAddress()
	{
		return caddress;
	}
		public String getCEmail()
	{
		return cemail;
	}
	
}