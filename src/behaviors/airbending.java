package behaviors;
import interfaces.iattackbehavior;
import interfaces.irushbehavior;

public class airbending implements iattackbehavior,irushbehavior{
	public void attack() {
		System.out.println("fuushhh wooosh airpunching you in the face");
	}
	public void rush() {
		System.out.println("airbenders can run at the speed of the wind");
	}
	
}