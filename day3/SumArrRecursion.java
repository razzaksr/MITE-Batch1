package day3;

public class SumArrRecursion {
    public static double findSum(double[] arr, int index, double sum){
        if(index==arr.length)
            return sum;
        else{
            sum += arr[index];
            index++;
            return findSum(arr, index, sum);
        }
    }
    public static void main(String[] args) {
        double[] array = {2.5,9.2,4.5,19.5,2.5,56.8};
        // double[] array = {-7, 1, 5, 2, -4, 3, 0};
        double receivedSum = findSum(array, 0, 0);
        System.out.println(receivedSum);
    }
}
