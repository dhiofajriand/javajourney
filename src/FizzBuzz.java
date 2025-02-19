import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        int number;
        String outputText;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number : ");
        number = scanner.nextInt();

        boolean isFizz = number%3==0;
        boolean isBuzz = number%5==0;
        boolean isFizzBuzz = isBuzz && isFizz;

        outputText = isFizzBuzz ? "FizzBuzz" :
                (isBuzz ? "Buzz" :
                        (isFizz ? "Fizz" : String.valueOf(number)));

        System.out.println(outputText);
    }
}
