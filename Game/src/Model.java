import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class Model {
	int playerX, playerY;
	int playerXV, playerYV;
	int level = 1;
	
	player player;
	ArrayList <Enemy> enemies;
	ArrayList<obstacle> obstacles;


	
	public Model() {
		player = new player( 250, 250);
		
		enemies = new ArrayList <Enemy> ();
		obstacles = new ArrayList <obstacle> ();
		
		enemies.add(new Enemy(200, 300)); 
		enemies.add(new Enemy(400, 100)); 
		enemies.add(new Enemy(450, 400)); 
		enemies.add(new Enemy(250, 600)); 
		enemies.add(new Enemy(156, 345)); 
		enemies.add(new Enemy(123, 123)); 
		obstacles.add(new obstacle(0, 0, 100, 100));
		obstacles.add(new obstacle(0, 200, 50, 300));
	}
	
	public player getPlayer() {
		return player;
	}
	
	public Enemy getEnemy(int index) {
		return enemies.get(index);
		
	}
	
	public obstacle getObstacle(int index) {
		return obstacles.get(index);
	}
	
	public int getEnemyCount() {
		return enemies.size() ;
	}
	public int getObstacleCount(){
		return obstacles.size();
	}
	
	public int getEnemyX(int index) {
		return enemies.get(index).x;
		
	}
	
	public int getEnemyY(int index) {
		return enemies.get(index).y; 
	}
	
	public void setPosition(int x, int y) {
		playerX = x; 
		playerY = y;
	}
	
		
	
	

	public void movePlayer () {
		playerX = playerX  + playerXV;
		if(playerX > 490) {
			playerX = 490;
		
			
		}
		if (playerX < 10) {
			playerX = 10;
		}
		
		playerY = playerY + playerYV;
		if (playerY > 490 ) {
			playerY = 490;
			
		}
		if (playerY < 10) {
			playerY = 10;
		}
	}

}
