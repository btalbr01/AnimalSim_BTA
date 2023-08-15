import java.util.*;
public abstract class Animal extends Location
{
	int simID;
	Location location;
	boolean full;
	boolean rested;
	Random rand = new Random();
	
	public Animal()
	{
		simID = 0;
		Location location = new Location (0,0);
		full = false;
		rested = false;
		
	}//end empty argument constructor
	
	public Animal(int simID, Location location)
	{	
		try
		{
			if(simID < 1)
				throw new InvalidSimIDException();
			else this.simID = simID;
		}
		catch (InvalidSimIDException e)
		{
			System.out.println(e.getMessage());
		}			
		this.location = location;
		full = false;
		rested = false;
	}//end preferred constructor
	
	public void eat()
	{
		 double rand_float = rand.nextDouble(1.0);
		 if(rand_float <= 0.5)
			 full = false;
		 else full = true;		
		 System.out.println(full);
	}//end eat
	
	public void sleep()
	{
		 double rand_float = rand.nextDouble(1.0);
		 if(rand_float <= 0.5)
			 rested = false;
		 else rested = true;	
		 System.out.println(rested);
	}//end sleep

	public int getSimID() 
	{
		return simID;
	}//end getSimID

	public void setSimID(int simID) 
	{
		try
		{
			if(simID < 1)
				throw new InvalidSimIDException();
			else this.simID = simID;
		}
		catch (InvalidSimIDException e)
		{
			System.out.println(e.getMessage());
		}	
	}//end setSimID

	public Location getLocation() 
	{
		return location;
	}//end getLocation

	public void setLocation(Location location) 
	{
		this.location = location;
	}//end setLocation

	public boolean isFull() 
	{
		return full;
	}//end isFull

	public void setFull(boolean full) 
	{
		this.full = full;
	}//end setFull

	public boolean isRested() 
	{
		return rested;
	}//end isRested

	public void setRested(boolean rested) 
	{
		this.rested = rested;
	}//end setRested
}//end Animal