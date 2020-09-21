package laboratorio;
import laboratorio.strategies.*;
import robocode.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html


public class LaboRobot extends JuniorRobot
{
	private RoboStrategy strategy = new DefaultStrategy(this);

	public  LaboRobot(){
		this.strategy = new AggresiveStrategy(this);
	}

	@Override	
	public void run() {

		setColors(orange, blue, white, yellow, black);
		this.strategy.run();
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		this.strategy.onScannedRobot();
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		this.strategy.onHitByBullet();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		this.strategy.onHitWall();
	}	
}