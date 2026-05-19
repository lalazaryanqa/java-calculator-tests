/* Projekt: Java Rechner
 * Ziel des Projekts:
 * Entwicklung eines einfachen Taschenrechners mit grundlegenden mathematischen Operationen.

 * Funktionen:
 * - Addition
 * - Subtraktion
 * - Multiplikation
 * - Division

 * Technologien:
 * - Java
 * - Maven
 * - Git & GitHub

 * Ziel:
 * Übung von Java-Grundlagen, OOP und automatisierten Tests.
 */

package calculator;

public class Calculator {
    static void main(String[] args) {

    }

    // Addition
    int add(int a, int b) {
        return a + b;
    }

    // Subtraktion
    int sub(int a, int b) {
        return a - b;
    }

    // Multiplikation
    int mul(int a, int b) {
        return a * b;
    }

    // Division
    int div(int a, int b) {
        if (b == 0) {
            System.out.println("Division durch 0 ist nicht möglich");
            return 0;
        }

        return a / b;
    }

    // Modulo / Restwert
    int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Modulo durch 0 ist nicht möglich");
            return 0;
        }

        return a % b;
    }
}