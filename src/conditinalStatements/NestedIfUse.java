package conditinalStatements;

public class NestedIfUse {

	public static void main(String[] args) {
		boolean atminserted=true;
		int pin=1234;
		boolean enteramount=true;
		String option="withdrawl";
		
		
		if (atminserted) 
		{
			
			if (pin==1234)
			{
				
				
				
				
				if (enteramount)
				{
					System.out.println("transaction is processing");
				}
				else 
				{
					System.out.println("please enter amount");
				}
			}
			else 
			{
				System.out.println("invalid pin");
			}
		}
		else
		{
			System.out.println("plese insert atm card");
		}

	}

}
