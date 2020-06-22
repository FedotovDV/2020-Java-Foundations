package core.lesson3;

public class RobotRunner {

//    На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y - снизу вверх. (Помните, как рисовали графики функций в школе?
//    В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
//  Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):

    public static void main(String[] args) {
        Robot robot = new Robot(-10, -4, Direction.DOWN);
        moveRobot(robot, -5, -20);
        System.out.println("robot.getY() = " + robot.getY());
        System.out.println("robot.getX() = " + robot.getX());
        System.out.println("robot.getDirection() = " + robot.getDirection());
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int countTurnLeft = 0;
        int countTurnRigth = 0;

        if (robot.getY() > toY) {
            if (robot.getDirection() != Direction.DOWN) {
                if (robot.getDirection() == Direction.LEFT) {
                    countTurnLeft = 1;
                } else if (robot.getDirection() == Direction.UP) {
                    countTurnRigth = 2;
                } else {
                    countTurnRigth = 1;
                }
            }
        } else {
            if (robot.getDirection() != Direction.UP) {
                if (robot.getDirection() == Direction.RIGHT) {
                    countTurnLeft = 1;
                } else if (robot.getDirection() == Direction.DOWN) {
                    countTurnRigth = 2;
                } else {
                    countTurnRigth = 1;
                }
            }
        }

        for (int i = 0; i < countTurnLeft; i++) {
            robot.turnLeft();
        }
        for (int j = 0; j < countTurnRigth; j++) {
            robot.turnRight();
        }
        int countStepY = Math.abs(robot.getY() - toY);
        for (int k = 0; k < countStepY; k++) {
            robot.stepForward();
        }
        countTurnLeft = 0;
        countTurnRigth = 0;
        if (robot.getX() > toX) {
            if (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection() == Direction.UP) {
                    countTurnLeft = 1;
                } else if (robot.getDirection() == Direction.RIGHT) {
                    countTurnRigth = 2;
                } else {
                    countTurnRigth = 1;
                }
            }
        } else {
            if (robot.getDirection() != Direction.RIGHT) {
                if (robot.getDirection() == Direction.DOWN) {
                    countTurnLeft = 1;
                } else if (robot.getDirection() == Direction.LEFT) {
                    countTurnRigth = 2;
                } else {
                    countTurnRigth = 1;
                }
            }
        }

        for (int i = 0; i < countTurnLeft; i++) {
            robot.turnLeft();
        }
        for (int j = 0; j < countTurnRigth; j++) {
            robot.turnRight();
        }
        int countStepX = Math.abs(robot.getX() - toX);
        for (int k = 0; k < countStepX; k++) {
            robot.stepForward();
        }

    }
}