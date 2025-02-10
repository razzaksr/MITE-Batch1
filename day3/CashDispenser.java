package day3;

public class CashDispenser {
    public static int currencyCount(int[] arr, int requested, int index, int count){
        if(requested<=0||index<0)
            return requested>0?-1:count;
        else{
            if(requested>=arr[index]){
                requested -= arr[index];
                count++;
            }
            else{
                index--;
            }
            return currencyCount(arr, requested, index, count);
        }
    }
    public static void main(String[] args) {
        int[] denom = {100,200,500};
        int required = 8700;
        System.out.println(currencyCount(denom, required, denom.length-1, 0));
    }
}
