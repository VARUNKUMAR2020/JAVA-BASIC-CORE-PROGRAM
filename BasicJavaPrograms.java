import java.util.*;
public class BasicJavaPrograms {
    public static void main(String[] args) throws Exception {
        System.out.println("Java - Basic Programs: ");
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check its Prime Factors ::");
        number = input.nextInt();
        System.out.println("Prime Factors :");
        for(int i = 2; i< number; i++) {
           while(number%i == 0) {
              System.out.println(i+" ");
              number = number/i;
           }
        }
        if(number >2) {
           System.out.println(number);
        }
    }
}
