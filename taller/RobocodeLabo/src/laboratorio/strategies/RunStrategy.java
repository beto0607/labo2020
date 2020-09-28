package laboratorio.strategies;

import laboratorio.LaboRobotG30;

public class RunStrategy extends RoboStrategy {
    public RunStrategy(LaboRobotG30 laboRobotG30) {
        super(laboRobotG30);
    }

    @Override
    public void run() {
        this.laboRobotG30.turnTo(this.laboRobotG30.scannedAngle + 180);
    }
}
