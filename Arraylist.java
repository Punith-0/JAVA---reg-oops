import java.util.*;

import static java.lang.System.* ;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        ArrayList<String> Name = new ArrayList<>() ;
        out.print("Enter number of items in array :");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            out.print("\nEnter name  :");
            String name = sc.next();
            Name.add(name);
        }
        for(String i : Name)
            out.println(i);
    }
}
