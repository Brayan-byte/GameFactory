package factory;

public class BasicEnemy implements abstractEnemy{
	@Override
	public IBasicEnemy getBasicEnemy(String s) {
		if(s == "Goomba") {
			return new Goomba();
		}
		if(s == "Boo") {
			return new Boo();
		}
		if(s == "Koopa") {
			return new Koopa();
		}

		return null;
	}

	@Override
	public IBossEnemy getBossEnemy(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
