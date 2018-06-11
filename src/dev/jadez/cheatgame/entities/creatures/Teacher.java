package dev.jadez.cheatgame.entities.creatures;


import java.awt.Graphics;
import java.awt.Polygon;

import dev.jadez.cheatgame.Game;
import dev.jadez.cheatgame.gfx.Assets;

public class Teacher extends Creature{
	
	public Scan scan;
	public Game game;
	int move_amount = 1;
	
	public Teacher(Game game, float x, float y, int width, int height,
				float scanHeight,double theta) {
		super(x, y, width, height);
		scan = new Scan(game, scanHeight, theta, (int)x + width / 2, (int)y + height / 2);
		this.game = game;
	}	

	public Polygon getpoly()
	{
		return scan.poly;
	}
	
	@Override
	public void tick() {
		
		//new
		if(game.stateNumber == 1) {
			if(game.delta >= 1) {
			//x += move_amount;
			//if(x > 500 || x < 100)
				//move_amount *= -1;		
		}
		
		scan.tick((int)x + width / 2, (int)y + height / 2);//plus extra offset to 
														   //make sure the vertex of
														   //triangle is at the center
															//of the teacher	
		}
		
		else if(game.stateNumber == 2) {
			if(game.delta >= 1) {
				y += move_amount;
				if(y > 500 || y < 180)
					move_amount *= -1;		
			}
			
			scan.tick((int)x + width / 2, (int)y + height / 2);
			
		}
		else if(game.stateNumber == 3) {
			if(game.delta >= 1) {
				y += move_amount;
				if(y > 500 || y < 100)
					move_amount *= -1;		
			}
			
			scan.tick((int)x + width / 2, (int)y + height / 2);
			
		}
		else if(game.stateNumber == 4) {
			if(game.delta >= 1) {
				y += move_amount;
				if(y > 500 || y < 100)
					move_amount *= -1;		
			}
			
			scan.tick((int)x + width / 2, (int)y + height / 2);
			
		}

	}
	@Override	
	public void render(Graphics g) {
		scan.render(g);
		g.drawImage(Assets.teacher, (int) x, (int) y, null);
	}

}
