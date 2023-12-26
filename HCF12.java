//import util.java.Scanner;
class HCF12
{
	public static void main(String[] args)
	 {
		int a=12;
		int b=48;
		int hcf=1;

		for ( int i=1;i<=a;i++)
		{

			if (a%i==0&&i==0)

				hcf=i;
		}
		System.out.println(hcf);
		

	}
}