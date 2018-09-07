import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        int inData;
        Scanner scan = new Scanner(System.in);
        double tax = 0;
        double ChildDiscount = 0;
        double AgeDiscount = 0;

        System.out.println("Enter your yearly salary: ");
        inData = scan.nextInt();
        int Salary = inData;

        if (Salary >= 0) {
            tax = tax + 0;
        }
        if (Salary >= 10000) {
            tax = tax + 10;
        }
        if (Salary >= 25000) {
            tax = tax + 20;
        }
        if (Salary >= 75000) {
            tax = tax + 30;
        }
        if (Salary >= 250000) {
            tax = tax + 40;
        }

        System.out.println("How many children do you have: ");
        inData = scan.nextInt();
        int Children = inData;

        if (Children >= 1) {
            ChildDiscount = ChildDiscount + 1000;
        }
        while (Children >= 2.5) {
            Children = Children - 1;
            ChildDiscount = ChildDiscount + 500;
        }

        System.out.println("Enter your age: ");
        inData = scan.nextInt();
        int age = inData;

        if (age > 0 && age < 15) {
            AgeDiscount = 50;
        }
        if (age > 16 && age < 21) {
            AgeDiscount = 25;
        }
        if (age > 22 && age < 63) {
            AgeDiscount = 0;
        }
        if (age > 64 && age < 72) {
            AgeDiscount = 33;
        }
    }
}