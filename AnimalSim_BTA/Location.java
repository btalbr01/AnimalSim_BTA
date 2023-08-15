
public class Location
{
	int xCoord;
	int yCoord;
	
	public Location()
	{
		xCoord = 0;
		yCoord = 0;
	}//end empty argument constructor
	
	public Location(int xCoord, int yCoord)
	{
		try
		{
			if(xCoord < 0)
				throw new InvalidCoordinateException();
			else this.xCoord = xCoord;
			if(yCoord < 0)
				throw new InvalidCoordinateException();
			else this.yCoord = yCoord;
		}//end try
		catch (InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}//end catch
	}//end preferred constructor
	
	public void update(int xCoord, int yCoord)
	{
		try
		{
			if(xCoord < 0)
				throw new InvalidCoordinateException();
			else this.xCoord = xCoord;
			if(yCoord < 0)
				throw new InvalidCoordinateException();
			else this.yCoord = yCoord;
			System.out.println(xCoord + "," + yCoord);
		}//end try
		catch (InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}//end catch
	}//end update
	
	public int[] getCoordinates()
	{
		int[] coordinates = {xCoord, yCoord};
		System.out.println(xCoord + "," + yCoord);
		return coordinates;
	}//end getCoordinates
}//end location