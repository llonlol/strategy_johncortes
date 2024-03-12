package characters;
import abstracts.avatar;
import behaviors.earthbending;
import behaviors.firebending;
import behaviors.waterbending;
import behaviors.airbending;

public class theavatar extends avatar{
	public theavatar() {
		attackbehavior2=new firebending();
		attackbehavior1=new waterbending();
		attackbehavior3=new earthbending();
		attackbehavior4=new airbending();
		rushbehavior4=new airbending();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
	
}
