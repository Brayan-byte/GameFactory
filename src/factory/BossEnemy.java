package factory;

public class BossEnemy implements abstractEnemy{
	
	@Override
	public IBossEnemy getBossEnemy(String s) {
		if(s == "Bowser") {
			return new Bowser();
		}
		return null;
	}

	@Override
	public IBasicEnemy getBasicEnemy(String s) {
		// TODO Auto-generated method stub
		return null;
	}
}
