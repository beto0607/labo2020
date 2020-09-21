package laboratorio.strategies;

import laboratorio.LaboRobot;

public class DefaultStrategy extends RoboStrategy{

    public DefaultStrategy(LaboRobot laboRobot) {
        super(laboRobot);
    }

    @Override
    public void run() {
        this.laboRobot.ahead(100);
        this.laboRobot.turnGunRight(360);
        this.laboRobot.back(100);
        this.laboRobot.turnGunRight(360);
    }
    @Override
    public void onScannedRobot() {
        this.laboRobot.fire(10);
    }
    @Override
    public void onHitByBullet() {
        this.laboRobot.back(10);
    }
    @Override
    public void onHitWall() {
        this.laboRobot.back(20);
    }
}
