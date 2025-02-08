package day2;

import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        // account balance
        // int[] myStatement = {100, 200, 300, 100, 100, 100, 300, 200, 100, 100};
        // int[] myStatement = {10, 20, 30, 10, 10, 10, 30, 20, 10, 10};
        int[] myStatement = {-7, 1, 5, 2, -4, 3, 0};
        int sum = Arrays.stream(myStatement).sum();
        // int sum = 0;
        // for(int idx=0;idx<myStatement.length;idx++){
        //     sum += myStatement[idx];
        // }
        System.out.println("Sum is: "+sum);
        int partialSum = 0;
        for(int index = 0; index<myStatement.length;index++){
            sum -= myStatement[index];
            System.out.println("PArtial Sum "+partialSum+" Total SUm "+sum);
            if(partialSum == sum){
                System.out.println("Equilibrium Day of transactions is "+index);
                return;
            }
            partialSum += myStatement[index];
        }
        System.out.println("Can't find Equilibrium day");
    }
}
