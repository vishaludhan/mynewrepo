package logicalProgram;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
	      String name="vishal purushottam udhan";
	      
	      
	      System.out.println(name.replaceAll("\\s", ""));
	      
	      //or
	      
	      
	      System.out.println(name.replace(" ", ""));
	      System.out.println(name.replaceFirst("v", "V").replace("p", "P"));
	      
	      
	      

	}

}
