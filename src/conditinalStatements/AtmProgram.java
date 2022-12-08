package conditinalStatements;

public class AtmProgram {

	public static void main(String[] args) {
		boolean carinsetrd=true;
		int pin=123;
		String option="balance";
		boolean amount=false;
		
		
		
		
		
		
		if (carinsetrd)
		{
			System.out.println("enter pin");
			if (pin==123)
			{
				System.out.println("chose the option");
				if (option=="withdral") 
				{
					System.out.println("enter amount");
					if (amount)
					{
						System.out.println("transaction is being process");
					}
				}else if (option=="balance")
				{
					System.out.println("balance displayed");
				}else {
					System.out.println("chose correct option");
				}
			}
			else
			{
				System.out.println("invalid pin");
			}
			
			
		}else {
			System.out.println("please insert card");
		}

	}

}
