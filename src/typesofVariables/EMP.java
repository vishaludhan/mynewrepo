package typesofVariables;

public class EMP 
{
	
	String emp_name;
	int emp_id;
	double emp_salary;
	char emp_gender;
     static String role;
     static String companyname;
	
	public void empinfo()
	    {
		System.out.println("====================================================================================");
		System.out.println("employee name is  "+emp_name);
		System.out.println("employee id is  "+emp_id);
		System.out.println("employee salary is"+emp_salary);
		System.out.println("employee gender is  "+emp_gender);
		System.out.println("employee role is  "+role);
		System.out.println("======================================================================================");
		
		}
	public static void inf0()
	{
		System.out.println("company name is  "+companyname);
		System.out.println("=======================================================================================");
	}
	
	
}
