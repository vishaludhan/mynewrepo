package methodStudy;

public class Studentinformation {

	public static void main(String[] args) {
		Studentinformation name=new Studentinformation();
name.studentinformatiom("vishal", 53.4f);
name.studentinformatiom(null, 0);
	}

	
	
	
	public  void studentinformatiom(String sname,float weight)
	{
		System.out.println(sname);
		
		System.out.println(weight);
	}
}
