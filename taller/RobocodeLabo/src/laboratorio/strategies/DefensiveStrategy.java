package laboratorio.strategies;

import laboratorio.LaboRobotG30;

public class DefensiveStrategy extends RoboStrategy {

    private int power = 2;

    public DefensiveStrategy(LaboRobotG30 laboRobotG30) {
        super(laboRobotG30);
    }

    @Override
    public void run() {
        this.laboRobotG30.turnTo(this.laboRobotG30.scannedAngle + 180);
        this.laboRobotG30.fire(this.power);
    }
}
