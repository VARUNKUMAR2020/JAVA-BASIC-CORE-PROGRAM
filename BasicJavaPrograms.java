public class BasicJavaPrograms {
    public static void main(String[] args) throws Exception {
        System.out.println("Java - Basic Core Programs: ");

        System.out.println("COIN FLIP");
        double tails= 0;
        double heads = 0;
        for (int i = 1; i <= 10; i++) {
            double flip = Math.random(); //Random-To get value 0.0 to 0.9
            System.out.println("coin " + flip);

            // condition 
            if (flip < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        // Calculating the percentage:
        double percentageheads = (heads / 10) * 100;
        double percentagetails = (tails / 10) * 100;

        // Display of the percentage:
        System.out.println("No.of.Heads "+heads+ " percentage is " + percentageheads);
        System.out.println("No.of.Tails "+tails+" percentage is " + percentagetails);
    }
}
