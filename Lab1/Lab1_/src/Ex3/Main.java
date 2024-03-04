package Ex3;

import java.util.Random;

public class Main
{
    static void bubbleSort(int array[])
        {
            int size = array.length;

            for (int i = 0; i < size - 1; i++)
                for (int j = 0; j < size - i - 1; j++)
                    if (array[j] > array[j + 1])
                    {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
        }
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] a = new int[10];

        for(int i = 0; i < 10; i++)
            a[i] = random.nextInt(100);

        bubbleSort(a);

        for(int i = 0; i < 10; i++)
            System.out.print(a[i] + " ");


    }

}
