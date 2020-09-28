package laboratorio.strategist;

import laboratorio.strategies.IRoboStrategy;

public interface IStrategist extends Comparable<IStrategist> {
    // Returns an strategy depending on the current state
    IRoboStrategy getStrategy();

    // Main loop
    void run();

    // Runs when the robot gets hit by a bullet
    void onHitByBullet();

    // Runs when the robot hit another robot
    void onHitRobot();

    // Runs when the robot hit a wall
    void onHitWall();

    // Runs when the robot scanned another robot
    void onScannedRobot();

    // Returns the current score
    int getScore();
}
