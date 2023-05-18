/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.Stack.Projects;

import datastructure.Stack.Stack;

/**
 *
 * @author GAEDC
 */
public class MazeSolver {

    static Stack<Position> stack = new Stack<>();
    static int[][] maze = {
        {1, 1, 2, 1},
        {1, 0, 0, 1},
        {1, 1, 1, 1}};

    public static void main(String[] args) {

        Position position = new Position(0, 1);
        stack.push(position);
        while (true) {
            int x = stack.peek().x;
            int y = stack.peek().y;

            maze[x][y] = 0;

            //Move Down
            if (isValideMove(x + 1, y)) {
                if (maze[x + 1][y] == 2) {
                    System.out.println("You moved down and Won !!");
                    return;
                } else if (maze[x + 1][y] == 1) {
                    System.out.println("You moved down");
                    stack.push(new Position(x + 1, y));
                    continue;
                }
            }
            //Move Right
            if (isValideMove(x, y - 1)) {
                if (maze[x][y - 1] == 2) {
                    System.out.println("You moved Left and Won !!");
                    return;
                } else if (maze[x][y - 1] == 1) {
                    System.out.println("You moved Left");
                    stack.push(new Position(x, y - 1));
                    continue;
                }
            }

            //Move up
            if (isValideMove(x - 1, y)) {
                if (maze[x - 1][y] == 2) {
                    System.out.println("You moved Up and Won !!");
                    return;
                } else if (maze[x - 1][y] == 1) {
                    System.out.println("You moved Up");
                    stack.push(new Position(x - 1, y));
                    continue;
                }
            }

            //Move left
            if (isValideMove(x, y + 1)) {
                if (maze[x][y + 1] == 2) {
                    System.out.println("You moved Right and Won !!");
                    return;
                } else if (maze[x][y + 1] == 1) {
                    System.out.println("You moved Right");
                    stack.push(new Position(x, y + 1));
                    continue;
                }
            }

            stack.pop();
            System.out.println("Move back ");
            if (stack.isEmpty()) {
                System.out.println("No Path ");
                return;
            }

        }
    }

    private static boolean isValideMove(int x, int y) {

        return (x >= 0 && x < 3) && (y >= 0 && y < maze[x].length);
    }

}
