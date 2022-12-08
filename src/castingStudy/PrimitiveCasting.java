package castingStudy;

public class PrimitiveCasting {

	public static void main(String[] args)
	{
	    int a=24;
	    
	    double b=a;
	    System.out.println(b);
	    
	    long c=234;
	    int d=(int) c;
	    double e=30.4d;
	    float f=(float) e;
	    int h=97;     //by using ascii value we can convert int to char
	    char r=(char) h;
	    System.out.println(r);
	    char z='d';
	    int y=z;
	    System.out.println(y);

	}

}
