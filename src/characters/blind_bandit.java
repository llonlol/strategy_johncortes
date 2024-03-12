package characters;
import abstracts.warrior;
import behaviors.earthbending;

public class blind_bandit extends warrior{
	public blind_bandit() {
		attackbehavior=new earthbending();
		rushbehavior=new earthbending();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}
