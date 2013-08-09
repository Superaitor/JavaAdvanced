import java.awt.Color;
import java.awt.Graphics;


public class player {
	int x;
	int y;
	int xv;
	int yv;
	
	public player(int startx,int starty) {
		x = startx;
		y = starty;
		
	}
	
	public void setVelocity(int xvelocity, int yvelocity) {
		xv = xvelocity;
		yv = yvelocity;
	}
	
	public void move () {
		x = x + xv;
		if ( x > 490){
			x = 490;
		}
		if(x < 10) {
			x = 10;
		}
		y = y + yv;
		if (y > 490) {
			y = 490;
		}
		if (y < 10){
			y = 10;
		}
		
		
		
	}
	public void paintPlayer(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x - 10 , y -10 , 20, 20);

}

	public void keyPressed(String Key)  {
		if (Key.equals("left")) {
			xv = -5;
			}
		if (Key.equals("right")) {
			xv = 5;
		}
		if (Key.equals("up")) {
			yv = -5;
		}
		if (Key.equals("down")) {
			yv = 5;
		}
			
	}
	
	public void KeyReleased(String Key) {
		if (Key.equals("left")) {
			xv = 0;
			}
		if (Key.equals("right")) {
			xv = 0;
		}
		if (Key.equals("up")) {
			yv = 0;
		}
		if (Key.equals("down")) {
			yv = 0;
		}
	}
	public void moveEnemies() {
		for (int i = 0 ; i < enemies.size() ; i ++) {
		}
		}
	
}
