package day4;

import java.util.Scanner;

public class FiboViaDP {

    // limit = 5
    public static int series(int limit){
        if(limit<=1)
            return 1;
        // size = 6
        int[] poss = new int[limit+1];
        // init 0 and 1
        poss[0]=0;poss[1]=1;
        
        // find the solutions to obtain final result in the last index
        for(int index = 2; index<=limit; index++){
            poss[index] = poss[index-1]+poss[index-2];
        }

        return poss[limit];// poss[5]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell us fibo series length ");
        int limit = scanner.nextInt();
        System.out.println(series(limit));


        scanner.close();
    }
}
