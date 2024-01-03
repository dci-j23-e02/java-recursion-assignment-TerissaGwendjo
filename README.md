# Java Recursion Assignment

In this assignment, you will be working with the concept of recursion in Java. You will be implementing recursive functions to find the maximum grade, the minimum grade, and calculate the average grade from an array of grades.

## Problem Statement

You have an array of grades from a math exam. Your task is to write recursive functions in Java that find the maximum grade, the minimum grade, and calculate the average grade from this array.

## Starter Code

Here is some starter code to help you begin:

```java
public class Main {
    static int findMax(int grades[], int n) {
        // Your code goes here
    }

    static int findMin(int grades[], int n) {
        // Your code goes here
    }

    static int sumGrades(int grades[], int n) {
        // Your code goes here
    }

    static double averageGrade(int grades[], int n) {
        // Your code goes here
    }

    public static void main(String[] args) {
        int grades[] = {85, 90, 78, 92, 88};
        int n = grades.length;
        System.out.println("The maximum grade is " + findMax(grades, n));
        System.out.println("The minimum grade is " + findMin(grades, n));
        System.out.println("The average grade is " + averageGrade(grades, n));
    }
}
```

## Requirements

1. Your `findMax` function should find the maximum grade in the array.
2. Your `findMin` function should find the minimum grade in the array.
3. Your `sumGrades` function should calculate the sum of all grades in the array.
4. Your `averageGrade` function should calculate the average grade of the students.

All these functions should use recursion to achieve their tasks.

## Expected Output

When you run this program, it should print:

```
The maximum grade is 92
The minimum grade is 78
The average grade is 86.6
```

## Submission

Once you have completed your assignment, submit your .java file for grading. Make sure your code is properly formatted and commented.

Good luck!
