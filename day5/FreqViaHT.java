package day5;

import java.util.Hashtable;

public class FreqViaHT {
    public static void main(String[] args) {
        int[] transactions = {800,1200,4500,320,600,800,560,4500,12000,320};

        Hashtable<Integer, Integer> myTable =new Hashtable<>();

        for(int index = 0;index<transactions.length;index++){
            int currentAmount = transactions[index];
            int currentOccurance = myTable.getOrDefault(currentAmount, 0);
            myTable.put(currentAmount, currentOccurance+1);
        }

        System.out.println(myTable);
    }
}
