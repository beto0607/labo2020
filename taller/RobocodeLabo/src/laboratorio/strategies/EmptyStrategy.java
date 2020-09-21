package laboratorio.strategies;

import laboratorio.LaboRobot;

/**
 * Just an empty strategy, it doesn't do anything
 */
public class EmptyStrategy extends RoboStrategy {

    public EmptyStrategy(LaboRobot laboRobot) {
        super(laboRobot);
    }

    @Override
    public void run() {

    }

}
