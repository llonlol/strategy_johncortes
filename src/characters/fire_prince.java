package characters;
import abstracts.warrior;
import behaviors.firebending;

public class fire_prince extends warrior{
	public fire_prince() {
		attackbehavior=new firebending();
		rushbehavior=new firebending();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}
