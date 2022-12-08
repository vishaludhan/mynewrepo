package logicalProgram;

public class ReversingNumber {

	public static void main(String[] args) 
	{
		int num=1230456;
		
		String intstr = Integer.toString(num);
		String rev="";
		
		for(int i=intstr.length()-1;i>=0;i--)
		{
			char t = intstr.charAt(i);
			rev=rev+t;
	    
		}
		System.out.println(rev);
		int revNo = Integer.parseInt(rev);
		System.out.println(revNo);
		

	//aproach2
		
		int number=654321;
		int  revn=0;
		
		while(number!=0)
		{
			revn=revn*10+number%10;     //3 30+3=33
			number=number/10;               //23
			
		}
		System.out.println(revn);
		
		
	//aproach3	
		int num2=12300;
		StringBuffer sb=new StringBuffer(Integer.toString(num2));
		System.out.println(sb.reverse());
		
	}

}
