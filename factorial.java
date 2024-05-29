import java.util.Scanner;
class Facto 
{
	public static void main(String[] args) 
	{ 
		int num;
		long mul=1;
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for( int i=1;i<=num;i++)
		{
           mul=mul*i;
		}
		System.out.println(mul);

}
}
