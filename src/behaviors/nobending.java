package behaviors;
import interfaces.iattackbehavior;
import interfaces.irushbehavior;

public class nobending implements iattackbehavior,irushbehavior{
	public void attack() {
		System.out.println("fan and sword!!!");
	}
	public void rush() {
		System.out.println("nobenders can run using their legs");
	}
	
}