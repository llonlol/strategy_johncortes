package characters;
import abstracts.warrior;
import behaviors.nobending;

public class kioshi_warrior extends warrior{
	public kioshi_warrior() {
		attackbehavior=new nobending();
		rushbehavior=new nobending();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}
