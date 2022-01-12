package factory;

public class EnemyFactory {
	public static abstractEnemy getTypeEnemy(String s) {
		
		if(s == "Boss") {
			return new BossEnemy();
		}
		if(s == "BasicEnemy") {
			return new BasicEnemy(); 
		}
		return null;
		
	}
}
