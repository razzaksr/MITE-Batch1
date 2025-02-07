package Day1;

public class UpdateTax {
    public static void main(String[] args) {
        // required data
        double[] income = {12.5,9.2,4.5,19.5,2.5,56.8, 4.5,19.8,6.7,1.9};
        int size = income.length;
        // linear
        for(int index = 0;index<size;index++){
            if(income[index]>=4&&income[index]<8)
                income[index]-=(income[index]*0.050);
            else if(income[index]>=8&&income[index]<12)
                income[index]-=(income[index]*0.100);
            else if(income[index]>=12&&income[index]<16)
                income[index]-=(income[index]*0.150);
            else if(income[index]>=16&&income[index]<20)
                income[index]-=(income[index]*0.200);
            else if(income[index]>=20&&income[index]<24)
                income[index]-=(income[index]*0.250);
            else if(income[index]>=24)
                income[index]-=(income[index]*0.300);
            
            System.out.println(income[index]);
        }
    }
}
