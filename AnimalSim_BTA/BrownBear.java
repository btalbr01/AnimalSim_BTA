
public class BrownBear extends Animal implements Walkable, Swimmable
{
	String subSpecies;

	public BrownBear()
	{
		simID = 0;
		location = new Location (0,0);
		full = false;
		rested = true;
		subSpecies = "Alaskan";
	}//end empty argument constructor
	
	public BrownBear(int simID, Location l, String subSpecies)
	{
		this.simID = simID;
		this.location = l;
		full = false;
		rested = true;
		try
		{
			if(subSpecies == "Alaskan" || subSpecies == "Asiatic" || subSpecies == "European" ||  
					subSpecies == "Grizzly" ||	subSpecies == "Kodiak" ||subSpecies == "Siberian")
				this.subSpecies = subSpecies;
			else throw new InvalidSubspeciesException();
		}//end try
		catch (InvalidSubspeciesException e)
		{
			System.out.println(e.getMessage());
		}
	
		
	}//end preferred constructor
	
	@Override
	public void walk(int direction) 
	{	
		if(direction == 1)
			location.xCoord = location.xCoord+3;
		if(direction == 2)
			location.xCoord = location.xCoord-3;
		if(direction == 3)
			location.yCoord = location.yCoord+3;
		if(direction == 4)
			location.yCoord = location.yCoord-3;
		location.update(location.xCoord, location.yCoord);
	}//end walk

	@Override
	public void swim(int direction) {
		if(direction == 1)
			location.xCoord = location.xCoord+2;
		if(direction == 2)
			location.xCoord = location.xCoord-2;
		if(direction == 3)
			location.yCoord = location.yCoord+2;
		if(direction == 4)
			location.yCoord = location.yCoord-2;
		location.update(location.xCoord, location.yCoord);
	}//end swim

	public String getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies

	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}//end setSubSpecies

	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" 
	+ location.xCoord + "," + location.yCoord + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString	
}//end BrownBear