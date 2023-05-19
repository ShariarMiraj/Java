package classes;
import java.lang.*;
import interfaces.*;

public class Market implements EmployeeOperations
{
  
    Employee employees[]=new Employee[100];


    
    public void addEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Employee Added");
		}
		else
		{
			System.out.println("Can Not Add");
		}
	}
	
	
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Employee Removed");
	    }
		else
		{
			System.out.println("Can Not Remove");
		}
	}
	public void showAllEmployees()
	{
		System.out.println("*/////////////////////////////////*");
		for(Employee e : employees)
		{
			if(e != null)
			{
				System.out.println("Employee First Name: "+ e.getFName());
				System.out.println("Employee Last Name: "+ e.getLName());
				System.out.println("Employee ID: "+ e.getEmpId());
				System.out.println("Employee Address: "+ e.getAddress());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
			}
		}
		System.out.println("*//////////////////////////////////*");
	}
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		if(e != null)
		{
			System.out.println("Employee Found");
		}
		else
		{
			System.out.println("Employee Not Found");
		}
		return e;
	}
	
}   
	   