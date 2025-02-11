package day4;

import java.util.Scanner;

public class FactViaDP {
    public static int fact(int limit){
        int[] poss = new int[limit+1];
        poss[0] = 1;

        // find least solution to final solution
        for(int index = 1; index <= limit; index++){
            poss[index] = index * poss[index-1];
        }

        return poss[limit];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Tell us number to find factorial ");
        int limit = scanner.nextInt();
        System.out.println(fact(limit));

        scanner.close();
    }
}
