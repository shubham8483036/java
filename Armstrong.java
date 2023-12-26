import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	 {
		Scanner c=new Scanner(System.in);
		System.out.println("enter a number");
		int a=c.nextInt();

		int num=a;
		int count=0;
		int sum=0;
		

		while ( num>0)
     {
     	int rem=num%10;
     	System.out.println(rem);
     	num/=10;
     	count++;
     }
     System.out.println("count of digits:"+count);

     while ( num !=0)
      {   
  int rem=num%10;
 int p=1;
  for (int i=1; i<=count;i++)
    {
  	 p=p*rem;

	}
	sum=sum+p;
	num/=10;


}


if (sum==num)

{
	System.out.println("this is Armstrong number:");
}
else 
{
	System.out.println("this is not Armstrong number:");

}
}}