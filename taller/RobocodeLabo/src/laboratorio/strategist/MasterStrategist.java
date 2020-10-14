package laboratorio.strategist;

import laboratorio.LaboRobotG30;
import laboratorio.strategies.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MasterStrategist implements IStrategist {
    protected LaboRobotG30 robot;
    private IStrategist currentStrategist;
    private List<IStrategist> strategists;

    public static final IStrategist instance = new MasterStrategist();

    private  MasterStrategist(LaboRobotG30 robot){

    }
    public static IStrategist getInstance(){return MasterStrategist.instance;}
    public MasterStrategist(LaboRobotG30 robot) {
        this.robot = robot;
        this.currentStrategist = new StandByStrategist(this.robot);
        this.setMainStrategist();
    }

    public void setMainStrategist() {
        this.strategists = Arrays.asList(
                this.currentStrategist,
                new DefensiveStrategist(this.robot),
                new AggressiveStrategist(this.robot)
        );
    }

    public void addStrategist(IStrategist iStrategist) {
        this.strategists.add(iStrategist);
    }

    @Override
    public IRoboStrategy getStrategy() {
        return this.currentStrategist.getStrategy();
    }

    @Override
    public void run() {
        strategists.forEach(IStrategist::run);
        Collections.sort(strategists);
        this.currentStrategist = strategists.get(0);
    }

    @Override
    public void onHitByBullet() {
        strategists.forEach(IStrategist::onHitByBullet);
    }

    @Override
    public void onHitRobot() {
        strategists.forEach(IStrategist::onHitRobot);

    }

    @Override
    public void onHitWall() {
        strategists.forEach(IStrategist::onHitWall);
    }

    @Override
    public void onScannedRobot() {
        strategists.forEach(IStrategist::onScannedRobot);

    }

    @Override
    public int compareTo(IStrategist iStrategist) {
        return 0;
    }

    @Override
    public int getScore() {
        return 0;
    }

    // Base class for Strategists. It adds an array of strategies and a score
    // The field score should change every time that the strategist think
    public abstract static class Strategist implements IStrategist {
        protected LaboRobotG30 robot;

        protected IRoboStrategy[] strategies;
        protected IRoboStrategy currentStrategy;
        protected int score = 0;

        public Strategist(LaboRobotG30 robot) {
            this.robot = robot;
        }

        @Override
        public int compareTo(IStrategist iStrategist) {
            return this.getScore() - iStrategist.getScore();
        }

        @Override
        public int getScore() {
            return this.score;
        }
    }

    // This Strategist only returns one strategy and its score is fixed
    public static class StandByStrategist extends Strategist {
        public StandByStrategist(LaboRobotG30 robot) {
            super(robot);
            this.currentStrategy = new EmptyStrategy(this.robot);
            this.score = 50;
        }

        @Override
        public IRoboStrategy getStrategy() {
            return this.currentStrategy;
        }

        @Override
        public void run() {
        }

        @Override
        public void onHitByBullet() {
        }

        @Override
        public void onHitRobot() {
        }

        @Override
        public void onHitWall() {
        }

        @Override
        public void onScannedRobot() {

        }

    }

    public static class AggressiveStrategist extends Strategist {
        public AggressiveStrategist(LaboRobotG30 robot) {
            super(robot);
            this.currentStrategy = new AggresiveStrategy(this.robot);
            strategies = new IRoboStrategy[]{
                    this.currentStrategy,
                    new RunStrategy(this.robot),
            };
        }

        @Override
        public IRoboStrategy getStrategy() {
            return this.currentStrategy;
        }

        @Override
        public void run() {

        }

        @Override
        public void onHitByBullet() {
            if (this.robot.energy < 20) {
                this.currentStrategy = this.strategies[1];
            } else {
                this.currentStrategy = this.strategies[0];
            }
        }

        @Override
        public void onHitRobot() {
            if (this.robot.energy < 20) {
                this.currentStrategy = this.strategies[1];
            } else {
                this.currentStrategy = this.strategies[0];
            }
        }

        @Override
        public void onHitWall() {

        }

        @Override
        public void onScannedRobot() {

        }

    }

    public static class DefensiveStrategist extends Strategist {
        public DefensiveStrategist(LaboRobotG30 robot) {
            super(robot);
            this.currentStrategy = new DefensiveStrategy(this.robot);
            strategies = new IRoboStrategy[]{
                    this.currentStrategy,
                    new RunStrategy(this.robot)
            };
        }

        @Override
        public IRoboStrategy getStrategy() {
            return this.currentStrategy;
        }

        @Override
        public void run() {

        }

        @Override
        public void onHitByBullet() {

        }

        @Override
        public void onHitRobot() {

        }

        @Override
        public void onHitWall() {

        }

        @Override
        public void onScannedRobot() {

        }

    }
}
