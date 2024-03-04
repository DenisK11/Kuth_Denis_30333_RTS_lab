package Ex2;

public class MatrixOperations
{
    int[][] A = new int[10][10];
    int[][] B = new int[10][10];

    public int[][] add(int[][] A, int[][] B)
    {
        int i = 0;
        int j = 0;
        int[][] C = new int[A.length][A.length];

        for (i = 0; i < A.length; i++)
            for (j = 0; j < A[0].length; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    public int[][] multiply(int[][] A, int[][] B)
    {
        int[][] C = new int[A.length][A.length];
        int i = 0;
        int j = 0;
        int x = 0;
        int k = 0;

        for(i = 0; i < A.length; i++)
            for(j = 0; j < A.length; j++)
                C[i][j] = 0;

        if(A.length == A[0].length && B.length == B[0].length && A.length == B.length)
            for(k = 0; k < A.length; k++)
                for(i = 0; i < A.length; i++)
                {
                    x = 0;
                    for (j = 0; j < A.length; j++)
                        x = x + A[k][j] * B[j][i];
                    C[k][i] = x;
                }


        return C;
    }
}