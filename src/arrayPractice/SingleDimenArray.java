package arrayPractice;

public class SingleDimenArray {

	public static void main(String[] args) {
		int no[][]=new int[4][2];
	no[0][0]=100;
	no[0][1]=200;
	no[1][1]=300;
	no[1][0]=400;
	no[2][0]=500;
	no[2][1]=600;
	no[3][0]=700;
	no[3][1]=800;
	
	
	for(int i=0;i<no.length;i++)
	{
		
		for(int j=0;j<2;j++)
		{
			System.out.print(no[i][j]+"  ");
		}
		
		System.out.println();
	}
System.out.println("===================================================================");	
	
	char grade[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
	
	for(int i=0;i<grade.length;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(grade[i][j]+"  ");
		}
		System.out.println();
	}
	
	
	System.out.println("========================================");
	
	for(char[] g:grade)
	{
		System.out.println(g);
	}
	
	System.out.println("==========================================");
	
	int number[]= {10,20,30,40};
	int sum=0;
	
	for(int i=0;i<number.length;i++)
	{
		sum=sum+number[i];
		 
	}
	System.out.println(sum);
	
	
	
	
	
	
	
	

	}

}
