package laboratorio.strategies;

public interface IRoboStrategy {
    void run();

    // Runs when the robot is hit by a bullet
    void onHitByBullet();

    // Runs when the robot hit another robot
    void onHitRobot();

    // Runs when the robot hit a wall
    void onHitWall();

    // Runs when the robot scanned another robot
    void onScannedRobot();
}
