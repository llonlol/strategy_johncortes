package behaviors;
import interfaces.iattackbehavior;
import interfaces.irushbehavior;

public class waterbending implements iattackbehavior,irushbehavior{
	public void attack() {
		System.out.println("wooosh splash splash waterblade");
	}
	public void rush() {
		System.out.println("waterbenders can turn water into ice so they can skate on it");
	}
}

