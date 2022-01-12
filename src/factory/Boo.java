package factory;

public class Boo implements IBasicEnemy {
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Boo Scare mario");
		
	}

	@Override
	public void jump() {
		System.out.println("Boo Fly to mario");
		
	}

	@Override
	public void life() {
		System.out.println("Boo has 0 lifes");		
	}
}
