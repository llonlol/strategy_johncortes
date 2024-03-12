package behaviors;
import interfaces.iattackbehavior;
import interfaces.irushbehavior;

public class firebending implements iattackbehavior,irushbehavior{
	@Override
	public void attack() {
		System.out.println("pfroooom firefirefire firefist kick tornado of fire");
	}
	public void rush() {
		System.out.println("firebenders can impulse themselves using fire to fly");
	}
	
}