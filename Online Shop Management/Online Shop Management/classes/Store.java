package classes;
import java.lang.*;
import interfaces.*;

public class Store implements FoodOperations
{
   private Food foods[]=new Food[200];


    
    public void addFood(Food f)
	{
		int flag = 0;
		for(int i=0; i<foods.length; i++)
		{
			if(foods[i] == null)
			{
				foods[i] = f;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Food Added");
		}
		else
		{
			System.out.println("Can Not Add");
		}
	}
	
	
	public void removeFood(Food f)
	{
		int flag = 0;
		for(int i=0; i<foods.length; i++)
		{
			if(foods[i] == f)
			{
				foods[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Food Removed");
	    }
		else
		{
			System.out.println("Can Not Remove");
		}
	}
	public void showAllFoods()
	{
		System.out.println("*/////////////////////////////////*");
		for(Food f : foods)
		{
			if(f != null)
			{
				System.out.println("Food Name: "+ f.getFName());

				System.out.println("Food ID: "+ f.getFId());

				System.out.println();
			}
		}
		System.out.println("*//////////////////////////////////*");
	}
	public Food getFood(String fId)
	{
		Food f = null;
		
		for(int i=0; i<foods.length; i++)
		{
			if(foods[i] != null)
			{
				if(foods[i].getFId().equals(fId))
				{
					f = foods[i];
					break;
				}
			}
		}
		if(f != null)
		{
			System.out.println("Food Found");
		}
		else
		{
			System.out.println("Food Not Found");
		}
		return f;
	}
	
}   
	   
	   

