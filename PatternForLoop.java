/*Q. WAP to display the following pattern:
        1
        1 2
        1 2 3 
        1 2 3 4
        1 2 3 4 5
        */

class PatternForLoop {
  public static void main(String[] args) {
   //Write Variable with No. of rows
    int rows = 5;

    // outer loop 
    for (int i = 1; i <= rows; ++i) {

      // inner loop to print the numbers
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }
}



/*
Output:-
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/