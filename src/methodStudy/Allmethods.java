package methodStudy;

public class Allmethods {
	public static void main(String[] args)
	{
	familydetails();//static method without parameters
	Allmethods family=new Allmethods();//non-static method without parameters
	family.familydetails2();
	familydetails3(6, "udhan", 16, 170, 'M');//static methods with parameters
	Allmethods fm=new Allmethods();//non static method with parameters
	fm.familydetails4(5, "udhan", 14, 170, 'M');
	Newclass.familyinfo(6, "udhan", 15, 175, 'M');
	Newclass f=new Newclass();
	f.familyinfo1(4, "udhan", 14, 167, 'F');
	}
	//static method without parameters
	public static void familydetails()
	
	{
	int member=6;
	String surname="udhan";
	int yage=15;
	int ht=180;
	char gender='M';
	System.out.println("assingment");
	
		
	System.out.println("===================================================================");
	System.out.println("count of family member  "+member);
	System.out.println("family surname  "+surname);
	System.out.println("youngest member age"+yage);
	System.out.println("height of tallest member"+ht+"cm");
	System.out.println("gender of family head"+gender);
	System.out.println("====================================================================");
	}
	
	//non-static method without parameter
public void familydetails2()
	{
	int member=6;
	String surname="udhan";
	int yage=15;
	int ht=180;
	char gender='M';
	System.out.println("assingment");
		
	System.out.println("===================================================================");
	System.out.println("count of family member  "+member);
	System.out.println("family surname  "+surname);
	System.out.println("youngest member age  "+yage);
	System.out.println("height of tallest member  "+ht+"cm");
	System.out.println("gender of family head  "+gender);
	System.out.println("====================================================================");
				
		
	}
	
	public static void familydetails3(int member,String surname,int yage,int ht,char gender)
	{
	System.out.println("=====================================================================");
	System.out.println("count of family members  "+member);
	System.out.println("family surname  "+surname);
	System.out.println("youngest member age  "+yage);
	System.out.println("height of tallest member  "+ht);
	System.out.println("gender of family head  "+gender);
	System.out.println("=======================================================================");
		
		
	}
	public  void familydetails4(int member,String surname,int yage,int ht,char gender)
	{
	System.out.println("=====================================================================");
	System.out.println("count of family members  "+member);
	System.out.println("family surname  "+surname);
	System.out.println("youngest member age  "+yage);
	System.out.println("height of tallest member  "+ht);
	System.out.println("gender of family head  "+gender);
	System.out.println("=======================================================================");
		
		
	}
	
	
	
	
	
	
}
