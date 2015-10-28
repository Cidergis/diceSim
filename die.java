package edu.sdccd.mesa.cisc190.dice;

import java.util.Random ;
public class die
{
	private int numberOfSides ;
    	public die(int numberOfSides)
	{
        	if (numberOfSides >= 4 && numberOfSides <= 100)
        	{
        	this.numberOfSides = numberOfSides ;
        	}
        	else
		{
			throw new IllegalArgumentException(numberOfSides + " is not a valid die") ;
		}
		public int roll()
	        {
	    	    	Random rnd = new Random () ;
	        	int value = rnd.nextInt(numberOfSides) + 1 ;
	        	return value ;
	        }
	}
}
