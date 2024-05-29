class  MaxNum
{
	public static void main(String[] args) 
	{   System.out.println("program for maximum two no");

		int a=10;
		int b=20;
		if(a>b)
		{
			System.out.println("a is grater");

		}
		else if(b>a)
		{
			System.out.println(" b is grater");
		}
		else
		{
			System.out.println("both are same");
		}




         //program for find maximum no among three no
        System.out.println(" ");
        System.out.println("program for maximum three no");
		int c=10;
		 int d=20;
	     int e=30;
		 if(c>d && c>e)
		{
			 System.out.println("c is greater"+10);
		}
		else if(d>c && d>e)
		{
			System.out.println(" d is graeter"+20);
		}
		else
		{
			System.out.println("e is greater"+30);
		}


   //progran to check positive or negative no
    System.out.println(" ");
    System.out.println("progran to check positive or negative no");

      int number=10;
      if(number>0)
		{
	   System.out.println("number are positive:"+number);
		}
		else if(number<0)
		{
			System.out.println("number are negative");
		}
		else
		{
			System.out.println("number are 0");

		}
		

		// check no are divisible by 5 and 11
		System.out.println(" ");
        System.out.println("check no are divisible by 5 and 11");
		int num=55;
		if(num%5==0 && num%11==0)
		{
			System.out.println("number are divisible by 5 and 11:"+num);
		}
		else if(num%5==0 && num%11!=0)
		{
			System.out.println("number are divisible only by 5 ");
		}
		else if(num%5!=0 && num%11==0)
		{
			System.out.println("number are divisible only by 11 ");
		}
		else 
		{
			System.out.println("number are not divisible  by 5 and 11 ");
		}


		// check no are even or odd
		System.out.println(" ");
        System.out.println("check no are even or odd");
	    int digit=7;
        if(digit%2==0)
		{
			System.out.println("number are even:"+digit);
		}
		else
		{
		   System.out.println("number are odd:"+digit);
		}

		

		//check year leap year or not
		System.out.println(" ");
        System.out.println("check year leap year or not");
		int year=2004;
		 if(year%4==0)
		{
			System.out.println("year are leap year:"+year);
		}
		else
		{
		   System.out.println("year are not leap year");
		}
	}
}
