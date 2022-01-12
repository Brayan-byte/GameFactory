package factory;

public class Goomba implements IBasicEnemy {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Goomba attack mario");
		
	}

	@Override
	public void jump() {
		System.out.println("Goomba Jump to mario");
		
	}

	@Override
	public void life() {
		System.out.println("Goomba has 3 lifes");		
	}

}
