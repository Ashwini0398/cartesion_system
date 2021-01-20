public class cartesionplane {
	public static void main(String args[])
	{
		int x1,y1,x2,y2,x3,y3,x4,y4;
		double length1, length2;
		x1=2;
		y1=2;
		x2=3;
		y2=3;
		x3=4;
		y3=4;
		x4=5;
		y4=5;

		length1 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		length2 = Math.sqrt(Math.pow(x3-x4,2) + Math.pow(y3-y4,2));

		System.out.println("the length of line1 is:"+length1);
		System.out.println("the length of line2 is:"+length2);



		if( length1 == length2 )
		{
			System.out.println("both line length are equal");
		}
		else
		{
			System.out.println("lines are not equal");	
		}

	}


}
