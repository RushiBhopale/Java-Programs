class Fibonacci_Series
{
	public static void main(String args[])
	{
		int a=0,b=1;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
		}
	}

}

