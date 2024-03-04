package Ex1;

public class ComplexNumber
{
    int A;
    int B;

    public void add(ComplexNumber a, ComplexNumber b)
    {
        System.out.println((a.A + b.A) + "i" + (a.B + b.B));
    }

    public void substract(ComplexNumber a, ComplexNumber b)
    {
        System.out.println((a.A - b.A) + "i" + (a.B - b.B));
    }

    public void multiply(ComplexNumber a, ComplexNumber b)
    {
        System.out.println((a.A * b.A - a.B * b.B) + "i" + (a.A * b.B + a.B * b.A));
    }
}
