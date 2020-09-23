package laboratorio.strategies;

import laboratorio.LaboRobotG30;

public class DefaultStrategy extends RoboStrategy{

    public DefaultStrategy(LaboRobotG30 laboRobotG30) {
        super(laboRobotG30);
    }

    @Override
    public void run() {
        this.laboRobotG30.ahead(100);
        this.laboRobotG30.turnGunRight(360);
        this.laboRobotG30.back(100);
        this.laboRobotG30.turnGunRight(360);
    }
    @Override
    public void onScannedRobot() {
        this.laboRobotG30.fire(10);
    }
    @Override
    public void onHitByBullet() {
        this.laboRobotG30.back(10);
    }
    @Override
    public void onHitWall() {
        this.laboRobotG30.back(20);
    }
}
