package methodStudy;

public class MehodOverLoadingStudy {

	
		public static void main(String[] args) 
		{
			MehodOverLoadingStudy.sum1(3, null);
			MehodOverLoadingStudy.sum1(null, 0);
		}
		
		
	public static void sum1(int a,String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static String sum1(String b,int a)
	{
		System.out.println(a);
		System.out.println(b);
		return b;
	}
	public  void sum(int a,String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public void sum(String b,int a)
	{
		System.out.println(a);
		System.out.println(b);
	}
	

		
		
		
		
		
		
		
		
		

	

}
