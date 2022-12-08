package methodStudy;

public class PassingParametersInMethods {

	public static void main(String[] args)
	{
        PassingParametersInMethods no=new PassingParametersInMethods();
        no.studentinformatin("vishal", 123, 50.4f, 'M', "CIVIL");
        sum(45.23, 89.65, 78.65);
        studentinformatin2("ram", 123, 46.6f, 'M', "CIVIL");
         
	}

	
	
	public void studentinformatin(String name,int prn,float weight,char gender,String dep)
	{
		
		
		
		System.out.println("name of student  "+name+"udhan");
		System.out.println("prn no  " +prn);
		System.out.println("weight of student  "+weight);
		
		System.out.println("gender of student "+gender);
		System.out.println("department  "+dep);
	
	}
	
	public static void sum(double a,double b,double c)
	{
	double	d=a+b+c;
	System.out.println(d);
	}
	
	public static void studentinformatin2(String name,int prn,float weight,char gender,String dep)
	
	{
		System.out.println("name of student  "+name+"hum");
		System.out.println("prn no  " +prn);
		System.out.println("weight of student  "+weight);
		
		System.out.println("gender of student "+gender);
		System.out.println("department  "+dep);
	
		
	}
	
	
}
