import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
        int max=5, attempt=0,range=100;
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * range);
        int user_num = 0;
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("You have to choose a number between 1 and " + range + ".");
        System.out.println("You have " + max + " attempts to guess it.\n");
        while (attempt<max){
            attempt++;
            System.out.print("Guess the number: ");
            user_num = sc.nextInt();
            if (user_num == num) {
                System.out.println("\nCORRECT GUESS!!!...CONGRATULATION");
                break;
            } else if (user_num > num) {
                System.out.println("Your number is large.");
            } else {
                System.out.println("Your number is small.");
            }
        }
        if (attempt == max){
            System.out.println("\nGame over! You couldn't guess the number.");
        }
        System.out.print("The actual number is: ");
        System.out.println(num);
    }
}
