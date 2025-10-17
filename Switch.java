import java.util.* ;
import java.lang.* ;

/* we can Add the empty for loop in the program to run it for an infinite number of times
but a proper buffer/exit statement should be provided a different program Switch V2 contains all the
changes dont forget to check that out
 */
class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student marks :");
        int marks = sc.nextInt();
        int grade = marks / 10;
        switch(grade){
            case 10 , 9 :
                System.out.println("NOT OK (ASIAN MOM) || GENIUS (US)");
                System.out.println("GRADE 'A'");
                break;
            case 8 :
                System.out.println("DISGRACE(ASIA) || OH YEAH!! (US)");
                System.out.println("GRADE 'B'");
                break;
            case 7 :
                System.out.println("Kicked Out(ASIA) || WELL DONE (US PARENTS) :");
                System.out.println("GRADE 'C'");
                break;
            case 6 :
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
