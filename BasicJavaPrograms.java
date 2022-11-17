import java.util.*;;

public class BasicJavaPrograms {
    public static void main(String[] args) throws Exception {
        System.out.println("Java - Basic Programs: ");

        System.out.println("Enter the Nth Harnomic Number \nTo print the series of form 1/1 + 1/2 + .... +1/n ::");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double series = 0;
        
        //condition not to be zero:
        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                double harmonic = (1.0 / i);
                System.out.printf("1/" + i + " = " + "%.2f", harmonic); //.2f return your variable (value) with 2 decimal place
                System.out.println("");
                series = series + harmonic; // adding the values
            }
            System.out.printf("Sum of the Harmonic Series is: %.2f ", series);
        } else
            System.out.println("Number cannot be zero.");
    }
}
