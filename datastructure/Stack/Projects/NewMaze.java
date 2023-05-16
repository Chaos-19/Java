/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.Stack.Projects;

import static datastructure.Stack.Projects.MazeSolver.stack;
import datastructure.Stack.Stack;

/**
 *
 * @author GAEDC
 */
public class NewMaze {

    static Stack<Position> stack = new Stack<>();
    static int[][] maze = {
        {1, 1, 1, 1},
        {1, 0, 0, 1},
        {1, 1, 1, 2}};
    static int x = 0;
    static int y = 0;

    public static void print() {
    }

    public static void main(String[] args) throws InterruptedException {

        Position position = new Position(0, 1);
        stack.push(position);

        Down d = new Down();
        Up u = new Up();
        Right r = new Right();
        Left l = new Left();

       // while (true) {
            x = stack.peek().x;
            y = stack.peek().y;

            maze[x][y] = 0;

            d.start();
          
            l.start();
      
            r.start();
         
            u.start();
         

            stack.pop();
            System.out.println("Move back ");
//            if (stack.isEmpty()) {
//                System.out.println("No Path ");
//                return;
//            }

      //  }
    }

    private static boolean isValideMove(int x, int y) {

        return (x >= 0 && x < 3) && (y >= 0 && y < maze[x].length);
    }

    static class Down extends Thread {

        @Override
        public void run() {
            x = stack.peek().x;
            y = stack.peek().y;

            maze[x][y] = 0;

            //Move Down
            if (isValideMove(x + 1, y)) {
                if (maze[x + 1][y] == 2) {
                    System.out.println("You moved down and Won !!");
                    return;
                } else if (maze[x + 1][y] == 1) {
                    System.out.println("You moved down");
                    stack.push(new Position(x + 1, y));

                }
            }
        }

    }

    static class Up extends Thread {

        @Override
        public void run() {

            x = stack.peek().x;
            y = stack.peek().y;

            maze[x][y] = 0;

            //Move Down
            if (isValideMove(x - 1, y)) {
                if (maze[x - 1][y] == 2) {
                    System.out.println("You moved Up and Won !!");
                    return;
                } else if (maze[x - 1][y] == 1) {
                    System.out.println("You moved Up");
                    stack.push(new Position(x - 1, y));
                }
            }
        }

    }

    static class Right extends Thread {

        @Override
        public void run() {

            x = stack.peek().x;
            y = stack.peek().y;

            maze[x][y] = 0;

            //Move Right
            if (isValideMove(x, y - 1)) {
                if (maze[x][y - 1] == 2) {
                    System.out.println("You moved Left and Won !!");
                    return;
                } else if (maze[x][y - 1] == 1) {
                    System.out.println("You moved Left");
                    stack.push(new Position(x, y - 1));
                }
            }

        }

    }

    static class Left extends Thread {

        @Override
        public void run() {

            x = stack.peek().x;
            y = stack.peek().y;

            maze[x][y] = 0;

            //Move left
            if (isValideMove(x, y + 1)) {
                if (maze[x][y + 1] == 2) {
                    System.out.println("You moved Right and Won !!");
                    return;
                } else if (maze[x][y + 1] == 1) {
                    System.out.println("You moved Right");
                    stack.push(new Position(x, y + 1));

                }
            }

        }

    }

}
