package backTracking;

import java.util.Arrays;

public class Q_6 {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);

    }
    /*
    Recursive Calls and Conditions
            The function allPathPrint is designed to explore all possible paths in a maze from a starting point (r, c)
             to the bottom-right corner of the maze.
             Let's go through the recursive calls and conditions step by step.
     */
    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
            /*
            Condition: r == maze.length - 1 && c == maze[0].length - 1
                Action: If the current cell (r, c) is the bottom-right corner of the maze,
                we have reached the destination.
                The function prints the path taken and the steps array, then returns.
             */
        }

        if (!maze[r][c]) {
            return;
            /*
            Condition: !maze[r][c]
                Action: If the current cell (r, c) is blocked (i.e., false),
                the function returns immediately, as we cannot proceed from this cell.
             */
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        /*
        Action: Mark the current cell (r, c) as visited by setting maze[r][c] to false and record the step number in the path array.
         */

//        Recursive Calls: Move in Four Directions
//        1.)Move Down:
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r+1, c, path, step+1);
            /*
            Condition: r < maze.length - 1
            Action: If the current row r is less than the last row of the maze, recursively call allPathPrint to move down one cell (r + 1, c),
             appending 'D' to the path and incrementing the step count.
             */
        }
//          Move Right:
        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
//            Condition: c < maze[0].length - 1
//Action: If the current column c is less than the last column of the maze, recursively call allPathPrint to move right one cell (r, c + 1),
// appending 'R' to the path and incrementing the step count.
        }

//         MOve up

        if (r > 0) {
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
//            Action: If the current row r is greater than the first row, recursively call allPathPrint to move up one cell (r - 1, c), appending 'U' to the path and incrementing the step count.
        }
// move left
        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
//            Condition: c > 0
//Action: If the current column c is greater than the first column, recursively call allPathPrint to move left one cell (r, c - 1), appending 'L' to the path and incrementing the step count.
//Backtracking
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function

//        Backtraking
        maze[r][c] = true;
        path[r][c] = 0;
//        Action: Before the function returns, it unmarks the cell (r, c) as visited by setting maze[r][c] back to true and resets the step count in the path array to 0. This ensures that the cell can be reused in other potential paths.

        /*
        Summary
Base Case: When the destination is reached, print the path and steps.
Blocked Cell Check: If the cell is blocked, return immediately.
Marking and Recording: Mark the cell as visited and record the step.
Recursive Moves: Explore all possible moves (down, right, up, left) recursively.
Backtracking: Unmark the cell and reset the step before returning to allow for other paths.
This approach ensures that all paths are explored, and backtracking allows the algorithm to find and print all possible paths from the start to the destination.
         */
    }
}
