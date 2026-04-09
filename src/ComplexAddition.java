import java.util.Scanner;

class Complex {
    int real;
    int imag;

    // Constructor to initialize the real and imaginary parts
    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add another complex number to the current one
    public Complex add(Complex other) {
        // Result Real = (a + c)
        // Result Imaginary = (b + d)
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    // Display method to match the required output format "a + bi"
    public void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first complex number
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

        // Input for second complex number
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

        // Perform addition
        Complex sum = c1.add(c2);

        // Output the result
        sum.display();

        sc.close();
    }
}
