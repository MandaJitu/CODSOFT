import java.util.Random;
import java.util.Scanner;
public class Number_game{
    public static void main(String[] args){
        Random number = new Random();
        int Random_number = number.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        while(true){
            System.out.println("Enter a number between 1 to 100: ");
            int Guess_number = sc.nextInt();
            attempts = attempts+1;
        if(Random_number == Guess_number){ 
            System.out.println("Yes! Your guess is correct.");
            System.out.println("Your total number of attempts are: "+ attempts);
            break;
        }
        else if(Random_number > Guess_number){
            System.out.println("Ohh! Your guess is Low.");
        }
        else{
            System.out.println("Ohh! Your guess is high.");
        }
       }
        sc.close();
    }
    
}