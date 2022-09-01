package ua.logos.lesson8.task_1;

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

        Robot[] robots = new Robot[]{robot, coffeeRobot, robotDancer, robotCooker};
        for (Robot r : robots) {
            r.work();
        }
    }
}
