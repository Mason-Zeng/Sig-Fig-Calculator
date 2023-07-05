import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Put in a number to calculate the # of sig figs");
        String n= scan.nextLine();
        numbers test = new numbers(n);
        test.leadZero();
        test.trailZero();
        test.numSig();
        System.out.println(test);
    }
}
