import java.util.*;
// so here we have the if else fi and else statement this is a much more efficient statement
// this helps by avoiding to write multiple if statements

/* The different print statements in java
    System.out.println(""); --> the print statement which prints a new line character with its execution
    System.out.printf("");  --> Used for formatted printing
    System.out.print(""); --> does not include a new line character in its execution
*/
public class if_elif_else {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.println("Enter the student marks : ");
            int marks = sc.nextInt();
            if (marks == -1) {
                System.out.println("EXITING ...");
                System.exit(0);
            } else if (marks > 100 || marks < 0)
                System.out.println("INVLAID MARKS");
            else {
                sc.close() ;
                if (marks >= 85)
                    System.out.printf("A+ Grade , marks = %d ", marks);
                else if (marks < 85 && marks > 70)
                    System.out.printf("A Grade , marks = %d ", marks);
                else if (marks <= 70 && marks > 64)
                    System.out.printf("B Grade , marks = %d ", marks);
                else if (marks <= 64 && marks > 45)
                    System.out.printf("C Grade , marks = %d ", marks);
                else if (marks <= 45 && marks >= 33)
                    System.out.printf("D Grade , marks = %d ", marks);
                else
                    System.out.printf(" Failed , marks = %d", marks);
            }
            sc.close();
        }
    }
}
