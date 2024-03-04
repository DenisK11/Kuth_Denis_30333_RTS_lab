package Ex2;

import java.util.Scanner;

public class Main
{

    public static void show_matrix(int[][] C)
    {
        for(int i = 0; i < C.length; i++)
        {
            for (int j = 0; j < C[0].length; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {

    int[][] A = {{2, 3, 1}, {7, 1, 6}, {9, 2, 4}};
    int[][] B = {{8, 5, 3}, {3, 9, 2}, {2, 7, 3}};
    int[][] C = new int[3][3];

    MatrixOperations M = new MatrixOperations();

    C = M.add(A, B);

    System.out.println("The addition of the matrices is: ");
    show_matrix(C);

    C = M.multiply(A, B);

    System.out.println("The multiplication of the matrices is: ");
    show_matrix(C);
    }
}