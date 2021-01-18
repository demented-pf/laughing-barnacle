package Math;

public class WalkingRobotSimulation {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        int direction = 0;

        for (int i = 0; i < commands.length; i++) {
            System.out.println("taco");
            if (commands[i] == -1) direction += 90;
            else if (commands[i] == -2) direction -= 90;

            else if (direction == 0){
                // Y ++
                boolean obstacle = false;
                for (int j = 0; i <= commands[i]; i++) {
                    y ++;
                    for (int k = 0; k < obstacles.length; k++) {
                        if (obstacles[k][0] == x && obstacles[k][1] == y){
                            obstacle = true;
                            break;
                        }
                    }
                    if (obstacle){
                        y --;
                        break;
                    }
                }
            }
            else if (direction == 90){
                // X ++
                boolean obstacle = false;
                for (int j = 0; i <= commands[i]; i++) {
                    x ++;
                    for (int k = 0; k < obstacles.length; k++) {
                        if (obstacles[k][0] == x && obstacles[k][1] == y){
                            obstacle = true;
                            break;
                        }
                    }
                    if (obstacle){
                        x --;
                        break;
                    }
                }
            }
            else if (direction == 180){
                // Y--
                boolean obstacle = false;
                for (int j = 0; i <= commands[i]; i++) {
                    y --;
                    for (int k = 0; k < obstacles.length; k++) {
                        if (obstacles[k][0] == x && obstacles[k][1] == y){
                            obstacle = true;
                            break;
                        }
                    }
                    if (obstacle){
                        y ++;
                        break;
                    }
                }
            }
            else if (direction == 270){
                // X --
                boolean obstacle = false;
                for (int j = 0; i <= commands[i]; i++) {
                    x --;
                    for (int k = 0; k < obstacles.length; k++) {
                        if (obstacles[k][0] == x && obstacles[k][1] == y){
                            obstacle = true;
                            break;
                        }
                    }
                    if (obstacle){
                        x ++;
                        break;
                    }
                }
            }
        }
        return (x * x) + (y * y);
    }
}
