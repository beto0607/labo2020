package laboratorio.strategies;

import laboratorio.LaboRobotG30;

/**
 * Just an empty strategy, it doesn't do anything
 */
public class EmptyStrategy extends RoboStrategy {

    public EmptyStrategy(LaboRobotG30 laboRobotG30) {
        super(laboRobotG30);
    }

    @Override
    public void run() {

    }

}
