package logicalProgram;

public class FindOccuranceOfString {

	public static void main(String[] args) 
	{
	     String name="vishal purushottam udhan";
	     
	     int totallength = name.length();
	     
	   int afterromveingU = name.replace(" ", "").length();
	   
	  int totaU=totallength-afterromveingU;
	  System.out.println("total u count in string:"+totaU);
	   
	     

	}

}
