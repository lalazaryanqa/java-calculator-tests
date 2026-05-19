package calculator;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Erste Zahl eingeben");
        int a = sc.nextInt();
        System.out.println("Zweite Zahl eingeben");
        int b = sc.nextInt();
        System.out.println("Operation wählen");

        char operation = sc.next().charAt(0);
        int sum = 0;

        switch (operation) {
            case '+':
                sum = a + b;
                break;
            case '-':
                sum = a - b;
                break;
            case '*':
                sum = a * b;
                break;
            case  '/':
                sum = a / b;
                break;
            case  '%':
                sum = a % b;
                break;
            default:
                System.out.println("Ungültige Operation");

        }
        System.out.println("Ergebnis: " + sum);
    }
}
