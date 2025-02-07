package Day1;

import java.util.Arrays;

public class Reading {
    public static void main(String[] args) {
        // initializing Item names in String array
        String[] kartItems = {"IPhone 15Pro","HP Pavilion","Water Bootle","Boat Smartwatch","Lakme Facewash","Sandisk Pendrive","Nike Casual Shoe","Hitachi SSD"};
        // O(n) time complexity
        // int size = kartItems.length;
        // for(int index=0;index<size;index++){
        //     System.out.println(kartItems[index]);// 
        // }
        // System.out.println(Arrays.toString(kartItems));
        Arrays.stream(kartItems).forEach(System.out::print);
    }
}
