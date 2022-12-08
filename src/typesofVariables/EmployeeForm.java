package typesofVariables;

public class EmployeeForm {

	public static void main(String[] args)
	{
		EMP vishal=new EMP();
		vishal.emp_name="vishal udhan";
		vishal.emp_id=30;
		vishal.emp_salary=50000.23;
		vishal.emp_gender='M';
		EMP.role="admin";
		vishal.empinfo();
		EMP ram =new EMP();
		ram.emp_name="ram patil";
		ram.emp_id=54;
		ram.emp_salary=30000.65;
		ram.emp_gender='M';
		EMP.role="employee";
		ram.empinfo();
		EMP.companyname="xyz";
		
				EMP.inf0();
		
		
		

	}

}
