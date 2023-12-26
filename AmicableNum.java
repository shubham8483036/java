import java.util.Scanner;
Class AmicableNum

{
	public static void main(String[] args)
	 {
	 	Scanner c=new Scanner (System.in);
	 	System.out.println("enter first number");
	 	int a=c.nextInt();
	 	System.out.println("enter second number");
	 	int b=c.nextInt();
	 	int sum1=0;
	 	int sum2=0;

	 	for ( int i=1;i<a;i++)
	 	{
	 		if (a%i==0)
	 		{
	 			sum1=sum1+i;
	 		}
	 	}
	 	for (int i=1;i<b;i++)

	 	{
	 		sum2=sum2+i;
	 	}
		
	
	if(a==sum2)&&(b==sum1)
	{
		System.out.println(a+","+b+ "this is amicable number");
	}
	else 
	{
		System.out.println(a+","+b+ "this is not amicable number");

	}
}