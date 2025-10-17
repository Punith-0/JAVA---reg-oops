import java.util.* ;
import java.lang.* ;

/* The updated code which runs on infinite concept in place of for(;;) a while(1) could be used
the for(;;) is faster and much more efficient with time complexities
 */
class SwitchV2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.print("Enter the student marks (-1 to exit) :");
            int marks = sc.nextInt();
            if (marks == -1) {
                System.out.println("EXITING ...");
                break;
            }
            int grade = marks / 10 ;

            switch (grade) {
                case 10, 9:
                    System.out.println("NOT OK (ASIAN MOM) || GENIUS (US)");
                    System.out.println("GRADE 'A'");
                    break;
                case 8:
                    System.out.println("DISGRACE(ASIA) || OH YEAH!! (US)");
                    System.out.println("GRADE 'B'");
                    break;
                case 7:
                    System.out.println("Kicked Out(ASIA) || WELL DONE (US PARENTS) :");
                    System.out.println("GRADE 'C'");
                    break;
                case 6:
                    System.out.println("Failed (ASIA) || PARTY(US) ");
                    System.out.println("GRADE 'D'");
                    break;
                default:
                    System.out.println("Dead for Family(ASIA) || U Cannot play basketball(US)");
                    System.out.println("GRADE 'F'");
                    break;
            }
        }
    }
}
