class findArea
{
	public static void main(String[] args) 
	{
		int radius=7;
		int length=8;
		int width=17;
		int base=10;
		int height=20;

		double areaC= (3.14*radius*radius);
		double areaT=(base*height)/2 ;
		int areaRect=length*width;
		double volumeC=3.14*radius*radius*height;
		

		System.out.println("area of circle is:"+areaC);
		System.out.println("area of  triangle is:"+areaT);
		System.out.println("area of retangle is:"+areaRect);
		System.out.println("volume of cylinder is:"+volumeC);
	}
}
