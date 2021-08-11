import java.util.Scanner;
public class Start
{
	public static void main(String args[])
	{
        Scanner sin=new Scanner(System.in);
		System.out.println("Input Choice: ");
	    int x=sin.nextInt();
		
		switch(x)
		{
			case 1:
			{
				Scanner sin=new Scanner(System.in);
		        System.out.println("Input Choice: ");
	            int y=sin.nextInt();
				{
					switch(y)
					{
						Employee e1 = new Employee();
		                e1.setEmpId("1-2-3");
		                e1.setName("MD.Danny");
		                e1.setSalary(200.5);
						Bank b = new Bank();
						
						if(y==1)
						{						  
						   b.insertEmployee(e1);
	                    }
						if(y==2)
					    {
						   b.removeEmployee(e1);
						}
						if(y==3)
						{
						   b.showAllEmployees();
						}
					}
				}
			}
			
			case 2:
			{
				Scanner sin=new Scanner(System.in);
		        System.out.println("Input Choice: ");
	            int y=sin.nextInt();
				{
					switch(y)
					{
						Customer c1 = new Customer();
		                c1.setName("Anik");
		                c1.setNid(11223344);
						Bank b = new Bank();
						if(y==1)
						{
						   b.insertCustomer(c1);
						}
						if(y==2)
						{
						   b.removeCustomer(c1);
						}
						if(y==3)
						{
						   b.showAllCustomers();
						}
					}
				}
			}
			
			case 3:
			{
				Scanner sin=new Scanner(System.in);
		        System.out.println("Input Choice: ");
	            int y=sin.nextInt();
				{
					switch(y)
					{
						
					}
				
			}
				
		}














	
	}
}
