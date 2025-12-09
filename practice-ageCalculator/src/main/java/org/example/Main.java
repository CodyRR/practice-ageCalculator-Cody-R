package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        int yearsTill100 = 100 - age;
        System.out.println("It will be " + yearsTill100 + " before you are 100");

    }
}