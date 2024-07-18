//Q.Write a program to find the Total marks and grade of a students from the given students marks using switch case
import java.util.Scanner;

	public class GradeOfStudent {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input marks for five subjects
	        System.out.print("Enter marks for Subject 1: ");
	        int subject1 = scanner.nextInt();
	        System.out.print("Enter marks for Subject 2: ");
	        int subject2 = scanner.nextInt();
	        System.out.print("Enter marks for Subject 3: ");
	        int subject3 = scanner.nextInt();
	        System.out.print("Enter marks for Subject 4: ");
	        int subject4 = scanner.nextInt();
	        System.out.print("Enter marks for Subject 5: ");
	        int subject5 = scanner.nextInt();

	        // Calculate total marks
	        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

	        // Determine grade using switch case
	        char grade;
	        switch (totalMarks / 50) { // Assumes each subject is out of 100, hence total is out of 500
	            case 10:
	            case 9:
	                grade = 'A';
	                break;
	            case 8:
	                grade = 'B';
	                break;
	            case 7:
	                grade = 'C';
	                break;
	            case 6:
	                grade = 'D';
	                break;
	            default:
	                grade = 'F';
	                break;
	        }

	        // Output total marks and grade
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Grade: " + grade);
	    }
	}
	
	
	
/*
 Output:-
Enter marks for Subject 1: 98
Enter marks for Subject 2: 67
Enter marks for Subject 3: 78
Enter marks for Subject 4: 96
Enter marks for Subject 5: 76
Total Marks: 415
Grade: B
*/