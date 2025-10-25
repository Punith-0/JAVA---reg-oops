import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the end value :");
        int end = sc.nextInt();
        int i = 0 ;
        System.out.print("Enter the step value :");
        int step = sc.nextInt();
        while(i != end) {
            System.out.println(i);
            i = i + step;
        }
    }
}
