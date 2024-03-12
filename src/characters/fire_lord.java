package characters;
import abstracts.warrior;
import behaviors.firebending;

public class fire_lord extends warrior{
	public fire_lord() {
		attackbehavior=new firebending();
		rushbehavior=new firebending();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}
