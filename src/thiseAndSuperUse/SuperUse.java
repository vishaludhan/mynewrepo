package thiseAndSuperUse;

public class SuperUse extends ThiseUse   {

	public static void main(String[] args)
	{
		SuperUse s=new SuperUse();
		s.sum2();
		System.out.println(s.a);

	}
   public void sum2()
   {
	   int a=50;
	   System.out.println(a);
	   System.out.println(super.a);
   }
}
