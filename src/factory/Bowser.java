package factory;

public class Bowser implements IBossEnemy{

	@Override
	public void attackSpecial() {
		System.out.println("Bowser Attack mario with a special move fireball");
		
	}

	@Override
	public void jumpAndKick() {
		System.out.println("Bowser Attack mario with a jump and one kick");
		
	}

	@Override
	public void exp() {
		System.out.println("Bowser Gave mario 150exp");		
	}

}
