package characters;
import abstracts.warrior;
import behaviors.nobending;

public class southerntribe_warrior extends warrior{
	public southerntribe_warrior() {
		attackbehavior=new nobending();
		rushbehavior=new nobending();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}
