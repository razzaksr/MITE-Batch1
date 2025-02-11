package day4;

import java.util.Arrays;

public class WordConversionViaDP {
    public static int convert(String src, String dest){
        int rowSize = src.length()+1;
        int colSize = dest.length()+1;
        int[][] poss = new int[rowSize][colSize];

        // initialize 1st column with default value
        for(int row = 0;row<rowSize;row++){
            poss[row][0] = row;
        }
        // initialze 1st row with default value
        for(int col=0;col<colSize;col++){
            poss[0][col]=col;
        }
        
        return poss[rowSize-1][colSize-1];
    }
    public static void main(String[] args) {
        String source = "horse";
        String dest = "ros";
        System.out.println(convert(source, dest));
    }
}
