package logicalProgram;

public class ArmstrongNoProgram {

	public static void main(String[] args) 
	{
		int num=407;
		int arno=0;
		
		while(num!=0)
		{
			int nmum = num%10;             //3  5
			arno=arno+(nmum*nmum*nmum);    //27+0=27+125+1
			num=num/10;
		}
		
		if(arno==407)
		{
			System.out.println("thise is amstrong numb");
		}
		else
		{
			System.out.println("thise is not amstrong numb");
		}

	}

}
