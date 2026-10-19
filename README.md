# Homework — Simple Calculator

## Overview

Create a Java program that performs basic arithmetic using your own methods for addition, subtraction, multiplication, and division. This assignment covers writing multiple methods and calling them from `main`.

**File / class name:** `SimpleCalculator.java`

---

## Requirements

- Write four static methods, each accepting two `double` parameters and returning a `double`:
  ```java
  public static double add(double a, double b)
  public static double subtract(double a, double b)
  public static double multiply(double a, double b)
  public static double divide(double a, double b)
  ```
- In `main`, use the following values:
  ```text
  a = 20.0
  b = 4.0
  ```
- Call all four methods from `main` and store each result in a variable.
- Each calculation must happen inside its method, not in `main`.
- Display each result with two decimal places using `printf`.

---

## Expected Output

```text
Simple Calculator
------------------
20.00 + 4.00 = 24.00
20.00 - 4.00 = 16.00
20.00 * 4.00 = 80.00
20.00 / 4.00 = 5.00
```

---

## Restrictions

- No arrays, `ArrayList`, loops, conditionals, or user input.
- No external libraries or additional classes.
- Do not hard-code the results — they must be calculated inside the methods.
- Do not perform the calculations directly in `main`.

---

## Compile & Run

```bash
javac SimpleCalculator.java
java SimpleCalculator
```

---

