package day3;

public class Vowels {

    public static void counts(String message, int check ,int countvow, int countCon){
        if(check<message.length()){
            if(message.charAt(check)=='a'||message.charAt(check)=='e'||message.charAt(check)=='i'||message.charAt(check)=='o'||message.charAt(check)=='u')
                countvow++;
            else if(message.charAt(check)!=' ')
                    countCon++;
            check++;// iterate
            counts(message, check, countvow, countCon);
        }
        else{
            System.out.println("Vowels "+countvow);
            System.out.println("Consonants: "+countCon);
            return;
        }
    }

    public static void main(String[] args) {
        String message = "Hello AI"; int countVowels = 0, countCons = 0;
        message=message.toLowerCase();// immutable
        counts(message, 0,countVowels, countCons);// init
        // for(int index = 0;index < message.length();index++){
        //     if(message.charAt(index)=='a'||message.charAt(index)=='e'||message.charAt(index)=='i'||message.charAt(index)=='o'||message.charAt(index)=='u')
        //         countVowels++;
        //     else if(message.charAt(index)!=' ')
        //         countCons++;
        // }
        
    }
}
