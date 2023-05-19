import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{   
    private int choice;
	private int option1;
	private int option2;
	private int option3;
	private int option4;
	private int option5;
	private int option6;
	private int option7;
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Market m = new Market();
		Shop c = new Shop();
		Store sr = new Store();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
        Bazaar b = new Bazaar();
	    Start s=new Start(); 
	    
		
	
		boolean repeat = true;
		
		while(repeat)
		{
			
			System.out.println("*****--- Welcome to our Console Online Shopping Management ---****");
			
			
			
        String username;
        String password;
	    int x;
        System.out.println("HOW YOU WANT TO LOG IN?");
        System.out.println("IF as a ADMIN,press 1");
       // System.out.println("IF as a EMPLOYEE,press 2");
        x = sc.nextInt();
	    if(x== 1)
	    {
	      System.out.println("<===================== Log In As A ADMIN =======================>");
          System.out.println();
          System.out.print("username: ");
          username = sc.next();

          System.out.print("password: ");
          password = sc.next();
		  System.out.println();
	  
		  
	  if(password.equals("42148") && username.equals("Rubaiba") ){
          System.out.println("<<<<<<<<<<<<<<<<<<<<logged in as a ADMIN>>>>>>>>>>>>>>>>>>>>>>>>");
          }
        else{
       System.out.println("Please try again.");
	   System.out.println("########################");
		break;
	   
         } 
	 }
	   
		
		else {
			
		System.out.println(" Please Choose another Option ");
		}
		
		


		
			System.out.println("             **--What do you want to do?--**\n            ");
			
			System.out.println("                =========================           ");
			System.out.println("	            1. About Employee               ");
			System.out.println("                    2. About Customer                 ");
			System.out.println("	            3. Store Management");
			System.out.println("	            4. Product Management ");
			System.out.println("	            5. Product Quantity Add-Sell");
		    System.out.println("	            6. Food Management");
			System.out.println("	            7. Exit\n                       ");
			
			System.out.println("                =========================          ");
					
				
					try
	             {
			             System.out.print("Your Option: ");
			             s.option1 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception");
		     break;
		}	

		
			switch(s.option1)   
			{
				case 1:
				
					System.out.println("--------------------------------");
					System.out.println("You have chosen Employee Details");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Add New Employee");
					System.out.println("	2. Remove an Employee");
					System.out.println("	3. Show All Employees");
					System.out.println("	4. Search an Employee");
					System.out.println("	5. Go Back\n");
					
			try
	             {
			             System.out.print("Your Option: ");
			             s.option1 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception");
		     break;
		}	
					switch(s.option1)
					{
						case 1:
						
							System.out.println("----------------------");
							System.out.println("Add New Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee First Name: ");
							String fname1 = sc.next();
							System.out.print("Enter Employee Last Name: ");
							String lname1 = sc.next();
							System.out.print("Enter Employee Age: ");
							String age1 = sc.next();
							System.out.print("Enter Employee's E-mail : ");
							String email1 = sc.next();
							System.out.print("Enter Employee's Phone Number : ");
							String mobile1 = sc.next();
							System.out.print("Enter Employee's Address : ");
							String address1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setFName(fname1);
							e1.setLName(lname1);
							e1.setAge(age1);
							e1.setEmail(email1);
							e1.setMobile(mobile1);
							e1.setAddress(address1);
							e1.setSalary(salary1);
							
							m.addEmployee(e1);
							
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
							break;
							
						case 2:
						
							System.out.println("************************");
							System.out.println("Remove an Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = m.getEmployee(empId2);
							
							if(e2 != null)
							{
								m.removeEmployee(e2);
							}
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All Employees");
							m.showAllEmployees();
							System.out.println("########################");
							break;
						
						case 4:
						
							System.out.println("--------------------");
							System.out.println("Search an Employee");
							                                                               
							System.out.print("Enter Employee ID: ");
							String empId4 = sc.next();
							
							Employee e4 = m.getEmployee(empId4);
							
							if(e4 !=null)
							{
								System.out.println();
								System.out.println("Employee ID : "+e4.getEmpId());
								System.out.println("Employee Name : "+e4.getFName()+" "+e4.getLName());
								System.out.println("Employee Age : "+e4.getAge()+" "+"years");
								System.out.println("Employee's E-mail : "+e4.getEmail());
								System.out.println("Employee Phone Number : +88"+e4.getMobile());
								System.out.println("Employee's Address : "+e4.getAddress());
								System.out.println("Employee Salary : "+e4.getSalary()+""+"/=");
								System.out.println();
							}
							
							System.out.println("########################");
							break;
					case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
							
					}
					System.out.println("--------------------------------");
					break;
					
				
			case 2:
				
					System.out.println("--------------------------------");
					System.out.println("You have chosen Employee Management");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Add Customer ");
					System.out.println("	3. Show All Customer");
					System.out.println("	4. Search a Customer");
					System.out.println("	5. Go Back\n");
					
			try
	             {
			             System.out.print("Your Option: ");
			             s.option2 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception Occurred please run again and give valid input");
		     break;
		}	
					switch(s.option2)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Add Customer ");
							
							System.out.print("Enter Customer ID: ");
							String cId1 = sc.next();
							System.out.print("Enter Customer's First Name: ");
							String cfname1 = sc.next();
							System.out.print("Enter Customer's Last Name: ");
							String clname1 = sc.next();
							System.out.print("Enter Customer's Phone Number : ");
							String cmobile1 = sc.next();
							System.out.print("Enter Customer's Address : ");
							String caddress1 = sc.next();
			                System.out.print("Enter Customer's Email : ");
							String cemail1 = sc.next();
							
							Customer c1 = new Customer();
							c1.setCId(cId1);
							c1.setCFName(cfname1);
							c1.setCLName(clname1);
							c1.setCMobile(cmobile1);
							c1.setCAddress(caddress1);
							c1.setCEmail(cemail1);
							
							c.addCustomer(c1);
							
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
							break;
							
							
					    case 2:
						
							System.out.println("########################");
							System.out.println("Show All Customer");
							c.showAllCustomers();
							System.out.println("########################");
							break;
						
						case 3:
						
							System.out.println("########################");
							System.out.println("Search a Customer");
							                                                               
							System.out.print("Enter Customer ID: ");
							String cId4 = sc.next();
							
							Customer c4 = c.getCustomer(cId4);
							
							if(c4 !=null)
							{
								System.out.println();
								System.out.println("Customer ID : "+c4.getCId());
								System.out.println("Customer Name : "+c4.getCFName()+" "+c4.getCLName());
								System.out.println("Customer Phone Number : +88"+c4.getCMobile());
								System.out.println("Customer's Address : "+c4.getCAddress());
								System.out.println("Customer's Email : "+c4.getCEmail());
								System.out.println();
							}
							
							System.out.println("########################");
							break;
					
					case 4:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					System.out.println("--------------------------------");
					break;
					
         case 3:
				
					System.out.println("--------------------------------");
					System.out.println("You have chosen StoreHouse Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New StoreHouse");
					System.out.println("	2. Remove an Existing StoreHouse");
					System.out.println("	3. Show All StoreHouses");
					System.out.println("	4. Search a StoreHouse");
					System.out.println("	5. Go Back\n");
						try
	             {
			             System.out.print("Your Option: ");
			             s.option4 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}
					switch(s.option4)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New StoreHouse");
							
							System.out.print("Enter StoreHouse Id: ");
							String sid1 = sc.next();
							System.out.print("Enter StoreHouse Name: ");
							String name1 = sc.next();
							
							
							StoreHouse s1 = new StoreHouse();
							s1.setSid(sid1);
							s1.setName(name1);
						
							b.insertStoreHouse(s1);
							
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Remove Existing StoreHouse");
							
							System.out.print("Enter StoreHouse ID: ");
							String sid2 = sc.next();
							
							StoreHouse s2 = b.getStoreHouse(sid2);
							
							if(s2 != null)
							{
								b.removeStoreHouse(s2);
							}
							System.out.println("########################");
							break;
						
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All StoreHouses");
							b.showAllStoreHouses();
							System.out.println("########################");
							break;
						
						case 4:
						
							System.out.println("########################");
							System.out.println("Search a StoreHouse");
							System.out.print("Enter StoreHouse ID: ");
							String sid4 = sc.next();
							
							StoreHouse s4 = b.getStoreHouse(sid4);
							
							if(s4 !=null)
							{
								System.out.println();
								System.out.println("StoreHouse ID: "+s4.getSid());
								System.out.println("StoreHouse Name: "+s4.getName());
								s4.showAllProducts();
								System.out.println();
							}
							
							System.out.println("########################");
							break;
						
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					System.out.println("--------------------------------");
					break;					
		
		
		case 4:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Shop Product Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Product");
					System.out.println("	2. Remove Existing Product");
					System.out.println("	3. Show All Product");
					System.out.println("	4. Search a Product");
					System.out.println("	5. Go Back\n");
					
						try
	             {
			             System.out.print("Your Option: ");
			             s.option5 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}
					switch(s.option5)
					{
						
                     case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Product for a Shop\n");
							
							Product p = null;
							
							System.out.println("Which type of Product do you want to Insert?\n");
							System.out.println("	1. Local Product");
							System.out.println("	2. Imported Product");
							System.out.println("	3. Go Back");
							
							System.out.print("Enter Your Product Type: ");
							int type = sc.nextInt();
							
							if(type == 1)
							{
								LocalProduct lp = new LocalProduct();
								
								System.out.print("Enter Product ID: ");
								String pid1 = sc.next();
								System.out.print("Enter Product Name: ");
								String pn1 = sc.next();
								System.out.print("Enter Product Available Quantity: ");
								int pq1 = sc.nextInt();
								System.out.print("Enter Product Price: ");
								double pp1 = sc.nextDouble();
								System.out.print("Enter Discount Rate: ");
								double dr1 = sc.nextDouble();
								
								lp.setPid(pid1);
								lp.setName(pn1);
								lp.setAvailableQuantity(pq1);
								lp.setDiscountRate(dr1);
								
								p = lp;
								
							}
							else if(type == 2)
							{
								ImportedProduct ip = new ImportedProduct();
								
								System.out.print("Enter Product ID: ");
								String pid2 = sc.next();
								System.out.print("Enter Product Name: ");
								String pn2 = sc.next();
								System.out.print("Enter Product Available Quantity: ");
								int pq2 = sc.nextInt();
								System.out.print("Enter Product Price: ");
								double pp2 = sc.nextDouble();
								System.out.print("Enter country Name: ");
								String cn1 = sc.next();
								
								ip.setPid(pid2);
								ip.setName(pn2);
								ip.setAvailableQuantity(pq2);
								ip.setCountryName(cn1);
								
								p = ip;
								
							}
							else if(type == 3)
							{
								System.out.println("Going Back.......");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(p!= null)
							{
								System.out.print("Enter StoreHouse ID: ");
								String sid1 = sc.next();
								b.getStoreHouse(sid1).insertProduct(p);
							}
							System.out.println("########################");
							break;
						
						case 2:
						
							System.out.println("########################");
							System.out.println("Remove Existing Product");
							
							System.out.print("Enter StoreHouse ID: ");
							String sid2 = sc.next();
							System.out.print("Enter Product ID: ");
							String pid2 = sc.next();
							
							b.getStoreHouse(sid2).removeProduct(b.getStoreHouse(sid2).getProduct(pid2));
							System.out.println("########################");
							break;
						
						case 3: 
						
							System.out.println("########################");
							System.out.println("Show All Product in StoreHouse");
							
							System.out.print("Enter StoreHouse ID: ");
							String sid3 = sc.next();
							b.getStoreHouse(sid3).showAllProducts(); 
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Search a Product\n");
							
							System.out.print("Enter StoreHouse ID: ");
							String sid4 = sc.next();
							System.out.print("Enter Product ID: ");
							String pid4 = sc.next();
							
							Product p1 = b.getStoreHouse(sid4).getProduct(pid4);
							
							if(p1 != null)
							{
								p1.showInfo();
							}
							System.out.println("########################");
							break;
						
						
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back..");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					System.out.println("--------------------------------");
					break;
					
			case 5:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Product Quantity Add-Sell");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Add Product");
					System.out.println("	2. Sell Product");
					System.out.println("	3. Show Add Sell History");
					System.out.println("	4. Go Back\n");
						try
	             {
			             System.out.print("Your Option: ");
			             s.option5 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}
					switch(s.option5)
					{
						case 1:
							System.out.println("#########################");
							System.out.println("Add Product");
							System.out.print("Enter StoreHouse ID: ");
							String sid1 = sc.next();
							System.out.print("Enter Product ID: ");
							String pid1 = sc.next();
							System.out.print("Enter Add Amount: ");
							int amount1 = sc.nextInt();
							
							if(amount1>0)
							{
								b.getStoreHouse(sid1).getProduct(pid1).addQuantity(amount1);
								frwd.writeInFile(amount1+" Quantity has been Added in Product ID "+ pid1);
			
							}
							System.out.println("#########################");
							break;
						
						case 2:
						
							System.out.println("#########################");
							System.out.println("Sell Product");
							System.out.print("Enter Factory ID: ");
							String sid2 = sc.next();
							System.out.print("Enter Product ID: ");
							String pid2 = sc.next();
							System.out.print("Enter Add Amount: ");
							int amount2 = sc.nextInt();
							
							if(amount2>0 && amount2<=b.getStoreHouse(sid2).getProduct(pid2).getAvailableQuantity())
							{
								b.getStoreHouse(sid2).getProduct(pid2).sellQuantity(amount2);
								frwd.writeInFile(amount2+" Quantity has been Sold from Product ID "+ pid2);
							}
							
							System.out.println("#########################");
							break;
						
						case 3:
						
							System.out.println("#########################");
							System.out.println("Show Add-Sell History\n");
							frwd.readFromFile();
							System.out.println("\n#########################");
							break;
							
						case 4:
						
							System.out.println("#########################");
							System.out.println("Going Back");
							System.out.println("#########################");
							break;
							
						default:
						
							System.out.println("#########################");
							System.out.println("Invalid Option");
							System.out.println("#########################");
							break;
						
					}
					
					System.out.println("--------------------------------");
					break;	
				
			case 6:
				
					System.out.println("--------------------------------");
					System.out.println("You have chosen Food Management");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Add new Food");
					System.out.println("	2. Remove a Food");
					System.out.println("	3. Show All Foods");
					System.out.println("	4. Search A Food");
					System.out.println("	5. Go Back\n");
					
					
			try
	             {
			             System.out.print("Your Option: ");
			             s.option6 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception");
		     break;
		}	


					switch(s.option6)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Add new Food");
							
							System.out.print("Enter Food ID: ");
							String fId1 = sc.next();
							System.out.print("Enter Food Name: ");
							String fname1 = sc.next();
							System.out.print("Enter Food Price : ");
							String fprice1 = sc.next();
							System.out.print("Enter Food Quantity : ");
							String fquantity1 = sc.next();
		
							
							Food f1 = new Food();
							f1.setFId(fId1);
							f1.setFName(fname1);
							f1.setFPrice(fprice1);
							f1.setFQuantity(fquantity1);
							
							
							sr.addFood(f1);
							
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
							break;
							
						case 2:
						
							System.out.println("************************");
							System.out.println("Remove a Food");
							
							System.out.print("Enter Food ID: ");
							String fId2 = sc.next();
							
							Food f2 = sr.getFood(fId2);
							
							if(f2 != null)
							{
								sr.removeFood(f2);
							}
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All Foods");
							sr.showAllFoods();
							System.out.println("########################");
							break;
						
						case 4:
						
							System.out.println("########################");
							System.out.println("Search a Food");
							                                                      
							System.out.print("Enter Food ID: ");
							String fId4 = sc.next();
							
							Food f4 = sr.getFood(fId4);
							
							if(f4 !=null)
							{
								System.out.println();
								System.out.println("Food ID : "+f4.getFId());
								System.out.println("Food Name : "+f4.getFName());
								System.out.println("Food Price : "+f4.getFPrice());
								System.out.println("Food Quantity : "+f4.getFQuantity());
								System.out.println();
							}
							
							System.out.println("########################");
							break;
						

					case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					System.out.println("--------------------------------");
					break;
					
			
					
				case 7:
				
					System.out.println("--------------------------------");
					System.out.println("You have chosen to Exit");
					repeat = false;
					System.out.println("--------------------------------");
					break;
					
				default:
				
					System.out.println("--------------------------------");
					System.out.println("Invalid Choice");
					System.out.println("--------------------------------");
					break;
			}
		}
	}
}
