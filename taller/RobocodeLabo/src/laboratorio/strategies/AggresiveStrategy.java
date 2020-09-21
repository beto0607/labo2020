package laboratorio.strategies;

import laboratorio.LaboRobot;
/**
 * The peculiarity of this strategy is that doubles the power every time the robot gets git
 * */
public class AggresiveStrategy extends RoboStrategy {
    private  int power = 1;
    private  double closestRobotDistance = 100000;

    public AggresiveStrategy(LaboRobot laboRobot) {
        super(laboRobot);
    }

    @Override
    public void run() {
        while (true) {
            this.laboRobot.ahead(100);
            this.laboRobot.turnRight(30);
            this.laboRobot.ahead(100);
            this.laboRobot.turnRight(30);
        }
    }

    @Override
    public void onScannedRobot() {
        if(this.laboRobot.scannedDistance < this.closestRobotDistance){
            this.closestRobotDistance = this.laboRobot.scannedDistance;
            this.laboRobot.turnGunTo(this.laboRobot.scannedAngle);
            this.laboRobot.fire(this.power);
        }
    }
    @Override
    public void onHitByBullet() {
        this.power *= 2;
        if(this.power > this.laboRobot.energy ){
            this.power = this.laboRobot.energy/2;
        }
    }

    @Override
    public void onHitWall() {
        this.laboRobot.turnRight(180);
    }
}
