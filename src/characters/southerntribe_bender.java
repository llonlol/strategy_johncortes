package characters;
import abstracts.warrior;
import behaviors.waterbending;

public class southerntribe_bender extends warrior{
	public southerntribe_bender() {
		attackbehavior=new waterbending();
		rushbehavior=new waterbending();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}
