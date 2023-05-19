package classes;
import java.lang.*;
import interfaces.*;

public class Bazaar implements StoreHouseOperations
{
   private StoreHouse storehouses[]= new StoreHouse[10];
  
   
   
    public void insertStoreHouse(StoreHouse s)
	
   {
	   int flag=0;
	   for(int i=0;i<storehouses.length;i++)
	   {
		   if(storehouses[i]==null)
		   {
			   storehouses[i]=s;
			   flag=1;
			   break;
		   }
	   }
	   if(flag==1)
	   {
		   System.out.println("StoreHouse inserted");
	   }
	   else
	   {
		   System.out.println("Can not insert");
	   }
   }
	   
    public void removeStoreHouse(StoreHouse s)
	
	   {
		   
		   int flag=0;
	   for(int i=0;i<storehouses.length;i++)
	   {
		   if(storehouses[i]== s)
		   {
			   storehouses[i]= null;
			   flag=1;
			   break;
		   }
	   }
	   if(flag==1)
	   {
		   System.out.println("StoreHouse Removed");
	   }
	   else
	   {
		   System.out.println("Can not Remove");
	   }
	   }
	   
       
    public void showAllStoreHouses()
	
	{
		for(StoreHouse s: storehouses)
		{
			if(s!=null)
			{
				System.out.println("-----------------------------------");
				System.out.println("StoreHouse Name:  "+s.getName());
				System.out.println("StoreHouse id :  "+s.getSid());
				System.out.println("-----------------------------------");
				s.showAllProducts();
				System.out.println("-----------------------------------");
			}
		}
	}	
	 


    public StoreHouse getStoreHouse(String sid)
    {
		StoreHouse s=null;
		
		for(int i=0;i<storehouses.length;i++)
		{
			if(storehouses[i]!=null)
			{
				if(storehouses[i].getSid()==sid)
				{
				s=storehouses[i];
				break;
				}
			}
		}
		if(s!=null)
		{
			System.out.println("StoreHouse Found");
		}
		else
		{
			System.out.println("StoreHouse Not Found");
		}
		return s;
	}	


    
    
	
}   