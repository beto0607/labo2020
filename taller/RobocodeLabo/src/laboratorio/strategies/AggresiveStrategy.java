package laboratorio.strategies;

import laboratorio.LaboRobotG30;
/**
 * The peculiarity of this strategy is that doubles the power every time the robot gets git
 * */
public class AggresiveStrategy extends RoboStrategy {
    private  int power = 1;
    private  double closestRobotDistance = 100000;

    public AggresiveStrategy(LaboRobotG30 laboRobotG30) {
        super(laboRobotG30);
    }

    @Override
    public void run() {
        this.laboRobotG30.ahead(100);
        this.laboRobotG30.turnRight(30);
        this.laboRobotG30.ahead(100);
        this.laboRobotG30.turnRight(30);
    }

    @Override
    public void onScannedRobot() {
        if(this.laboRobotG30.scannedDistance < this.closestRobotDistance){
            this.closestRobotDistance = this.laboRobotG30.scannedDistance;
            this.laboRobotG30.turnGunTo(this.laboRobotG30.scannedAngle);
            this.laboRobotG30.fire(this.power);
        }
    }
    @Override
    public void onHitByBullet() {
        this.power *= 2;
        if(this.power > this.laboRobotG30.energy ){
            this.power = this.laboRobotG30.energy/2;
        }
    }

    @Override
    public void onHitWall() {
        this.laboRobotG30.turnRight(180);
    }
}
