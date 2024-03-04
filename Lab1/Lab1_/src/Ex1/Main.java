package Ex1;

import Ex1.ComplexNumber;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ComplexNumber a = new ComplexNumber();
        ComplexNumber b = new ComplexNumber();

        int end_condition = 100;

        while(end_condition != -1)
        {
            System.out.println("Insert the real part of the first number.");

            a.A = Integer.parseInt(s.nextLine());

            System.out.println("Insert the imaginary part of the first number.");

            a.B = Integer.parseInt(s.nextLine());

            System.out.println("Insert the real part of the second number.");

            b.A = Integer.parseInt(s.nextLine());

            System.out.println("Insert the imaginary part of the second number.");

            b.B = Integer.parseInt(s.nextLine());

            System.out.println(a.A + "i" + a.B);
            System.out.println(b.A + "i" + b.B);

            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for substraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 to type new numbers");
            System.out.println("Press 0 to terminate the program");

            end_condition = Integer.parseInt(s.nextLine());

            switch (end_condition)
            {
                case 1:
                    a.add(a, b);
                    break;

                case 2:
                    a.substract(a,b);
                    break;

                case 3:
                    a.multiply(a,b);
                    break;

                case 4:
                    a.A = 0;
                    a.B = 0;
                    b.A = 0;
                    b.B = 0;
                    break;

                case 0:
                    end_condition = -1;
                    break;

                default:
                    System.out.println("Wrong key!");
            }
        }

    }
}