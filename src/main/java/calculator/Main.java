package calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(10, 5));

        System.out.println("Subtraktion: " + calc.sub(10, 5));

        System.out.println("Multiplikation: " + calc.mul(10, 5));

        System.out.println("Division: " + calc.div(10, 5));

        System.out.println("Modulo: " + calc.mod(10, 3));
    }
}