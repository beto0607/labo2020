package laboratorio.strategies;

import  laboratorio.*;

/*
* Abstract class for modeling strategies, it contains the signature for the different events handlers
*/
public abstract class RoboStrategy {
    protected LaboRobot laboRobot;
    public RoboStrategy(LaboRobot laboRobot) {
        this.laboRobot = laboRobot;
    }
    // Must be overwritten
    public abstract void run();

    // Runs when the robot is hit by a bullet
    public void onHitByBullet() {
    }
    // Runs when the robot hit another robot
    public void onHitRobot() {
    }
    // Runs when the robot hit a wall
    public void onHitWall() {
    }
    // Runs when the robot scanned another robot
    public void onScannedRobot() {
    }

}
