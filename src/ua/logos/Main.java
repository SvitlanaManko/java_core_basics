package ua.logos;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        coffeeRobot.work();
        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();
        RobotCooker robotCooker = new RobotCooker();
        robotCooker.work();

        Robot[] robots = new Robot[4];
        robots[0] = robot;
        robots[1] = coffeeRobot;
        robots[2] = robotDancer;
        robots[3] = robotCooker;

        for (Robot r : robots) {
            r.work();
        }
    }
}
