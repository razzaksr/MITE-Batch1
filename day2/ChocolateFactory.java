package day2;

import java.util.Arrays;

public class ChocolateFactory {
    public static void main(String[] args) {
        int[] belt = {1, 0, 2, 3, 0, 4, 5, 0};
        int size = belt.length;
        int replace = 0;
        for(int index = 0;index<size;index++){
            if(belt[index]!=0){
                belt[replace]=belt[index];
                replace++;
            }
        }
        Arrays.fill(belt, replace, size, 0);
        System.out.println(Arrays.toString(belt));
    }
}
