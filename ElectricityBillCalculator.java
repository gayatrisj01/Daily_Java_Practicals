/*
 1.Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill 
 with the help of the below charges: 
 
·      1 to 100 units – Rs. 10/unit
·      100 to 200 units – Rs. 15/unit
·      200 to 300 units – Rs. 20/unit
·      above 300 units – Rs. 25/unit
     Input: U = 250 
    Output: 3500 
 */
public class ElectricityBillCalculator {

    public static int calculateBill(int units) {
        int bill = 0;

        if (units <= 100) {
            bill = units * 10;
        } else if (units <= 200) {
            bill = 100 * 10 + (units - 100) * 15;
        } else if (units <= 300) {
            bill = 100 * 10 + 100 * 15 + (units - 200) * 20;
        } else {
            bill = 100 * 10 + 100 * 15 + 100 * 20 + (units - 300) * 25;
        }

        return bill;
    }

    public static void main(String[] args) {
        int U = 250;
        System.out.println("Electricity bill: " + calculateBill(U));
    }
}


/*Output:-
Electricity bill: 3500
*/