package core.lesson4.RobotMove;

public class RobotRunner {

    public static void main(String[] args) {
        try {
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(3, 3, false, 1);
            moveRobot(rcm, 2, 2);
        } catch (Exception r) {
            System.out.println("TEST #1 " + ((r.getMessage().equals("MOVE EXCEPTION")) ? "PASS" : "FAILED WITH " + r.getMessage()));
        }

        try {
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(0, 0, false, 0);
            moveRobot(rcm, 2, 2);
            System.out.println("TEST #2 PASS");
        } catch (RobotConnectionException r) {
            System.out.println("TEST #2 FAILED WITH " + r.getMessage());
        }

        try {
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(2, 0, false, 0);
            moveRobot(rcm, 2, 2);
            System.out.println("TEST #3 PASS");
        } catch (Exception r) {
            System.out.println("TEST #3 FAILED WITH " + r.getMessage());
        }

        try {
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(3, 0, false, 0);
            moveRobot(rcm, 2, 2);
        } catch (Exception r) {
            System.out.println("TEST #4 " + ((r.getMessage().equals("MOVE EXCEPTION")) ? "PASS" : "FAILED WITH " + r.getMessage()));
        }

        try {
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(3, 0, true, 0);
            moveRobot(rcm, 2, 2);
        } catch (Exception r) {
            System.out.println("TEST #5 " + ((r.getMessage().equals("ANOTHER EXCEPTION")) ? "PASS" : "FAILED WITH " + r.getMessage()));
        }

        try {
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(2, 5, false, 0);
            moveRobot(rcm, 2, 2);
            System.out.println("TEST #6 PASS");
        } catch (Exception r) {
            System.out.println("TEST #6 FAILED WITH " + r.getMessage());
        }

        try {
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(0, 5, false, 2);
            moveRobot(rcm, 2, 2);
            System.out.println("TEST #7 PASS");
        } catch (Exception r) {
            System.out.println("TEST #7 FAILED WITH " + r.getMessage());
        }

        try {
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(1, 0, false, 2);
            moveRobot(rcm, 2, 2);
        } catch (Exception r) {
            System.out.println("TEST #8 " + ((r.getMessage().equals("MOVE EXCEPTION")) ? "PASS" : "FAILED WITH " + r.getMessage()));
        }

    }
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        int count = 0;
        boolean isRobotMove = false;
        while (!isRobotMove && count < 3) {
            try(RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                 robotConnection.moveRobotTo(toX, toY);
                isRobotMove = true;
            } catch (RobotConnectionException e) {
                count++;
            }
        }
        if (!isRobotMove) {
            throw new RobotConnectionException("MOVE EXCEPTION");
        }
    }

    public static void moveRobot2(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        int count = 0;
        boolean isRobotMove = false;
        RobotConnection robotConnection = null;
        while (!isRobotMove && count < 3) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                isRobotMove = true;
            } catch (RobotConnectionException e) {
                count++;
            } finally {
                if (robotConnection != null) {
                    try {
                        robotConnection.close();
                    } catch (RobotConnectionException ignored) {
                    }
                }
            }
        }
        if (!isRobotMove) {
            throw new RobotConnectionException("MOVE EXCEPTION");
        }
    }


    public static void moveRobot1(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection robotConnection = null;
        int count = 0;
        boolean flag = false;
        while (!flag && count < 3) {
            try {
                try {
                    robotConnection = robotConnectionManager.getConnection();
                    robotConnection.moveRobotTo(toX, toY);
                    flag = true;
                } finally {
                    if (robotConnection != null) {
                        try {
                            robotConnection.close();
                        } catch (RobotConnectionException ignored) {
                        }
                    }
                }
            } catch (RobotConnectionException e) {
                count++;
            }
        }
        if (!flag) {
            throw new RobotConnectionException("MOVE EXCEPTION");
        }
    }
}

