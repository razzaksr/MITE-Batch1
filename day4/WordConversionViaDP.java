package day4;

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
        

        // find min or diagonal for comparison
        for(int row=1;row<rowSize;row++){
            for(int col=1;col<colSize;col++){
                if(src.charAt(row-1)==dest.charAt(col-1)){
                    poss[row][col] = poss[row-1][col-1];
                }
                else{
                    poss[row][col] = 1+Math.min(Math.min(poss[row-1][col-1],poss[row-1][col]),
                    poss[row][col-1]);
                }
            }
        }

        return poss[rowSize-1][colSize-1];
    }
    public static void main(String[] args) {
        String source = "horse";
        String dest = "ros";
        System.out.println(convert(source, dest));
    }
}
