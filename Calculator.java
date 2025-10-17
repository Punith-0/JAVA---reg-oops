import java.util.* ;
import java.lang.* ;

class Main {
    public static void main(String[] argsS){
        Scanner sc = new Scanner(System.in);
        System.out.println("A new type of calculator'");
        for(;;) {
            System.out.println("");
            System.out.println("Enter your choice :");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Other choices to EXIT >>>>");
            System.out.print("\nEnter your choice :");
            int choice = sc.nextInt();

            int a = 0; int b = 0;
            if(choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                System.out.print("Enter the Number 1 and 2 :");
                a = sc.nextInt();
                b = sc.nextInt();
            }
            int result = 0 ;
            switch (choice) {
                case 1:
                    result = a + b;
                    System.out.println("The Result of Addition is : " + result);
                    break;
                case 2:
                    result = a - b;
                    System.out.println("The Result of Subtraction is : " + result);
                    break;
                case 3:
                    result = a * b;
                    System.out.println("The Result of Multiplication is : " + result);
                    break;
                case 4:
                    if(b == 0){
                        result = 0;
                        System.out.println("The Result of Division is : " + result);
                    }
                    else {
                        result = a / b;
                        System.out.println("The Result of Division is : " + result);
                    }
                    break;
                default:
                    System.out.println("Wrong choice");
                    System.out.println("EXITING ......");
                    System.exit(0);
                    break;
            }
        }

    }
}