package factory;

public class main {

	public static void main(String[] args) {
		
		abstractEnemy EnemyFabricBoss = EnemyFactory.getTypeEnemy("Boss");
		IBossEnemy Boss = EnemyFabricBoss.getBossEnemy("Bowser");
		Boss.attackSpecial();
		Boss.jumpAndKick();
		Boss.exp();
		
		
		abstractEnemy EnemyFabricBasic= EnemyFactory.getTypeEnemy("BasicEnemy");
		IBasicEnemy enemy = EnemyFabricBasic.getBasicEnemy("Koopa");
		enemy.attack();
		enemy.jump();
		enemy.life();
		


	}

}
