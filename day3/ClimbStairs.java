package day3;

public class ClimbStairs {
    public static int findPossible(int total){
        if(total<=0)
            return 0;
        else if(total==1)
            return 1;
        else if(total==2)
            return 2;
        else
            return findPossible(total-1)+findPossible(total-2);
    }
    public static void main(String[] args) {
        int steps = 5;
        System.out.println(findPossible(steps));
    }
}
