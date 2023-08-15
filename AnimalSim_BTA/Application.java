import java.util.*;
public class Application {

	public static void main(String[] args) 
	{
		ArrayList<Animal> animals = new ArrayList<Animal>(3);
		Location loc1 = new Location();
		//Location tests
		System.out.println("*********************************************\n\n             "
				+ "Location Tests\n\n*********************************************");
		loc1.update(7,2);
		loc1.update(-3,6);
		loc1.getCoordinates();
		
		//Animal tests
		System.out.println("*********************************************\n\n             "
				+ "Animal Tests\n\n*********************************************");
		System.out.println("Animal is an Abstract class and cannot be instantiated");
		
		//Goldfinch tests
		System.out.println("*********************************************\n\n             "
				+ "Goldfinch Tests\n\n*********************************************");
		Location loc2 = new Location(2,8);
		loc2.getCoordinates();
		Goldfinch gold = new Goldfinch(123, loc2, 7.2);
		Goldfinch gold2 = new Goldfinch();
		gold.setWingSpan(8.5);
		System.out.println("Wingspan = " + gold.getWingSpan());
		gold.setWingSpan(3.5);//wingspan too small
		gold.walk(1);
		gold.walk(3);
		gold2.walk(2);//location x coordinate < 0
		gold.fly(loc2);
		gold.eat();
		gold.sleep();
		gold.setSimID(-1);//SimID exception
		System.out.println(gold.toString());
		
		//Brownbear tests
		System.out.println("*********************************************\n\n             "
				+ "BrownBear Tests\n\n*********************************************");
		Location loc3 = new Location(11,5);
		loc3.getCoordinates();
		BrownBear bear1 = new BrownBear(632, loc3, "Grizzly");
		BrownBear bear2 = new BrownBear(677, loc3, "Panda");//invalid SubSpecies
		bear1.walk(1);
		bear1.swim(2);
		bear2.setSubSpecies("Kodiak");
		System.out.println(bear1.toString());
		
		//Generics tests
		System.out.println("*********************************************\n\n             "
				+ "Generic Tests\n\n*********************************************");
		animals.add(gold);
		animals.add(gold2);
		animals.add(bear1);
		animals.add(bear2);
		System.out.println(animals);
	}//end main
}//end class