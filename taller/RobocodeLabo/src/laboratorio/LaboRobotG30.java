package laboratorio;

import laboratorio.strategies.*;
import laboratorio.strategist.MasterStrategist;
import robocode.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html


public class LaboRobotG30 extends JuniorRobot {
    private IRoboStrategy strategy;
    private final MasterStrategist masterStrategist = MasterStrategist.instance;

    public LaboRobotG30() {
        this.strategy = this.masterStrategist.getStrategy();
    }

    @Override
    public void run() {
        setColors(orange, blue, white, yellow, black);
        this.masterStrategist.run();
        this.strategy = this.masterStrategist.getStrategy();
        this.strategy.run();
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    @Override
    public void onScannedRobot() {
        this.masterStrategist.onScannedRobot();
        this.strategy.onScannedRobot();
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    @Override
    public void onHitByBullet() {
        this.masterStrategist.onHitByBullet();
        this.strategy.onHitByBullet();
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    @Override
    public void onHitWall() {
        this.masterStrategist.onHitWall();
        this.strategy.onHitWall();
    }
}