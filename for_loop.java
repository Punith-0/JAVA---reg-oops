// for loop syntax for(initialization ; condition ; increment)

import java.util.*;
public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number :");
        int start = sc.nextInt();
        System.out.print("Enter end number :");
        int end = sc.nextInt();
        for(int i = start; i <= end; i++){
            System.out.println(i);
        }
        for(int i = start; i <= end; i+= 2){
            System.out.println(i);
        }
        sc.close();
    }
}
