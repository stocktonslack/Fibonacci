package fib.controller;

public class FibController
{
	public double getFibonacci(double position)
	{
			if(position == 0 || position == 1)
			{
				return 1;
			}
			else
			{
				return getFibonacci (position - 1) +getFibonacci(position - 2);
			}
	}
	
	public double getFactorial(double spot)
	{
		if(spot == 0 || spot == 1)
		{
			return 1;
		}
		else
		{
			return spot * getFactorial(spot - 1);
		}
	}
	
	public void start()
	{
		for(int position = 0; position < 1001; position++)
		{
			long startTime = System.currentTimeMillis();
			
			System.out.println("The " +  position + "th spot of the Factorial sequence is: " 
					+ getFactorial(position) + " and it took " 
					+ (System.currentTimeMillis() - startTime)
					+ " milliseconds to calculate it");
			
		}
		
//		for(int position = 1; position < 500; position++)
//		{
//			long startTime = System.currentTimeMillis();
//			
//			System.out.println("The " +  position + "th spot of the Fibonaccis sequence is:" 
//					+ getFibonacci(position) + "and it took " + (System.currentTimeMillis() - startTime)
//					+ " milliseconds to calculate it");
//		}
	}

}
