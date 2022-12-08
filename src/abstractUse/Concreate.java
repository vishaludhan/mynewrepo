package abstractUse;

public class Concreate extends Abs {

	public static void main(String[] args) {
		Concreate cc=new Concreate();
		cc.sum();
		cc.sub();

	}

	@Override
	public void sub() {
		System.out.println("thise is incomplete method");
		
	}

}
