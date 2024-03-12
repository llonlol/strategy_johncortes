package abstracts;
import interfaces.iattackbehavior;
import interfaces.irushbehavior;

public abstract class warrior {
	public iattackbehavior attackbehavior;
	public irushbehavior rushbehavior;
	public warrior() {}
	public abstract void display();

	public void performattack(){
		attackbehavior.attack();
	}
	
	public void walk() {
		System.out.println("hi this is walking");
	}
	
	public void performrush(){
		rushbehavior.rush();
	}
	
}
