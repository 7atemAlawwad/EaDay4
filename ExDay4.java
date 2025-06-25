import java.util.Scanner;

public class ExDay4 {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
//        1.Write a program that prints the numbers from 1 to 100 such that:
//        If the number is a multiple of 3, you need to print "Fizz" instead of that number.
//        If the number is a multiple of 5, you need to print "Buzz" instead of that number.
//        If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.

        for (int i = 1; i <= 100; i++) {
            if      (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3  == 0) System.out.println("Fizz");
            else if (i % 5  == 0) System.out.println("Buzz");
            else                  System.out.println(i);
        }

//        2.Write a Java program to reverse a string.
//        Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT

        String text = s.nextLine();
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Reverse string: " + reversed);

//        3.Write a program to find the factorial value of any number entered through the keyboard.

        int n = s.nextInt();
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        System.out.println("Factorial of " + n + " = " + fact);


//        4.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

        System.out.print("Base: ");
        int base = s.nextInt();
        System.out.print("Exponent: ");
        int exp  = s.nextInt();
        int result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        System.out.println(base + "^" + exp + " = " + result);

//        5.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        System.out.print("How many numbers? ");
        int count = s.nextInt();

        int sumEven = 0, sumOdd = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Number " + i + ": ");
            int n2 = s.nextInt();
            if (n2 % 2 == 0) sumEven += n2; else sumOdd += n2;
        }
        System.out.println("Sum of even = " + sumEven);
        System.out.println("Sum of odd  = " + sumOdd);

//        6.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.

        System.out.print("Enter an integer ≥ 2: ");
        int n1 = s.nextInt();
        boolean prime = n1 > 1;
        for (int i = 2; prime && i * i <= n1; i++)
            if (n1 % i == 0) prime = false;
        System.out.println(n1 + (prime ? " is prime" : " is not prime"));

//        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
//        Expected Output:
//        Week 1 Day1 Day2 Day3 Day4 Day5 Day6 Day7 Week 2 Day1 Day2

        System.out.print("Number of weeks: ");
        int weeks = s.nextInt();
        System.out.print("Days per week : ");
        int days  = s.nextInt();

        for (int w = 1; w <= weeks; w++) {
            System.out.println("Week " + w);
            for (int d = 1; d <= days; d++)
                System.out.println("Day" + d);
            System.out.println();
        }

//        8.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.

        System.out.print("Enter a word or phrase: ");
        String text1 = s.nextLine();
        String clean = text1.replaceAll("\\s+", "").toLowerCase();
        String rev   = new StringBuilder(clean).reverse().toString();
        System.out.println(text1 + (clean.equals(rev) ? " is a palindrome"
                : " is not a palindrome"));


    }
}
