import java.util.Scanner;
class Pronic
{
	public static void main(String[] args)
	 {
		Scanner c=new Scanner(System.in);
		System.out.println("enter number");
		int num=c.nextInt();

		for (int i=1;i<=num;i++)
		{

			if ( i*(i+1)==num)
			{
				System.out.println("this is pronic number");
				return;
			}
		} 
			{
				System.out.println("this is not pronic number");
			}

	}
}
