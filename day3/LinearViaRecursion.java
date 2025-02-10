package day3;

public class LinearViaRecursion {
    public static int linear(double[] arr, double lookingFor, int index){
        if(index==arr.length)
            return -1;
        else{
            if(arr[index]==lookingFor)
                return index;
            else
                return linear(arr, lookingFor, index+1);
        }
    }
    public static void main(String[] args) {
        double[] arr = {2.5,9.2,4.5,19.5,2.5,56.8};
        System.out.println(linear(arr, 9.5, 0));
    }
}
