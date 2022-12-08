package primitiveCasting;

public class UpCasting {

	public static void main(String[] args) {
		Father f=new Father();
		f.home();
		f.money();
		System.out.println("================================================");
		Son s=new Son();
		s.home();
		s.money();
		s.degree();
		System.out.println("=================================================");
		Father f1=new Son();
		f1.home();
		f.money();
		

	}

}
