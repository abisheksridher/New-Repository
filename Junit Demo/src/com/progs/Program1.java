package com.progs;
class BugException extends Exception
{
	public BugException(String message)
	{
		super(message);
	}
}
public class Program1 {
	public int solution(String input) throws BugException
	{
		int sum=0;
		System.out.println("Hello");
		
		
		for(char c: input.toCharArray())
		{
			if(!(Character.isLetterOrDigit(c)))
				throw new BugException("Invalid Character");
			else if(Character.isDigit(c))
				sum=sum+Character.getNumericValue(c);
		}
		
		return sum ;
	}

}
