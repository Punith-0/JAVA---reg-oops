import java.util.*;
import java.lang.*;
public class enhanced_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        For integers
        int[] a  = {1 , 3 , 5 ,7 ,9} ;
        for(int i : a)
            System.out.println(i);
//        For strings
        String[] Fruits = {"Banana" , "Apple" , "Pineapple" , "Peach" , "Kiwi" , "Mango"};
        for(String i: Fruits)
            System.out.println(i);
    }
}
