package abstracts;
import interfaces.iattackbehavior;
import interfaces.irushbehavior;

public abstract class avatar {
	public iattackbehavior attackbehavior1;
	public irushbehavior rushbehavior1;
	public iattackbehavior attackbehavior2;
	public irushbehavior rushbehavior2;
	public iattackbehavior attackbehavior3;
	public irushbehavior rushbehavior3;
	public iattackbehavior attackbehavior4;
	public irushbehavior rushbehavior4;
	public avatar() {}
	public abstract void display();

	public void performattack(){
		attackbehavior1.attack();
		attackbehavior2.attack();
		attackbehavior3.attack();
		attackbehavior4.attack();
	}
	
	public void walk() {
		System.out.println("hi this is walking");
	}
	
	public void performrush(){
		rushbehavior4.rush();
	}
	
}
