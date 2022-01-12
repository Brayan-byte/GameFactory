package factory;

public class Koopa implements IBasicEnemy {
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Koopa spin to mario");
		
	}

	@Override
	public void jump() {
		System.out.println("Koopa jump to mario");
		
	}

	@Override
	public void life() {
		System.out.println("Koopa has 5 lifes");		
	}

}
