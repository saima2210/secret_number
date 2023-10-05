import java.util.Scanner;
public class SecretNumber {
    public static void main(String[] args) {
        System.out.println("Guess a number between 1 and 50:");

        Scanner reader = new Scanner(System.in);
        int secretNumber = reader.nextInt();

        if (secretNumber == 22){
            System.out.println("You guessed correct!");
        } else if (secretNumber < 20){
            System.out.println("Number too low");
        } else if (secretNumber > 24) {
            System.out.println("Too high");
        } else {
            System.out.println("So close!");
        }

    }
}
