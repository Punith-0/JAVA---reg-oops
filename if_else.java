import java.util.Scanner ; // -->importing the module -->
/*   as u have seen in the previous topic we have used Scanner class this scanner class is
    something that lets u take the input from the user the Scanner class for strings we will discuss
    in the later sessions
 */
//    for the Scanner class we have to import the java.util module u can just import it by
//    import java.util.Scanner (or) import java.util.* ,,  The * imports all the things from the util class
//    for using it as yall already know we have to define a Scanner object
//    for eg Scanner sc = new Scanner(System.in) ;

class if_else{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student marks : ");
        int marks = sc.nextInt();
//      sc.next(data_type) to take the input from the user ;
        if(marks >= 35)
            System.out.println("The student has passed the exam .");
        else
            System.out.println("The student failed the exam .");
        sc.close();
    }
}

