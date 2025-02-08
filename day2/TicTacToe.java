package day2;

public class TicTacToe {
    public static void main(String[] args) {
        // String initial = "XXX";
        String initial = "XXOX";
        int move=0;
        for(int index=0;index<initial.length();){
            if(initial.charAt(index)=='X'){
                index+=3;
                move++;
            }
            else
                index++;
        }
        System.out.println(move);
    }
}
