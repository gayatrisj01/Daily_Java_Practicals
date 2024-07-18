/*Q.Write a program in Java to accept the name of an employee and his/her annual income. Pass the name and the annual income. Displays the name of the employee and the income tax as per the given tariff:
Annual Income						Income Tax
Up to ₹2,50,000                       No tax
₹2,50,001 to ₹5,00,000			  10% of the income exceeding ₹2,50,000
₹5,00,001 to ₹10,00,000           ₹30,000 + 20% of the amount exceeding ₹5,00,000
₹10,00,001 and above			  ₹50,000 + 30% of the amount exceeding ₹10,00,000
*/
import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting employee name
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        // Accepting annual income
        System.out.print("Enter annual income: ₹");
        double income = scanner.nextDouble();

        // Calculate income tax
        double tax = calculateTax(income);

        // Display employee name and income tax
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Income Tax: ₹" + tax);

        scanner.close();
    }

    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.1;
        } else if (income <= 1000000) {
            tax = 30000 + (income - 500000) * 0.2;
        } else {
            tax = 50000 + (income - 1000000) * 0.3;
        }

        return tax;
    }
}

/*
Output:-
Enter employee name: Gayatri Jadhav
Enter annual income: ₹ 400000


Output 2:-
Enter employee name: Gayatri Jadhav
Enter annual income: ₹200000
Employee Name: Gayatri Jadhav
Income Tax: ₹0.0
*/
