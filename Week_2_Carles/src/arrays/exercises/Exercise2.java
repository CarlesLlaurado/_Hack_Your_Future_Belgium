package arrays.exercises;

/**
 * Exercise 2: Multi-Dimensional Array
 * TODO:
 * 1. Create a 2x3 array.
 * 2. Assign values.
 * 3. Traverse and print matrix.
 * 4. Calculate sum of elements.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise

        int[][] matrix = {
                {1, 2, 3},
                {2, 3, 4},
                {7, 8, 9}
        };

//        System.out.print(matrix[2][0] + " ");
//        System.out.print(matrix[2][1] + " ");
//        System.out.print(matrix[2][2] + " ");
//
//        System.out.println();
//
//        for (int i = 0; i < 3; i++)
//        {
//            for (int j = 0; j < 3; j++)
//            {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        char[][] chessBoard = new char[8][8];

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (i % 2 == 0)
                {
                    if (j % 2 == 0)
                    {
                        chessBoard[i][j] = '#';
                    }
                    else{
                        chessBoard[i][j] = ' ';
                    }
                }
                else
                {
                    if (j % 2 != 0)
                    {
                        chessBoard[i][j] = '#';
                    }
                    else
                    {
                        chessBoard[i][j] = ' ';
                    }
                }
            }
        }
        for (int q = 0; q < 8; q++) {
            for (int k = 0; k < 8; k++) {
                System.out.print(chessBoard[q][k]);
            }
            System.out.println();
        }
    }

}
