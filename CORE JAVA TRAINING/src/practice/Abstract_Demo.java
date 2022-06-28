package practice;

public class Abstract_Demo {

	public static void main(String[] args) {
		
		Scooty Activa = new Scooty();
		Activa.noofwheels();

	}

}

abstract class Vehicle
{
	abstract public void noofwheels();
}

class Scooty extends Vehicle
{
	public void noofwheels()
	{
		System.out.println("No of wheels in scooty ="+ 2);
	}
}