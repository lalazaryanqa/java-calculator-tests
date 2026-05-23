# Java Calculator Tests

Ein einfaches Java-Rechnerprojekt zur Übung von Java-Grundlagen, objektorientierter Programmierung (OOP) und grundlegenden Testkonzepten.

## Features

- Addition
- Subtraktion
- Multiplikation
- Division
- Modulo-Operation
- Benutzereingabe mit `Scanner`
- Konsolenanwendung
- Einfache Projektstruktur

---

## Technologien

- Java
- Maven
- Git & GitHub

---

## Projektstruktur

```bash
src/
└── main/
    └── java/
        └── calculator/
            ├── Calculator.java
            ├── Main.java
            └── UserMain.java
```

---

## Klassenübersicht

### Calculator.java

Enthält die grundlegenden mathematischen Operationen:

- add()
- sub()
- mul()
- div()
- mod()

Mit einfacher Fehlerbehandlung für Division durch Null.

---

### Main.java

Demonstriert die Funktionen des Rechners mit festen Werten.

---

### UserMain.java

Interaktive Konsolenanwendung mit Benutzereingabe über `Scanner`.

Unterstützte Operationen:

```bash
+
-
*
/
%
```

---

## Beispielcode

```java
Calculator calc = new Calculator();

System.out.println(calc.add(10, 5));
System.out.println(calc.sub(10, 5));
System.out.println(calc.mul(10, 5));
System.out.println(calc.div(10, 5));
```

---

## Lernziele

Dieses Projekt wurde erstellt zur Übung von:

- Java-Grundlagen
- Objektorientierter Programmierung
- Methoden und Klassen
- Konsolenanwendungen
- Git & GitHub

---

## Projekt starten

Repository klonen:

```bash
git clone https://github.com/lalazaryanqa/java-calculator-tests.git
```

Projekt starten mit:

- IntelliJ IDEA
- Eclipse
- VS Code

---

## Geplante Erweiterungen

- JUnit-Tests
- GUI-Version
- Erweiterte Fehlerbehandlung
- Maven-Testintegration

---

## Autor

Albert Lalazaryan

GitHub:  
https://github.com/lalazaryanqa

---

## Lizenz

MIT License