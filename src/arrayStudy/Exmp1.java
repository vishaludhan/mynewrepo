package arrayStudy;

public class Exmp1 {

	public static void main(String[] args)
	{

		int rollno[]=new int[5];
		
		rollno[0]=10;
		rollno[1]=11;
		rollno[2]=12;
		rollno[3]=13;
		rollno[4]=14;
		
		
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println(rollno[3]);
		System.out.println(rollno[4]);
		System.out.println("======================================================");
		
		for(int i=0; i<=rollno.length-1;i++ )
		{
			
			System.out.println(rollno[i]);
		}
		System.out.println("====================================================");
		
		for(int i=rollno.length-1; i>=0;i--)
		{
			System.out.println(rollno[i]);
			
		}
		System.out.println("========================================================");
		

		 String city[]=new String[3];
		  
		 city[0]="pune";
		 city[1]="jalna";
		 city[2]="beed";
		 
		 for(int i=0;i<=city.length-1;i++)
		 {
			 System.out.println(city[i]);
		 }
		 System.out.println("==========================================================");
		
		for (int i=city.length-1;i>=0 ; i--) 
		{
			System.out.println(city[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
