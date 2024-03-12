package behaviors;
import interfaces.iattackbehavior;
import interfaces.irushbehavior;

public class earthbending implements iattackbehavior,irushbehavior{
	public void attack() {
		System.out.println("crrRACck rocks here and there avalanche!!");
	}
	public void rush() {
		System.out.println("earthbenders impulse themselves by lifting the ground really hard");
	}
	
}