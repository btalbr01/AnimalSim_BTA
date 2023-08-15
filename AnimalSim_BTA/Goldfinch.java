
public class Goldfinch extends Animal implements Flyable, Walkable
{
	double wingSpan;
	
	public Goldfinch()
	{
		super();
		simID = 0;
		location = new Location(0,0);
		full = false;
		rested = true;
		wingSpan = 9.0;
	}//end empty argument constructor
	
	public Goldfinch(int simID, Location l, double wingSpan)
	{
		try
		{
			if(simID < 1)
				throw new InvalidCoordinateException();
			else this.simID = simID;
		}
		catch (InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}	
		this.location = l;
		full = false;
		rested = true;
		try
		{
			if(wingSpan < 5.0 || wingSpan > 11.0)
			{
				throw new InvalidWingspanException();
			}
			else this.wingSpan = wingSpan;
		}//end try
			catch (InvalidWingspanException e)
			{
			System.out.println(e.getMessage());
			}//end catch
	}//end preferred constructor
	
	public double getWingSpan() {
		return wingSpan;
	}//end getWingSpan

	public void setWingSpan(double wingSpan) {
		try
		{
			if(wingSpan < 5.0 || wingSpan > 11.0)
			{
				throw new InvalidWingspanException();
			}
			else this.wingSpan = wingSpan;
		}//end try
			catch (InvalidWingspanException e)
			{
			System.out.println(e.getMessage());
			}//end catch
	}//end setWingSpan

	public void walk(int direction)
	{
		if(direction == 1)
			location.xCoord = location.xCoord+1;
		if(direction == 2)
			location.xCoord = location.xCoord-1;
		if(direction == 3)
			location.yCoord = location.yCoord+1;
		if(direction == 4)
			location.yCoord = location.yCoord-1;
		location.update(location.xCoord, location.yCoord);
	}//end walk

	public void fly(Location l) 
	{
		location.getCoordinates();
	}//end fly
	
	public void eat()
	{
		super.eat();
	}//end eat
	
	public void sleep()
	{
		 super.sleep();			 
	}//end sleep

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID 
				+ ", location=" + location.xCoord + "," + location.yCoord 
				+ ", full=" + full + ", rested=" + rested + "]";
	}//end toString
}//end Goldfinch